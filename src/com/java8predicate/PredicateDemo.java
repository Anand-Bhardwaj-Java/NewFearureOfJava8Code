package com.java8predicate;

import java.util.Arrays;

public class PredicateDemo {
public static void main(String[] args) {
	int[]arr= {10,20,8,17,28,30,25,60,50};
	Arrays.stream(arr).filter(num->num>=30).forEach(System.out::println);
	/*Predicate<Integer>p=num->num>=25;
	for (int i : arr) {
		if (p.test(i)) {
		System.out.println(i);	
		}
	}*/
	/*String[]names= {"Anand","ankur","Ram","radha"};
	Predicate<String>p=name->name.toLowerCase().startsWith("a");
	for (String string : names) {
		if (p.test(string)) {
			System.out.println(string);
		}
	}*/
	//Arrays.stream(names).filter(n->n.toUpperCase().startsWith("R")).forEach(System.out::println);
}
}
