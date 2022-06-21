public class Functions {
    public static void main(String[] args) {
        System.out.println("Hello World");
        simpleMethod();
        System.out.println(returnMethod());
        System.out.println(paramMethod("Hello World again"));
        simpleMethod(123);
    }
    // simple void method that doesn't return nothing
    public static void simpleMethod() {
        System.out.println("simpleMethod just got called");
    }

    //method that returns something
    public static String returnMethod() {
        return "returnMethod returned something";
    }
    //method that takes an argument and returns something
    public static String paramMethod(String s) {
        return s + " returned by paramMethod";
    }
    public static void simpleMethod(int someNumber) {
        System.out.println("Overloaded function prints a number: " + someNumber);
    }
}
