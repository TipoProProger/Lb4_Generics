package com.tpc.generics.mainpackage.generics;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author michael
 */
public class MyGenericCache<K, V> {
    protected Map<K, V> storage;

    public MyGenericCache() {
        storage = new HashMap<>();
    }
    
    public V getElem(K key) throws IllegalArgumentException {
        if (storage.containsKey(key))
            return storage.get(key);
        
        throw new IllegalArgumentException("Индекс вне диапазона");
    }
    
    public int getMegaHashCode() {
        int hashCode = 0;
        for (V obj : storage.values()) {
            hashCode += obj.hashCode();
        }
        
        return hashCode;
    }
    
    public boolean containsKey(K key) {
        if (storage.containsKey(key))
            return true;
        else return false;
    }
    
    public void addElem(K key, V value) {
        if (containsKey(key))
            return;
        
        storage.put(key, value);
    }
    
}
