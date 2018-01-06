package hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetInJava {

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
		
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(100);
		treeSet.add(5);
		System.out.println(treeSet);
	}
}

/* Difference between linked hash set and tree set:-
 * Tree set will add the value in insertion order. Even linkedhashset also doing the same. But one difference is
 * It will store/add the value in ascending order.
 * 
 */
