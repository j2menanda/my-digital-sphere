package org.kramatas.digital.sphere.cache;

//import lombok.Data;

//@Data
public class Element {
    private /*final*/ String key;

    private /*final*/ String value;

    private Element previous;
    private Element next;

    public Element(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
