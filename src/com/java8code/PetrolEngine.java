package com.java8code;

public class PetrolEngine implements Engine{
	public void start() {
		System.out.println("Petrolengine started....");
	}
	@Override
	public void Clean() {
		System.out.println("PetrolEngine cleaned...");
	}
	public static void main(String[] args) {
		Engine engine=new PetrolEngine();
		engine.start();
		engine.Clean();
		Engine.stop();
	}
}
