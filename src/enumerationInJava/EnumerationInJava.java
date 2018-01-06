package enumerationInJava;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationInJava {

	public static void main(String[] args) {
		Vector<Object> vector = new Vector<>();
		vector.add(5);
		vector.add(5.50);
		vector.add(true);
		vector.add("Vector");
		System.out.println(vector);	
	
		Enumeration<Object> enu = vector.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}
}

/* It is same like Iterator but Enumeration will be used for Vector. It has different methods.
 * 
 * We can not use Emnueration in ArrayList. We can only use Enumeration for Vector.
 * 
 */