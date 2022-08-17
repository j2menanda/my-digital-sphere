package org.kramatas.digital.sphere.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private final Map<String, Element> cache;
    private final int size;

    private Element head = null;
    private Element tail = null;

    public LRUCache(int size) {
        this.cache = new HashMap<>();
        this.size = size;
    }

    public String get(String key) {
        Element e = cache.get(key);
        if(e == null) {
            return null;
        }
        //this.deleteElementFromList(e);
        //this.setListHead(e);

        return e.getValue();
    }

    public void put(String key, String value) {
        Element e = cache.get(key);
        if(e != null) {
            e.setValue(value);
            //this.deleteElementFromList(e);
            //this.setListHead(e);
        } else {
            if(cache.size() >= size) {
                cache.remove(tail.getKey());
                //this.deleteElementFromList(tail);
            }
            Element element = new Element(key, value);
            cache.put(key, element);
            //this.setListHead(element);
        }
    }
}
