package Assesment;

public class Bmi {
    private String name;
    private int age;
    private double weight;
    private double height;
    private final double kilogram_per_second = 0.4539;
    private final double Meter_per_inch = 0.0254;

    public Bmi(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }


    public void setName(String name){
        this.name = name;

    }

        public void setAge(int age ) {
            if (age < 0) {
                throw new IllegalArgumentException("invalid age");

            }
            this.age = age;
        }
        public void setWeight(double weight){
        if (weight < 0.0){
            throw new IllegalArgumentException("invalid weight");

        }
        this.weight = weight;
        }

        public void setHeight(double height){
        if (height < 0.0){
            throw new IllegalArgumentException("wrong value");
        }
        this.height = height;
        }

        public String getName(){
        return name;
        }
        public int getAge(){
        return age;
        }
        public double getWeight(){
        return weight;

        }
        public double getHeight(){
        return height;
        }


        public double getBMI(){
        double bmi = weight * kilogram_per_second / ((height) * Meter_per_inch) * (height * Meter_per_inch);
        return Math.round(bmi * 100) / 100.0;

        }

        public String getStatus(){
        double bmi = getBMI();
        if (bmi < 18.5){
            return "underweight";
        }
        if (bmi < 25){
            return "normal";
        }
        if (bmi < 30){
            return "overweight";
        }
        else
            return "obese";
        }


}
