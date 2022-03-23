public class TestGarbge {


        public void finalize()
        {
            System.out.println("object multiple time created print statement will be executed");
        }

        public static void main(String args[])
        {
            TestGarbge s1=new TestGarbge();
            TestGarbge s2=new TestGarbge();
              s1=null;
              s2=null;
            //s1=s2;
            System.gc();
        }
    }

