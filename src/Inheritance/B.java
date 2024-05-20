package Inheritance;

public class B extends A{

    int b;

    B(){
        super();
        System.out.println("B()");
    }
    B(int i){
        super(10);
        System.out.println("B(int i)");
    }
    B(int i,int y){
        super(10,20);
        System.out.println("B(int i,int y");
    }

}
