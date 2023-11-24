package com.awsravi.j8M;

class Shape {
	Shape createShape() {
		System.out.println("Creating a generic shape.");
		return new Shape();
	}
}

class Circle extends Shape {
	@Override
	Circle createShape() {
		System.out.println("Creating a circle.");
		return new Circle();
	}
}

public class CovariantEX {
	public static void main(String[] args) {
		Shape shape = new Circle().createShape();
		
		
		// Output: Creating a circle.

		
		
		// The overridden method in Circle returns a Circle, not a Shape.
		// This is an example of covariant return type.

		/*
		 * example involving a hierarchy of classes representing different shapes. We'll
		 * have a base class Shape with a method createShape() that returns an instance
		 * of Shape. Then, we'll create a subclass Circle that overrides the
		 * createShape() method to return an instance of Circle.
		 */

		//
		/*
		 * In this example, even though the variable shape is of type Shape, the
		 * overridden method in the Circle class returns a more specific type (Circle).
		 * This is possible due to covariant return types, allowing a more specific
		 * return type in the subclass.
		 */

	}
}
