package com.haoyoulove.coding.test;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * @author yangjing
 */
public class BiConsumerTest {

	public static void main(String[]  args){
		Map<String, Object> map = new HashMap<>(4);
		map.put("test", 1);
//		map.put("test2", 2);


		//自定义传入的参数进行操作
		BiConsumer<String, Object> bic = new BiConsumer<String, Object>() {
			@Override
			public void accept(String s, Object o) {
				System.out.println("k: "+s +", o: "+ o);
			}
		};

		BiConsumer<String, Object> bic2 = (s, o) ->
				System.out.println("k2: "+s +", o2: "+ o);

		BiConsumer<String, Object> bic3 = bic.andThen(bic2);

		map.forEach(bic3);




		List<String> list = new ArrayList<>();

		list.sort((o1, o2) -> {
			int i1 = Integer.valueOf(o1);
			int i2 = Integer.valueOf(o2);
			return i1 - i2;
		}
		);
	}
}
