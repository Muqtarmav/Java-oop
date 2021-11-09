package chapten10;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;


    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }


    public Fish(String name, int brain, int body, int weight, int size, int gills, int eyes, int fins) {
        super(name, brain, body, weight, size);
    }


        private void rest() {


        }

        private void moveMuscles(){

        }

    @Override
    public void move(int speed) {
        moveFin();
        super.move(speed);
    }

    public void moveFin(){
            System.out.println("fish can swim");
        }

}


