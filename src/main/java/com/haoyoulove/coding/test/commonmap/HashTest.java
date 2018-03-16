package com.haoyoulove.coding.test.commonmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author yangjing
 */
public class HashTest {

	public static void main(String args[]){
		Map<String, Object> ht = new Hashtable<>();

//		ht.put(null,"123");
//
//		System.out.println(ht);

		//0x7fffffff
//		System.out.println(Integer.toBinaryString(Integer.valueOf("7FFFFFFF",16)) );

//		Object key = "test";
//
//		System.out.println(Integer.toBinaryString(key.hashCode()));
//		int hash = key.hashCode();
//		System.out.println((hash & 0x7FFFFFFF) % 11);

		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = ++j;
		}
		System.out.println(j);

		Map<String, Object> map = new HashMap<>();
		map.put(null,null);
		System.out.println(map);

	}
}
