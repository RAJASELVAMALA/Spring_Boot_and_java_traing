
class ThreadA extends Thread{
    public void run( ) {
        for(int x = 0; x < 10; x++) {
            System.out.println(" Thread:A - sum:  = "+ 2*x);
        }
        System.out.println("Exiting from Thread A ...");
    }
}

class ThreadB extends Thread {
    public void run( ) {
        for(int x = 0; x < 10; x++) {
            System.out.println(" Thread:B-sum: = "+2*x);
        }
        System.out.println("Exiting from Thread B ...");
    }
}
class ThreadC extends Thread{
    public void run( ) {
        for(int x = 0; x < 10; x++) {
            System.out.println(" Thread:C-Sum: = "+ (2*x));
        }
        System.out.println("Exiting from Thread C ...");
    }
}

public class MultiEx1 {
    public static void main(String args[]) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println("... Multithreading is over ");
        Thread th1 = new Thread(a);
        th1.setName("ThreadA");
        System.out.println(th1.getName());
        th1.setName("ThreadB");
        System.out.println(th1.getName());
        th1.setName("ThreadC");
        System.out.println(th1.getName());




    }
}