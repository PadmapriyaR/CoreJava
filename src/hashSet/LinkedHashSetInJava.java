package hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		HashSet<Object> hashSet1 = new HashSet<>();
		hashSet1.add(500);
		hashSet1.add(50);
		hashSet1.add("String");
		hashSet1.add("String");
		System.out.println(hashSet1);
		
		LinkedHashSet<Object> linkedhash = new LinkedHashSet<>();
		linkedhash.add(500);
		linkedhash.add(50);
		linkedhash.add("String");
		linkedhash.add("String");
		System.out.println(linkedhash);
		
	}
}

/* No difference between hashset and linked hash set. There is a difference between methods.
 * It will maintain the data in insertion order.
 */
