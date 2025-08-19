package assignment;
class MyClass {
    static int count = 10;

    static void display() {
        System.out.println(count);
    }
}
class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Person {

    String name = "Instance Variable Name";

    void showName() {
        String name = "Local Variable Name";

        System.out.println("Local variable: " + name);

        System.out.println("Instance variable: " + this.name);
    }
}
class Pi{
	static double pi = 3.14;
	void showConstant() {
        System.out.println("Value of PI: " + pi);
    }

}
class Test {
    void show() {
        int x;  

        x = 10; 
        System.out.println("local variable: " + x);
    }
}
class Counter {
    int value = 0;

   
    void increment() {
        value++;
        System.out.println("After increment: " + value);
    }

    void decrement() {
        value--;
        System.out.println("After decrement: " + value);
    }

    void display() {
        System.out.println("Current value: " + value);
    }
}
public class Assignment {
	public static void main(String[]args) {
//		System.out.println(MyClass.count);
//        MyClass.display();
		
//		Student s1 = new Student("Alice", 20);
//        Student s2 = new Student("Bob", 22);
//
//        s1.display();
//        s2.display();
		
		
//		Person p = new Person();
//        p.showName();
		
//		System.out.println("PI = " + Pi.pi);
//
//        Pi c = new Pi();
//        c.showConstant();
		
//		Test t = new Test();
//        t.show();
//        Compile Error	
		
		Counter c = new Counter();

        c.display();    
        c.increment();  
        c.increment();  
        c.decrement();  
        c.display();
	}
}
