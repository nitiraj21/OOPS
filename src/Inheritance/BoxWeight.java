package Inheritance;

public class BoxWeight extends Box {
    double weight;
    BoxWeight (){
        weight = -1;
    }
    BoxWeight(double weight){
        this.weight = weight;
    }
    BoxWeight(double l, double h, double w , double weight){
        super(l, w, h);
        this.weight = weight;
    }
    BoxWeight(double weight,double side){
        super(side);
        this.weight = weight;
    }
}
