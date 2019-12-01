package com.tsc.aframe.utils;

import java.util.Map;
import java.util.Map.Entry;

public class Helpers {
	static public <K, V> K getKey( Map<K, V> map, V value) {
	    for (Entry<K, V> entry : map.entrySet()) {
	        if (entry.getValue().equals(value)) {
	            return entry.getKey();
	        }
	    }
	    return null;
	}
}
