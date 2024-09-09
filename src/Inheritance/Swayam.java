package Inheritance;

public class Swayam {
    int num = 100;
    public void  calc(int num){
        this.num = num*10;
    }
    public void printnum(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        Swayam obj = new Swayam();
        obj.calc(2);
        obj.printnum();
    }

}
