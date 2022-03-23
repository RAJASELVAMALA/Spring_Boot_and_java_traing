import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generics101 {
    public static void main(String[] args) {
        Users<Integer, String> u = new Users<Integer, String>();
        u.add(Integer.valueOf(1),"Balaji");
        //   System.out.printf("Id :%d\n", box.getFirst());
        //  System.out.printf("User :%s"+ " ", box.getSecond());

        Pair<String, String> pair = new Pair<String, String>();
        pair.addKeyValue("Balaji", String.valueOf("ICANIO"));
        // System.out.printf("Company :%s\n", pair.getValue("Balaji"));

        CustomList<Users> list = new CustomList<Users>();
        list.addItem(u);
        System.out.printf("Id :%d\n", list.getItem(0).getFirst());
        System.out.printf("User Name :%s\n", list.getItem(0).getSecond());
        System.out.printf("Company :%s\n", pair.getValue("Balaji"));

    }
}

class Users<T, S> {
    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {
        return t;
    }

    public S getSecond() {
        return s;
    }
}

class Pair<K,V>{
    private Map<K,V> map = new HashMap<K,V>();

    public void addKeyValue(K key, V value) {
        map.put(key, value);
    }

    public V getValue(K key) {
        return map.get(key);
    }
}

class CustomList<E> {
    private List<E> list = new ArrayList<E>();

    public void addItem(E value) {
        list.add(value);
    }

    public E getItem(int index) {
        return list.get(index);
    }

}
