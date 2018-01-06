package vectorInJava;

import java.util.List;
import java.util.Vector;

public class VectorInJava1 {

	public static void main(String[] args) {
		List<Object> vector = new Vector<>();
		vector.add(5);
		vector.add(5.50);
		vector.add(true);
		vector.add("Vector");
		System.out.println(vector);	
		
		List<Double> vector1 = new Vector<>();
		vector1.add(5.50);
		vector1.add(Double.valueOf(10));
		
		Vector vector2 = new Vector<>();
		
		
		System.out.println(vector.size());
		System.out.println(vector.isEmpty());
		
		vector1.addAll(vector2); //all data will be added to vector1 from vector2
		System.out.println(vector1);
		vector.add(2, 100);
		
		}
	}

/*Notes:
 * Vector implements List Interface.
 * Vector also has same method as Array list. But Vector class is a legacy class.
 * Data corruption may happen in linked list and array list when we use multi thread. But in vector, data corruption
 * will not happen.
 * 
 * Internally the input data will be converted by compiler. When we declare as vector.add("Vector") --> It will be
 * converted internally as vector.add(String.valueOf("Vector"))
 * 
 * We can make the reference of vector instead of list. Same as List it will work. The output remains same as List
 */
