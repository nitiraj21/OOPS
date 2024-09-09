package packages.b;

import static packages.b.message.message2;//this imports a class or method from another package or class
import static packages.c.message.message3; //-----> package.package2.class.method<-----//
import static packages_calling.class3.greeting;

public class packagees {
    public static void main(String[] args) {
        System.out.println("hello world from og package");
        message2();//-----> importing a method from another class <-----//
        message3();//----->importing a method from another class from another package <-----//
        greeting();//----->importing a method from another class from outside package<-----//
    }



}
