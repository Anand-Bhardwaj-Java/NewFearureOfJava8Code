package com.predefinedfunctionalinterfacecode;

import java.util.StringJoiner;

public class StringJoinerExam {
	public static void main(String[] args) {
		StringJoiner sj1=new StringJoiner("-");
		sj1.add("Ram");
		sj1.add("Lakshman");
		sj1.add("Bharat");
		sj1.add("Satrudhan");
		System.out.println(sj1);
	}
}
