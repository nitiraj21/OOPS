package Inheritance;

//---------------------------------------> PARENT CLASS <--------------------------------------------------

public class Box {
    double l;
    double w;
    double h;

   public Box(){
        l = -1;
        w = -1;
        h = -1;
    }
    public Box(double side){
       this.l = side;
       this.h = side;
       this.w = side;

    }
    public Box(double l, double w, double h){
       this.l = l;
       this.w = w;
       this.h = h;

    }
    public Box(Box other){
       this.l = other.l;
       this.w = other.w;
       this.h = other.h;
    }

}
