public class MethodCallExample12 {


        public static void main(String[] args)
        {
// Declaration of int
            int a = 20;
            int b = 40;
            int result = a+b;
            System.out.println("Result is: " + result);

            double a1 =  20;
            Double b1 = Double.valueOf((float) a1);
            int b2 = b1.intValue();
            System.out.println("Converted Value of b1 is: " + b1);
            System.out.println("Converted Value of b1 is: " + b2);
            Integer c = new Integer(30);
            float d = c.floatValue();
            System.out.println("Converted Value of d is: " + d);
        }
    }

