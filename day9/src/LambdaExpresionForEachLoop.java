import java.util.ArrayList;
import java.util.List;


public class LambdaExpresionForEachLoop {
    public static void main(String args[]){
        List<String> list=new ArrayList<String>();
            list.add("Jai");
            list.add("Selva");
            list.add("Sri");
            list.add("Siva");
            list.add("Mathevan");
            list.add("Poncy");
            list.add("Surya");
            list.add("Ajay");


        list.forEach(


                (name)->System.out.println(name));

    }
}
