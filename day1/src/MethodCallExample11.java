
public class MethodCallExample11 {
        //user-defined static method
        static void showMessage(String name) {
            System.out.println("MethodCall Examples");
            System.out.println(" 1.static" + "" + name);
        }

        //user-defined non-static method
        void showsMessage() {
            System.out.println("2.Non-static method .");
        }

        public static void main(String[] args) {
//calling static method without using the object
            showMessage("method."); //called method
//creating an object of the class
            MethodCallExample11 mce = new MethodCallExample11();
//calling non-static method
            mce.showsMessage(); //called method


        }
    }
