package Interface_AbstractClass_ConcreteClass;

public abstract class LandVehicle {
    private int wheels;
    private Object motor;

      protected LandVehicle(Object motor) {
    }

    abstract void drive(); // Abstract method can only be declared since cannot be defined the drive method hence without body.
}

