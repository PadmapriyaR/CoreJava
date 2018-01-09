package javaPrograms;

public class FindTheBiggestNumberInArrary {

	public void biggestNumbers(int[] a) {
		
		int i, temp = 0;
		for(i=0;i<a.length;i++) {
			if(temp<a[i]) {
				temp = a[i];
			}
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		FindTheBiggestNumberInArrary obj = new FindTheBiggestNumberInArrary();
		int numbers[] = {121,213,112,134};
		obj.biggestNumbers(numbers);
	}

}
