package Threads;

public class ThreadMain {
    public static void main(String[] args) {

        SayHi hi = new SayHi();
        SayHello hello = new SayHello();

        hi.start();
        hello.start();
    }
}
