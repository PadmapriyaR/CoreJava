package accessModifierInJava;

public class AccessModifierInJava1 {

	int i;
	private int j;
	public int k;
	protected int l;
	
	void test1() {
		System.out.println("test1()");
	}
	
	private void test2() {
		System.out.println("test2()");
	}
	
	public void test3() {
		System.out.println("test3()");
	}
	
	protected void test4() {
		System.out.println("test4()");
	}
	
	public static void main(String[] args) {
		AccessModifierInJava1 obj = new AccessModifierInJava1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}
}

/*Four types of modifiers: Private, Public, Protected, Default.
 * When we don't mention any modifier then it will be automatically considered as Default.
 * 
 * 1.From same class, we can access all the type of members.
 * 2.
 * 
 */
