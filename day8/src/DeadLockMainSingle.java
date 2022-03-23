public class DeadLockMainSingle {
    public static void main (String[] args)
    {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()+"thread started.");
        try {
            currentThread.join(10);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(currentThread.getName()+"thread end.");


    }
}
