package listInCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		
		List<Object> arrayList = new ArrayList<Object>();
		arrayList.add(1);
		arrayList.add(1.1);
		arrayList.add(true);
		arrayList.add("array list");
		System.out.println(arrayList);
		
		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(0);
		arrayList1.add(21);
		System.out.println(arrayList1);
		
		arrayList.retainAll(arrayList1); // Whatever data match, it will retain those data only. Other data will be removed
		arrayList.size();
		System.out.println(arrayList1.size());
		System.out.println(arrayList1.get(1));
		System.out.println(arrayList1.contains(1));
		System.out.println(arrayList1.containsAll(arrayList1)); // If all the will not mactch then it will return false 
	}
}

/*
 *Notes on Array List:
 *--------------------
 *What is Array List:-
 *	We can store group of objects in Array List.
 *	Major problem what we are facing is size issue. Whenever we use Array, we have to declare size of the array.
 *But in Array List, we don't need to fix the array size. It will automatically grow or shrink dynamically.
 *	Array List will use dynamic array.It is internally using dynamic array.
 *	It will store the data based on index. So that we can use many data.It will allow duplicates data also. 
 *
 *How to use Array List:-
 *	Array List implements List interface
 *	We will be able to store any kind of data in Array List
 *	Array List is using util package
 *	If we are not declare an array list without data type, we can store any kind of data/value in array list.
 *	If we declare an array list with specified data type, we can be able to store only that declared data type's
 *value.
 *
 *When we supply arugment as an object in Array list, we can store any knid of data.
*/