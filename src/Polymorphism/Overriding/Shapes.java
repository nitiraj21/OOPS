package Polymorphism.Overriding;

public class Shapes {
     void area(){
        System.out.println("I am in Shapes");
    }
   // static void area(){                 this cant be overrided as it is final and is a early binding
     //   System.out.println("I am in Shapes"); its always gonna call the final method no matter what
  //  }
}
