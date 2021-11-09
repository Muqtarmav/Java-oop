package chapten10;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int brain, int body, int weight, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, weight, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew (){
        System.out.println("Dog.chew() called");
    }

//    @Override
//    public void move() {
//        super.move();
//        System.out.println("Dog.move() called");
//        run();
  //  }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() is callec");

    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }

    public void run (){
        System.out.println("dog can run ");
        move(10);
       //super.move(10);
    }
    public void walk(){
        System.out.println("animal can walk at speed ");
        move(5);
      //  super.move(5);
    }





}
