package Polymorphism.Overriding;

//POLYMORPHISM MEANS REPRESENTING IN DIFFERENT FORMS//
//THIS ONE IS RUNTIME POLYMORPHISM//
//THIS IS METHOD OVERRIDING//
// A METHOD WITH SAME NAME AND PARAMETERS IN PARENT CLASS BUT BLOCK OF CODE
// IS DIFFERENT CAN BE OVERRIDE BY SUBCLASS
// WITH SAME METHOD AND PARAMETERS
//IT IS OF 2 TYPES//
//HERE SUBCLASSES WILL HAVE SAME METHODS NAMES AND PARAMETERS AS IN THE PARENT CLASS BUT
//THE ONE TO CALL DEPENDS ON THE OBJECT TYPE OF THE CLASS
//BUT THE REFERENCE CLASS SHOULD HAVE A METHOD WITH SAME NAME//

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new  Shapes();
        Shapes circle = new Circle(); // Circle is overriding Shapes method//
        triangle triangle = new triangle();
        Square square = new Square();


        circle.area();// the method which to call depends on the object type
                      // and not the reference type but the method should also
                     // be present at reference class
                     // Shapes should have area() METHOD
                     // as it will check it in compile time
                     // but at runtime it will check for the obj type and run method present in that class
    }
}
