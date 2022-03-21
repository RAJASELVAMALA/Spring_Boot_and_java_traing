class Base
{
    int a = 50;
}
public class Derive31 extends Base
{
    int a = 100;
    void display()
    {
        System.out.println(super.a);
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Derive31 derive = new Derive31();              //inhertence
        derive.display();
    }
}