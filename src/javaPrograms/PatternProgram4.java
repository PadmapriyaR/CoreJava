package javaPrograms;

public class PatternProgram4 {

	public void pattern() {
		int i,j;
		for(i=1;i<=6;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternProgram4 obj = new PatternProgram4();
		obj.pattern();
	}

}

/* Output:-
1
12
123
1234
12345
123456
12345
1234
123
12
1
 */
