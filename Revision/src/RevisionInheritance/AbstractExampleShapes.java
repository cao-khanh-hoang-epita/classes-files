package RevisionInheritance;

abstract class AbstractExampleShapes {
	// constructor of the abstract class
	void Shape() {
		System.out.println("Let's start drawing!");
	}

	abstract void draw(); // Abstract method

	void completeDraw() { // Non-abstract method
		System.out.println("Circle is drawn!");
	}
}

class Circle extends AbstractExampleShapes {

	// Implementing the abstract method
	@Override
	void draw() {
		System.out.println("The abstract hidden method draws circle!");

	}
}