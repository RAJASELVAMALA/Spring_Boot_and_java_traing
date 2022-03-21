abstract class AbstractDemo{
    public void myMethod(){
        System.out.println("Hello");
    }
    abstract public void anotherMethod();
}
public class Main32 extends AbstractDemo{

    public void anotherMethod() {
        System.out.print("Abstract method");
    }
    public static void main(String args[])
    {
        //error: You can't create object of it
        Main32 obj = new Main32();
        obj.myMethod();
        obj.anotherMethod();
    }
}