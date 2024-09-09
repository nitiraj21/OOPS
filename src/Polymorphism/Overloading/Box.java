package Polymorphism.Overloading;

public class Box {
    int l ;
    int w;
    int h;
    Box(){                // WILL RUN WHEN NO PARAMETERS ARE PASSED
        int l  = 2;
        int h = 3;
        int w = 5;
    }
    Box(int l, int w, int h){  // WILL RUN WHEN 3 PARAMETERS ARE PASSED
        this.h = h;
        this.w = w;
        this.l = l;
    }
    Box(int side){            // WILL RUN WHEN 1 PARAMETERS ARE PASSED
        this.h = side;
        this.w = side;
        this.l = side;
    }
}
