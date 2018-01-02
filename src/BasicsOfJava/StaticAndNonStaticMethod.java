package BasicsOfJava;

public class StaticAndNonStaticMethod {

	public void go1() {
		System.out.println("go1()");
		go2();
	}
	
	public void go2() {
		System.out.println("go2()");
		go3();
	}
	
	public void go3() {
		System.out.println("go3()");
	}
	
	public static void staticMethod() {
		System.out.println("static method()");
	}
	
	public void nonStaticMethod() {
		System.out.println("nonStaticMethod()");
	}
	
	public static void main(String []args) {
		StaticAndNonStaticMethod obj = new StaticAndNonStaticMethod();
		obj.go1();
		obj.nonStaticMethod();
		staticMethod();
	}
}

/*In Java, there are two members. 
 *1. Static members
 *2. Non static members
 * 
 * Static Members:-
 * 	Static members are class members. Using class, we can call methods/variables. We can not create static
 * reference to Non-Static members.So we can not call non-static method from static method by creating static 
 * reference. This members will be loaded only once in memory.
 * 
 * Non-static members:-
 * 	Non-static members are object members.In this above example, we have to call non-static methods from static
 * methods by using object of the class.This members will be loaded as many as we create object. 
 * 
 * Whenever we create object, it will be created once in a heap memory. We are not acquiring extra space. 
 * Because when we are calling, we are using class name. 
 * */
