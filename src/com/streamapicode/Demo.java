package com.streamapicode;

import java.util.Arrays;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10,20,30,40,50,60);
	list.stream().filter(num->num>30).forEach(System.out::println);
	List<String> names = Arrays.asList("Ram","radha","Sita");
	names.stream().filter(name->name.toLowerCase().startsWith("r")).forEach(System.out::println);
}
}
