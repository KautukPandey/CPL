//package c1;

//public class Assignment {
//    static class Employee {
//        String name;
//        int id;
//        double salary;
//
//        Employee(String name, int id, double salary) {
//            this.name = name;
//            this.id = id;
//            this.salary = salary;
//        }
//
//        void displayDetails() {
//            System.out.println("Employee Details:");
//            System.out.println("Name   : " + name);
//            System.out.println("ID     : " + id);
//            System.out.println("Salary : " + salary);
//        }
//    }
//
//    public static void main(String[] args) {
//        Employee e1 = new Employee("Kautuk", 101, 50000);
//        Employee e2 = new Employee("Riya", 102, 60000);
//
//        e1.displayDetails();
//        System.out.println();
//        e2.displayDetails();
//    }
//}


//package c1;
//
//class Circle {
//    
//    double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    double calculateArea() {
//        return Math.PI * radius * radius;
//    }
//
//    
//    double calculateCircumference() {
//        return 2 * Math.PI * radius;
//    }
//
//    
//    void displayDetails() {
//        System.out.println("Circle with radius: " + radius);
//        System.out.println("Area          : " + calculateArea());
//        System.out.println("Circumference : " + calculateCircumference());
//    }
//}
//
//public class Assignment {
//    public static void main(String[] args) {
//        Circle c1 = new Circle(5.0);   
//        Circle c2 = new Circle(7.5);   
//
//        c1.displayDetails();
//        System.out.println();
//        c2.displayDetails();
//    }
//}

//package c1;
//
//class Book {
//    
//    String title;
//    String author;
//    double price;
//
//
//    Book(String title, String author, double price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//   
//    void displayDetails() {
//        System.out.println("Book Details:");
//        System.out.println("Title  : " + title);
//        System.out.println("Author : " + author);
//        System.out.println("Price  : " + price);
//    }
//}
//
//public class Assignment {
//    public static void main(String[] args) {
//   
//        Book b1 = new Book("The Alchemist", "Paulo Coelho", 399.0);
//        Book b2 = new Book("Clean Code", "Robert C. Martin", 699.0);
//
//        b1.displayDetails();
//        System.out.println();
//        b2.displayDetails();
//    }
//}



//package c1;
//
//class Item {
//    
//    int itemCode;
//    String itemName;
//    double price;
//
//    Item(int itemCode, String itemName, double price) {
//        this.itemCode = itemCode;
//        this.itemName = itemName;
//        this.price = price;
//    }
//
//    double calculateTotalCost(int quantity) {
//        return price * quantity;
//    }
//
//   
//    void displayDetails() {
//        System.out.println("Item Details:");
//        System.out.println("Code  : " + itemCode);
//        System.out.println("Name  : " + itemName);
//        System.out.println("Price : " + price);
//    }
//}
//
//public class Assignment {
//    public static void main(String[] args) {
//   
//        Item i1 = new Item(101, "Laptop", 55000.0);
//        Item i2 = new Item(102, "Headphones", 1500.0);
//
//       
//        i1.displayDetails();
//        System.out.println("Total cost for 2 units: " + i1.calculateTotalCost(2));
//        System.out.println();
//
//        i2.displayDetails();
//        System.out.println("Total cost for 5 units: " + i2.calculateTotalCost(5));
//    }
//}


package c1;

class MobilePhone {
    String brand;
    String model;
    double price;

    
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

public class Assignment {
    public static void main(String[] args) {
        
        MobilePhone m1 = new MobilePhone("Apple", "iPhone 14", 79999.0);
        MobilePhone m2 = new MobilePhone("Samsung", "Galaxy S23", 74999.0);

        
        m1.displayDetails();
        System.out.println();
        m2.displayDetails();
    }
}




