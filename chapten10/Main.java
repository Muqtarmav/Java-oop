package chapten10;

public class Main {
    public static void main(String[] args) {
        Animal animal= new Animal("animal", 1, 1,20, 5);

        Dog dog = new Dog("jackie", 1,1,12,5,2,4,1,23,"fur");

        dog.eat();



        Fish fish = new Fish("AQUA", 1, 1,2,2,1,1,4);
        fish.move(3);

        fish.moveFin();
    }

}
