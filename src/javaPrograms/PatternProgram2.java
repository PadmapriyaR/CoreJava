package javaPrograms;

public class PatternProgram2 {

	public void pattern() {
		int i,j;
		for(i=1;i<=6;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternProgram2 obj = new PatternProgram2();
		obj.pattern();
	}

}

/* Output:-
1
22
333
4444
55555
666666
 */
