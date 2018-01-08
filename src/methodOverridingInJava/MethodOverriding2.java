package methodOverridingInJava;

public class MethodOverriding2 extends MethodOverriding1{
	
	public void test1() {
		System.out.println("example test1");
	}
	
	public void test2() {
		System.out.println("example test2");
	}
	
	public static void main(String[] args) {
		MethodOverriding2 obj = new MethodOverriding2();
		obj.test1();
	}

}
/* Method overriding:-
 * 	It is a way of overriding the method of the parent class to the child class.
 * 	It can be acheived with the help of inheritance. Without inheritance, we can not use method overriding.
 * 	Java will give more preference to the child class as we created the object for child class. It is a
 * ability of the object which method should be called.
 */
