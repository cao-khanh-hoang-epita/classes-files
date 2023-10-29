package Revision;

public interface ExampleInterface {
	void printInfo();
	default void printInfo1() {
		System.out.println("Default Interface Class");
	}

	static void print() {
		System.out.println("Static Interface Class");
	}

	abstract class ExampleAbstract {

		abstract void printInfo();

		void print() {
			System.out.println("Abstract Classk");
		}
	}

	class Child extends ExampleAbstract implements ExampleInterface {

		@Override
		public void printInfo() {
			System.out.println("Class Child");
		}
	}
}
