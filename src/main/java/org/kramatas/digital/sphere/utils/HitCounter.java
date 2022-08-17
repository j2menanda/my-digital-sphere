package org.kramatas.digital.sphere.utils;

import java.util.*;

public class HitCounter {

    private String identifier;
    private int count;

    public HitCounter(String identifier, int count) {
        this.identifier = identifier;
        this.count = count;
    }

    public List<HitCounter> getTopHitters(String[] events, int k) {
        Map<String, Integer> countTable = new HashMap<>();
        for(String event : events) {
            countTable.put(event, countTable.getOrDefault(event, 0) + 1);
        }

        PriorityQueue<HitCounter> heap = new PriorityQueue<>(Comparator.comparing(e -> e.getCount()));

        for(Map.Entry<String, Integer> entry : countTable.entrySet()) {
            heap.offer(new HitCounter(entry.getKey(), entry.getValue()));

            if(heap.size() > k) {
                heap.poll();
            }
        }
        List<HitCounter> counterList = new ArrayList<>();
        while(heap.size() > 0) {
            counterList.add(heap.poll());
        }
        return counterList;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
