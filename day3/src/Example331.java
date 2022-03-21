class Demo
{
    void multiply(int a, int b)
    {
        System.out.println("Result is"+(a*b)) ;
    }
    void multiply(int a, int b,int c)
    {
        System.out.println("Result is"+(a*b/c));
    }
}
public class Example331{
    public static void main(String[] args)
    {
        Demo  ar = new Demo();
        ar.multiply(7,2);   //multiply(int a, int b) is method is called
        ar.multiply(9,4,3);   //multiply(int a, int b/int c) is called
    }
}

