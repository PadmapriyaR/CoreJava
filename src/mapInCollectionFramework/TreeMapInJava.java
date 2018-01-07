package mapInCollectionFramework;

import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(1, "100");
		treemap.put(2, "102");
		treemap.put(4, "104");
		treemap.put(3, "103");
		//treemap.put(null, "100"); // It will throw the error/exception
		System.out.println(treemap);
	}
}

/* It will maintain the insertion data in ascending order.It will not ascending the value. It will be ascending the key.
 * It cannot have null key but it can keep null values.
 * It contains only unique elements.
 */
