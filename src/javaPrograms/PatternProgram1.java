package javaPrograms;

public class PatternProgram1 {

	public void pattern1() {
		int i, j;
		for(i=1;i<=6;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternProgram1 obj = new PatternProgram1();
		obj.pattern1();
	}

}

/* Output:-
1
12
123
1234
12345
123456
 */

