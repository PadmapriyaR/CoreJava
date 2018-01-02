package accessModifierInJava;

public class AccessModifierInJava2 {

	public static void main(String[] args) {
		AccessModifierInJava1 obj = new AccessModifierInJava1();
		obj.test1();
		obj.test3();
		obj.test4();
	}
}

/* Here we can access only test1,test3,test4 from accessmodifierJava1 class as test1 method has been defined as
 * a default.
 * 
 * Access specifier   |   Class         |      Package       |       Sub class       |     World     
 * -----------------------------------------------------------------------------------------------
 * 	Public            |     Y           |        Y           |         Y             |       Y
 * 	Protected         |     Y           |        Y           |         Y             |       N
 * 	Private           |     Y           |        Y           |         N             |       N
 *	Default           |     Y           |        N           |         N             |       N
 */

