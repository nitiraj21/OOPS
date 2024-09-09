package Inheritance;

public class BoxPrice extends BoxWeight{
    double price ;
    public BoxPrice(){
        price = 11;
    }
    BoxPrice(double price, double weight){
        super(weight);
        this.price = price;
    }
    BoxPrice(double price, double weight, double side){
        super(weight, side);
        this.price = price;
    }

}
