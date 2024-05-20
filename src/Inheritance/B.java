package Inheritance;

public class B extends A{
    int b;
    public void printB(){
        System.out.println("b :"+b);
    }
    public void callPrint(){
        printA(); //illegal
        printB(); //legal
    }
    public void printAB(){
        System.out.println("a :"+a); //legal
        System.out.println("b :"+b); //legal
    }
}
