package mapInCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapInJava {

	public static void main(String[] args) {
		Map<Integer, String> hashMap =  new HashMap<Integer, String>();
		hashMap.put(1, "value1");
		hashMap.put(2, "value2");
		hashMap.put(1, "value3"); // Here the value will be replaced as value3 and value4. And only 2 values only will be printed.
		hashMap.put(2, "value4");
		hashMap.put(null, "value5");
		hashMap.put(null, "value6"); // Key can not be duplicate. HashMap will not maintain the order.
		System.out.println(hashMap);
		
		//System.out.println(hashMap.get(1));
		
		//Getting all the value from hashmap
		Set<Integer> keyset = hashMap.keySet();
		Iterator<Integer> itr = keyset.iterator();
		while(itr.hasNext()) {
			System.out.println(hashMap.get(itr.next()));
		}
		
		//To print all the entries in key value pair format
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) { //entry is nothing but a pair of key value
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}
}

/* Notes:
 * 	Map is an interface. It is unimplemented method which means there should be some class that implements Map.
 * HashMap is a class which implements Map Interface which implements Collection interface which implements 
 * iterable interface. Static members we can not inherit.
 * HashMap -- we can store the data in a map based on key and value pair. Value can be duplicate. But Key can not be
 * duplicate.
 * Only one key we can make as null. we can not keep more than one key as null. Becoz, if we do that, key will be
 * duplicate which is not allowed.
 * It maintains no order. The way we put data in order same way we can not get. 
 * When we create hash map, default constructor will call. Internally it will create parameterized constructor.
 * Initial capacity and load factory will be an argument. capacity is 16, load is 0.75. Then it will grow
 * automatically.
 * 
 * We can supply what kind of key and value has to be stored as an arugment. Map<Integer, String> =>
 * Key is Integer and Value is String. Whenever we create hashMap.put(key,value), hash of the key will be created.  
 * hash is nothing but a integer value.
 */
