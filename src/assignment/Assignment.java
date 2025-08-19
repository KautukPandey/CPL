package assignment;
class MyClass {
    static int count = 10;

    static void display() {
        System.out.println(count);
    }
}
public class Assignment {
	public static void main(String[]args) {
		System.out.println(MyClass.count);
        MyClass.display();
	}
}
