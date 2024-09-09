package Static;
class MyClass {
    static int count = 0; // Static variable

    void incrementCount() {
        count++;
    }

    static void printMessage() {
        System.out.println("This is a static method.");
    }

    static {
        System.out.println("Static block is executed.");
        // Initialize database connection or load configuration
    }
}


public class Static {
    public static void main(String[] args) {
        MyClass.printMessage(); // Calling a static method

        MyClass obj1 = new MyClass();
        obj1.incrementCount();
        MyClass obj2 = new MyClass();
        obj2.incrementCount();

        System.out.println("Count: " + MyClass.count); // Accessing a static variable


    }
}
