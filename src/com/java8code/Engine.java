package com.java8code;
@FunctionalInterface
public interface Engine {
	public void start();
	
	default void Clean() {
		System.out.println("Engine clean");
	}
	static void stop() {
		System.out.println("Engine stop");
	}
}
