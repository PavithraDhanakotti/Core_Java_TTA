package Core_Java.src_practice;

public class Lab002 {
    public static void main(String[] args) {
        Lab001 lab = new Lab001() ;
        lab.print();

        System.out.println("_______________________________");

        Lab001 lab2 = new Lab001("Prapthi", "Female");
        lab2.Name = "Hello";
        lab2.print();


    }
}