package com.awsravi.j8M;

class Animal {
	Animal getAnimal() {
		System.out.println("Animal");
		return new Animal();
	}
}

class Dog extends Animal {
	@Override
	Dog getAnimal() {
		System.out.println("Dog");
		return new Dog();
	}
}

public class CoveriantTest {
	public static void main(String[] args) {
		Animal a=new Dog().getAnimal();
	}
}
