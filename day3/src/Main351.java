class DataClass {
    private String strname;

    // getter method
    public String getName() {
        return this.strname;
    }
    // setter method
    public void setName(String name) {
        this.strname= name;
    }
}
public class Main351 {
    public static void main(String[] main){
        DataClass d = new DataClass();

        // access the private variable using the getter and setter
        d.setName("Java Programming");
        System.out.println(d.getName());                    //private
    }
}

