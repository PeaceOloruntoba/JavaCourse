public class Main {
 String fname = "John";
 String lname = "Doe";
 int age = 24;

 static void myMethod(String[] args) {
    System.out.println("Hello World!");
 }
 public static void main(String[] args) {
    System.out.println("Hello World!");
 Main myObj = new Main();
 System.out.println("Name: " + myObj.fname + " " + myObj.lname);
 System.out.println("Age: " + myObj.age);
 }
}