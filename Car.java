package Interface_AbstractClass_ConcreteClass;

public class Car extends LandVehicle implements Vehicle,Transportation { // Car is a concrete class extends from abstract class
                                                                        // LandVehicle and it implements interface vehicle
                                                                        //Multiple interfaces can be implemented but we can only extend one abstract class in a
    Object key;
    int mph;

    public Car(Object key, int mph, Object motor) {
        super(motor);
        this.key = key;
        this.mph = mph;
    }

    public void start(){

    }

    @Override
    public void drive() { //class car has a single and only one responsibility. i.e,. to implement the method drive. (SOLID)- Single Responsibility Principle.
                          // This class is open for extension but it is closed for any modification or alteration.Open/Closed Principle.
                          // Here we have two interfaces rather than having one generalized interface - (SOLID) - Interface Segregation Principle

    }
    @Override
    public void Transport(){

    }
}
