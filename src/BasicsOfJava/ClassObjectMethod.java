package BasicsOfJava;

public class ClassObjectMethod {
	
	int height, weight;
	
	public void walk() {
		System.out.println("walk()");
	}
	
	public void eat() {
		System.out.println("eat()");
	}

	public static void main(String[] args) {
		ClassObjectMethod obj = new ClassObjectMethod();
		obj.walk();
		obj.eat();
		System.out.println(obj.height); 
	}

}

/* Notes:
 * 1.Class and Object:- 
 * 	Class is a template/blueprint which will describe properties and behaviors of it's object. Class is used to
 * Objects. Without class, object can not be created. Without object, we can not call class members. It has some
 * co-relation.
 * Example:
 * 	Let assume, we have forms which contains name, roll number, age, etc. Then we distributed to all. When we get
 * it back by filling up all the given details, it will be called as Objects. When we distributed a form that 
 * time, it was just a blue print. It can be called as Class. Using class, we can create Objects.    
 * We can create 'n' numbers of object. The process of creating an object from a class is called as 'Instantiation'. 
 * The created object is called as 'Instance'. 
 * 
 * 2.Method:-
 * 	Every object will have action that is called as Method.
 * */
