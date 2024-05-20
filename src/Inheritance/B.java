package Inheritance;

public class B extends A{

    int b;

    public void printB(){
        System.out.println("b :"+b);
    }

    static {
        System.out.println("Static Block B");
    }

}
