package Threads;

public class ThreadMain {
    public static void main(String[] args) {

        SayHi hi = new SayHi();
        SayHello hello = new SayHello();

        //Calling start method to run threads. This method came from Java Thread class
        hi.start();
        hello.start();

        //Create objects from Hi and Hello class
        Hi hi1 = new Hi();
        Hello hello1 = new Hello();

        //Created two thread object to call start method
        Thread t1 = new Thread(hi1);
        Thread t2 = new Thread(hello1);
    }
}
