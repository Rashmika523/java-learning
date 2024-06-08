package Recursion;

public class RecursionMain {

    public static int sun(int number){
        if(number>0){
            return number+sun(number-1);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
