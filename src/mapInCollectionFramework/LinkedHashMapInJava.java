package mapInCollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapInJava {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(1, "100");
		linkedhashmap.put(2, "101");
		linkedhashmap.put(3, "102");
		System.out.println(linkedhashmap);
		
		Set<Entry<Integer, String>> keyset = linkedhashmap.entrySet();
		Iterator<Entry<Integer, String>> itr = keyset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getKey());
		}
		
		for(Entry<Integer, String> entry : linkedhashmap.entrySet()) {
			System.out.println(entry.getKey()+"----"+entry.getValue());
		}
	}
}

/* The only difference between hash map and linked map is:-
 * It will maintain the insertion order. The sequence we are inserting the value , in the same order, we will get the data
 * same type => extends, different type => implements
 */
