package listInCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(1);
		arrayList1.add(2);
		System.out.println(arrayList1);
		
		List<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(10);
		arrayList2.add(20);
		System.out.println(arrayList2);
		
		arrayList1.addAll(arrayList2); // All the data will be added from one array list to another array list
		System.out.println(arrayList1);
		
		arrayList1.add(2, 500); // It will add 500 in 2nd index
		System.out.println(arrayList1);
		
		arrayList1.removeAll(arrayList2); //It will remove all the data which are matching.
		System.out.println(arrayList1);
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
*/