package java8;

public interface Vehicle {

    default void start(){
        System.out.println("Vehicle Started");
    }

    static void info(){
        System.out.println("Vehicle Information");
    }

}

class Car implements Vehicle{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();

        Vehicle.info();
    }
}

interface Father {
    default void show(){
        System.out.println("Father");
    }
}

interface Mother {
    default void show(){
        System.out.println("Mother");
    }
}

class Child implements Father,Mother {
    public void show(){
        Father.super.show();
        Mother.super.show();
    }
}