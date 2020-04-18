//package ExceptionHandellingPractice;

public class TryCatchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FirstClass");

		A a = new A();
		a.m1();
	}

}

class A {
	public static void m1() {
		System.out.println("MyMethod");
	}
}

class B extends A {
	public static void m2() {
		System.out.println("Something else");
	}
}
