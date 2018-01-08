package methodOverloadingInJava;

public class MethodOverloading {

	public void test1() {
		System.out.println("Default method");
	}

	public void test1(int i) {
		System.out.println(i);
	}

	public void test1(int i, int j) {
		System.out.println(i+"---"+j);
	}

	public void test1(String s) {
		System.out.println(s);
	}
	
	public void test1(double k) {
		System.out.println(k);
	}
	
	public static void test2() {
		System.out.println("final method1");
	}
	
	public static void test2(int l) {
		System.out.println("final method overloading");
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.test1();
		obj.test1(10);
		obj.test1("Method overloading");
		obj.test1(10, 10);
		obj.test1(20);
		obj.test2();
		obj.test2(100);
	}
}

/*
 * Method Overloading:- It means creating methods with same name but arguments
 * are different. Overload the method by changing number of arguments.
 * Benefit is:- we don't need to remember the method name. we will call the method based on the arugment.
 * 
 * Rules for method overloading:-
 * We can overload the method by changing the number of the arugment.	
 * We can also overload the method by changing the type of the argument.
 * Is it possible to overload the method by changing the return type? -- It is not possible.
 * Is it possible to overload the final method? -- Yes, we can overload the final method but we can not change the
 * final method by changing return type.
 * Is it possible to overload the static method? -- Yes, we can overload the static method but we can not change the
 * static method by changing return type.
 */
