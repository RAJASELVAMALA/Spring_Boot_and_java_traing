class ThreadExtendsEx extends Thread {

    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("2.then second task Start");
            }
            System.out.println("3.then next Task is - End print statement executed ");

            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }

     public class ThreadExtends {
         public static void main(String[] args) {
             // Creating a extends class object
             ThreadExtendsEx r = new ThreadExtendsEx();

             // Starting the Thread
             r.start();
             System.out.println("1.from first execute ( thread object is first executed)");
         }
     }

