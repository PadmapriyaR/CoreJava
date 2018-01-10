package javaPrograms;

public class PatternProgram5 {

	public void pattern() {
		int i,j;
		for(i=6;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternProgram5 obj = new PatternProgram5();
		obj.pattern();
	}

}

/* Output:-
123456
12345
1234
123
12
1
 */
