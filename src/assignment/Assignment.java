package assignment;
class MyClass {
    static int count = 10;

    static void display() {
        System.out.println(count);
    }
}
//class Student {
//    String name;
//    int age;
//
//    Student(String n, int a) {
//        name = n;
//        age = a;
//    }
//
//    void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//}
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
class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Student name: " + name);
    }
}
class A {
    static int x = 10;
}

class B {
    void modifyAndPrint() {
        A.x = 50;
        System.out.println("Value of x in class B: " + A.x);
    }
}

class User{
	final int userId;
    User(int id) {
        userId = id;
    }

    void display() {
        System.out.println("User ID: " + userId);
    }
}
class Empty{
	static int num;
}
class Demo{
	int instanceVar = 10;
    static int staticVar = 20;

    void showVariables() {
        int localVar = 30;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }
}
class car {
	String model;
	int year;
	static int numberOfCars = 0;
	
	void car(String model, int year) {
		this.model = model;
		this.year = year;
		numberOfCars++;
	}
	
	void displayDetails() {
		System.out.println("Model : " + model + "year : " + year);
	}
	
}
class Q3 {
	public static int method() {
		int count = 10;
		return count;
	}
	
	public static void main() {
		System.out.println(method());
	}
}
class Q5 {
	static int count = 0;
	String name;
	
	public Q5(String name) {
		this.name = name;
	}
	
	public static void main() {
		Q5 ob1 = new Q5("Object 1");
		ob1.count = 5;
		
		Q5 ob2 = new Q5("Object 2");
		System.out.println(ob2.name + " count as: " + ob2.count);
	}
}
class Account {
    String accountHolder;  
    double balance;        

    public static void main(String[] args) {
        Account acc = new Account(); 
        System.out.println("Account Holder: " + acc.accountHolder);
        System.out.println("Balance: " + acc.balance);
    }
}
class Demo {
	int count;
	
	public Demo(int count) {
		this.count = count;
	}
	
	public void showNumber() {
		int count = 50;
		System.out.println("Instance variable " + this.count);
		System.out.println("Local variable " + count);	
	}
	
	public static void main(String[] args) {
        Demo obj = new Demo(100);
        obj.showNumber(); 
	}
}
class finalVariable {
	final int var = 100;
	
	public static void main() {
		finalVariable ob = new finalVariable();
		System.out.println("Initially : " + ob.value);
		
		ob.value = 200;
		System.out.println("Updated : " + ob.value);
	}
}
class staticDemo {
	
    static int number;

    static {
        number = 50;
        System.out.println("Static block executed. Number initialized to " + number);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Value of number: " + number);
    }
}
class Student {
	String name;
	int marks;
	

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public void print() {
		System.out.println("Name : " + name + "Marks" + marks);
	}
	
	public static void main() {
		Student st1 = new Student("Garv", 100);
		Student st2 = new Student("Kautuk", 99);
		
		st1.print();
		st2.print();
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
		
//		Counter c = new Counter();
//
//        c.display();    
//        c.increment();  
//        c.increment();  
//        c.decrement();  
//        c.display();
		
//		Student s1 = new Student();
//        s1.setName("Alice");  
//        s1.display();
//
//        Student s2 = new Student();
//        s2.setName("Bob");
//        s2.display();
        
//        System.out.println("Initial value of x in class A: " + A.x);
//
//        B obj = new B();
//        obj.modifyAndPrint();
//
//        System.out.println("Value of x in class A after modification: " + A.x);
		
//		User u1 = new User(101);
//        User u2 = new User(202);
//
//        u1.display();
//        u2.display();
		
//		System.out.println(Empty.num);
//		Empty.num = 1;
//		System.out.println(Empty.num);
		
		Demo d = new Demo();
        d.showVariables();
	}
}
