package Inheritance;

public class Main {
    public static void main(String[] args) {
       // Box box1 = new Box(6,7,8); // calling the constructor taking 3 inputs//
       // System.out.println(box1.w);


       // Box box2 = new Box(); // calling the constructor taking no input (have their own values declared)
       // System.out.println(box2.w);


       // Box box3 = new Box(5); // calling constructor taking single input//
        //System.out.println(box3.l);


       // Box box4 = new Box(box2); // calliing constructor taking other objects//
        //System.out.println(box4.l);


 //----------------------------------->USING THE CHILD CLASS<--------------------------------------------//


        BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.weight);


        BoxWeight boxWeight1 = new BoxWeight();
        System.out.println(boxWeight1.l);


        BoxWeight boxWeight2 = new BoxWeight(8,4,56,4);
        System.out.println(boxWeight2.l);


        BoxWeight boxWeight3 = new BoxWeight(3,5);
        System.out.println(boxWeight3.l);


        //------------------------------------>USING MULTI LEVEL INHERITANCE<------------------------------------//


        BoxPrice boxPrice = new BoxPrice();
        System.out.println(boxPrice.weight);
        System.out.println(boxPrice.price);


        BoxPrice boxPrice1 = new BoxPrice(1,3);
        System.out.println(boxPrice1.price);
        System.out.println(boxPrice1.weight);



        BoxPrice boxPrice2 = new BoxPrice();
        System.out.println(boxPrice2.l);


        BoxPrice boxPrice3 = new BoxPrice(2,4,5);
        System.out.println("h = " + boxPrice3.h + " w= " + boxPrice3.l + " weight = " + boxPrice3.weight + " p = " + boxPrice3.price);


    }
}


