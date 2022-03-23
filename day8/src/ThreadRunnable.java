
class ThreadRunInter implements Runnable {
    // Function that will be called by Thread class after starting
    public void run() {
        System.out.println("then second task Start");

        System.out.println("then next Task is - End print statement executed ");
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {
        // Runnable object
        ThreadRunInter r = new ThreadRunInter();
        //   Thread  object
        Thread th1 = new Thread(r);
        // Starting the Thread
        th1.start();
        System.out.println("from first execute ( thread object is first executed)");
    }
}

