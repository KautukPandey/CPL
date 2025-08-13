import java.util.*;
public class main {
    static void si(double P, double R, double T) {
        System.out.println("Simple Interest" + (P * R * T)/ 100);
    }

    static void pr(double l, double w) {
        System.out.println("Perimeter Of Rectangle" + 2 * (l + w));
    }

    static void pc(int b, int e) {
        System.out.println("Power : " +Math.pow(b, e));
    }

    static void aot(int num1, int num2, int num3) {
        System.out.println("Average of three : " + (num1 + num2 + num3)/3);
    }
    static void ktm(double km) {
        System.out.println("Miles : " + km * 0.621371);
    }
    public static void aocy(int r,int h){
        double vol = 3.14*(Math.pow(r,2))*h;
        System.out.println(vol);
    }
    public static void aoc(int r){
        double area = (3.14)*(Math.pow(r,2));
        System.out.println(area);
    }
    public static void farhen(int x){
        int farhen = (x*9/5)+32;
        System.out.println(farhen);
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static void hello(){
       System.out.println("Welcome to Bridgelabz!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 2 numbers");
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // System.out.println(add(x,y));

        // System.out.println("Enter temperature");
        // int x = sc.nextInt();
        // farhen(x);

        // System.out.println("Enter radius of circle");
        // int x = sc.nextInt();
        // aoc(x);


        // System.out.println("Enter radius and height of circle");
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // aocy(x,y);


        // si(x,y,z);
        // pr(x,y);
        // pc(x,y);
        // aot(x,y,z);
        // ktm(x);
    }
}
