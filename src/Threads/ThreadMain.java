package Threads;

public class ThreadMain {
    public static void main(String[] args) {

        SayHi hi = new SayHi();
        SayHello hello = new SayHello();

        //Calling start method to run threads. This method came from Java Thread class
        hi.start();
        hello.start();
    }
}
