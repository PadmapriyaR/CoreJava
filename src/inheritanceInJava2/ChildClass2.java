package inheritanceInJava2;

import inheritanceInJava.ParentClass;

public class ChildClass2 extends ParentClass{

	public void method7() {
		System.out.println("ChildClass method7 For multilevel inheritance");
	}
	
	public static void main(String[] args) {
		ChildClass2 obj = new ChildClass2();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method5();
	}
}
