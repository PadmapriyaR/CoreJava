package inheritanceInJava;

public class ParentClass {

	public void method1() {
		System.out.println("Parent method1");
	}
	
	public void method2() {
		System.out.println("Parent method2");
	}
	
	public void method3() {
		System.out.println("Parent method3");
	}
	
	private void method4() {
		System.out.println("Parent method4");
	}
	
	protected void method5() {
		System.out.println("Parent method5");
	}
	
	void method6() {
		System.out.println("Parent method6");
	}
}

/* Inheritance:-
 * 	We will use this inheritance concept when we design framework in selenium.
 * 	We can inherit only non-static members from parents class to child class.
 * 	We can not inherit static members from parent class to child class.
 * 	To use inheritance, we have use the keyword called extends.
 * 
 * 	We can access only public, protected and default members within package from parent class to child class 
 * when we use inherit.
 * 	We can access public and protected members from different package to child class, when we use inherit.
 * 	Static and final members can not be inherit.
 * 	We can not inherit private member of the class.
 */
