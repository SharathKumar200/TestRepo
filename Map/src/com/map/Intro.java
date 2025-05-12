package com.map;

public class Intro {

}
//In Java, the Map interface is part of the Java Collections Framework and represents a collection of key-value pairs. It doesn't extend Collection, which means it doesn't inherit from it like lists or sets do. Instead, Map is an interface on its own, and it provides methods for accessing and manipulating the key-value pairs in the map.
//
//The Map interface has several important subinterfaces and classes:
//
//Key Subinterfaces

//SortedMap<K, V>: Extends Map and provides additional methods to handle maps that are sorted based on the keys.
//NavigableMap<K, V>: Extends SortedMap and provides navigation methods for sorted maps.
//Key Implementing Classes

//HashMap<K, V>: Implements Map and uses a hash table to store the map entries. It does not guarantee any order of the keys.
//LinkedHashMap<K, V>: Extends HashMap and maintains the insertion order of keys, or the order in which they were last accessed if it is configured to do so.
//TreeMap<K, V>: Implements NavigableMap and uses a Red-Black tree to store the map entries in a sorted order based on the keys.
//Common Methods in the Map Interface

//V put(K key, V value): Inserts or updates the mapping for the specified key.
//V get(Object key): Returns the value associated with the specified key.
//V remove(Object key): Removes the mapping for the specified key.
//boolean containsKey(Object key): Checks if a particular key exists in the map.
//boolean containsValue(Object value): Checks if a particular value exists in the map.
//Set<K> keySet(): Returns a Set view of the keys contained in the map.
//Collection<V> values(): Returns a Collection view of the values contained in the map.
//Set<Map.Entry<K, V>> entrySet(): Returns a Set view of the mappings contained in the map.

//By using these classes and interfaces, you can effectively manage and manipulate key-value pairs in your Java applications.