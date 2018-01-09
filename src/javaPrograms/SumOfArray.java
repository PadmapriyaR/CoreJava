package javaPrograms;

public class SumOfArray {

	public void sum(int[] a) {
		int i, sum = 0;
		for(i=0;i<a.length;i++) {
			sum = sum + a[i]; 
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		SumOfArray obj = new SumOfArray();
		int numbers[] = {100,20,30};
		obj.sum(numbers);
	}

}
