package hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetInJava {

	public static void main(String[] args) {
		Set<Object> hashSet = new HashSet<>();
		hashSet.add(5);
		hashSet.add(2);
		hashSet.add("String");
		System.out.println(hashSet);
		
		HashSet<Object> hashSet1 = new HashSet<>();
		hashSet1.add(500);
		hashSet1.add(50);
		hashSet1.add("String");
		System.out.println(hashSet1);
		
		hashSet.addAll(hashSet1);
		hashSet.removeAll(hashSet1); //whatever element is matching those will be deleted.
		hashSet.retainAll(hashSet1); // It will retain only matched daata
		hashSet.containsAll(hashSet1); //It will return boolean value
		hashSet.contains(2);		
	}
}

/* Difference between List and Hashset:-
 * It will not add the elements in order. It will randomly store the data.It will not maintain the inserting order.
 * It will not allow us to store the duplicate values.It will not keep the duplicate data.
 * It implements set interface. We can also make reference of HashSet class and Set.
 * We can not add elements based on index.
 * It will not have the method to insert data based on index.
 */
