package testProtectedAndDefault;

import accessModifierInJava.AccessModifierInJava1;

public class TestProtectedAndDefault extends AccessModifierInJava1{

	public static void main(String[] args) {
		TestProtectedAndDefault obj1 = new TestProtectedAndDefault();
		obj1.test3(); // public
		obj1.test4(); // protected
		
		AccessModifierInJava1 obj2 = new AccessModifierInJava1();
		obj2.test3(); // public
	}
}

/*Using public access specifier, we can be able to access from anywhere right. Then why default, protected 
 *are available in Java?
 * 
 *When we are using Inheritance, we can be able to access protected and public. we can not be able to use
 *Default.
 *
 * When we are not using Inheritance, only public we can access.
 */
