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
public class Assignment {
	public static void main(String[]args) {
//		System.out.println(MyClass.count);
//        MyClass.display();
		
		Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);

        s1.display();
        s2.display();
	}
}
