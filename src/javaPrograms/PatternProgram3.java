package javaPrograms;

public class PatternProgram3 {

	public void pattern() {
		int i,j;
		for(i=1;i<=6;i++) {
			for(j=i;j<=6;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternProgram3 obj = new PatternProgram3();
		obj.pattern();
	}

}

/* Output:-
 * 123456
	23456
	3456
	456
	56
	6 
 */
