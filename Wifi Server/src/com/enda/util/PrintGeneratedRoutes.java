package com.enda.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PrintGeneratedRoutes<K, V> {
    private Map<K, V> map;

    public PrintGeneratedRoutes(Map<K, V> map) {
        this.map = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Entry<K, V>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Entry<K, V> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());

            if (iter.hasNext()) {
                sb.append("\r\n");
            }
        }
        return sb.toString();

    }
}
