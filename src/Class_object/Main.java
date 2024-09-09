package Class_object;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      class Human {
            int age;
            String name;
            int salary;

            Human(int age, String name, int salary) {
                this.age = age;
                this.name = name;
                this.salary = salary;
            }
            Human(){
                this.age = 15;
                this.name = "random";
                this.salary = 20000;
            }
            Human(Human other){
                this.name = other.name;;
                this.age = other.age;
                this.salary = other.salary;
            }
            void greeting(){
                System.out.println("Hello! my name is "+ this.name);
            }

        }
        Human bobby = new Human(19, "Nitiraj Singh Chouhan", 80000);
        System.out.println(bobby.age);


      Human kunal = new Human(22,"Kunal Kushwaha", 200000);
        System.out.println(kunal.salary);
        kunal.greeting();


      Human david = bobby;
        System.out.println(david.name);


        david.name = "David Berk";
        System.out.println(david.name);

        Human random = new Human();
        System.out.println(random.name);

    Human random2  = new Human(kunal);

        System.out.println(random2.name);




    }
}