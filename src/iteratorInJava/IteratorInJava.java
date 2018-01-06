package iteratorInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorInJava {

	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add("Iterator");
		arrayList.add(10.10);
		
		Iterator<Object> itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(arrayList);
		
		List<Object> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add("20");
		
		ListIterator<Object> itr1 = linkedList.listIterator();
		while(itr1.hasNext()) {
			System.out.println(linkedList);
		}
		
		/*while(itr1.hasPrevious()) {
			System.out.println(linkedList);
		}*/
		
	}
}

/* We can iterate the collection of data. It is a Interface. It has 3 Methods, HasNext, Next, Remove.
 * 
 * HasNext: It will check whether there is any data available next in the collection of data. It will give the boolean
 * value. If data is present it will return true.
 * Next: It will return the data and will move the pointer to next element.
 * Remove: It will remove the data from the collection of data.
 * 
 * It will not work for Vector
 */
