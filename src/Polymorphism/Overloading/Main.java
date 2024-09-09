package Polymorphism.Overloading;
//OVERLOADING//
//MULTIPLE METHODS OF SAME NAME BUT DIFFERENT PARAMETERS ARE CALLED DEPENDING ON THE
//PARAMETERS WE PASS//
//A METHOD WITH DIFF PARAMETERS WILL OVERLOAD THE METHOD WITH NO PARAMETERS//

public class Main {
    public static void main(String[] args) {
        Box box = new Box(); // USING METHOD BOX WHICH TAKES NO INPUT PARAMETERS
        System.out.println(box.h);

        Box box1  = new Box(2,4,6); // USING BOX METHOD THAT TAKES 3 INPUTS OF TYPE INT
        System.out.println(box1.h);

        Box box2 = new Box(4); // USING BOX METHOD THAT TAKES 1 INPUT OF TYPE INT
        System.out.println(box2.l);

    }
}
