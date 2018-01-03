package linkedListInCollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List<Object> linkedList = new LinkedList<Object>();
		linkedList.add(1);
		linkedList.add(1.5);
		linkedList.add(true);
		System.out.println(linkedList);
		
		List linkedList1 = new LinkedList<>();
		linkedList1.add(10);
		linkedList1.add(1.50);;
		System.out.println(linkedList1);
		
		System.out.println(linkedList.get(1));
		System.out.println(linkedList.addAll(linkedList1));
		System.out.println(linkedList.retainAll(linkedList1));
		System.out.println(linkedList.contains(1));
		System.out.println(linkedList.size());
		
		linkedList.clear();
		System.out.println(linkedList);
		System.out.println(linkedList.isEmpty());
		
	}
}

/*
 * There is no difference between array list and linked list. Only difference is architecture. 
 * This also present in util package.
 * Allows us to store all kind of data.
 * 
 * When we use object type in declaration, the warning messges will go off.
 */
