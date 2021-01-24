package Polymorphism_And_Inheritance;

public class Father {
    String firstName;
    String lastName;
    long id;

    public void eat(String meat) {

    }
    public Father(String firstName, String lastName, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
}
class Child1 extends Father{

    public Child1(String firstName, String lastName, long id) {

        super(firstName, lastName, id);
    }

    @Override //method override - Polymorphism
    public void eat(String sandwich){

    }
}

class Child2 extends Father{ //Child inherit Father class - Inheritance

    public Child2(String firstName, String lastName, long id) {

        super(firstName, lastName, id);
    }
    @Overload
    public void eat(String bread, String tacos ){

    }
    @Overload  //method overloading is demonstrated same method different number of arguments
    public void eat(String cake){

    }
}

class Spouse extends Father {

    public Spouse(String firstName, String lastName, long id) {
        super(firstName, lastName, id);
    }

    @Override // method override eat method in the father class also has the same parameter as in Spouse class; which is String meat
    public void eat(String meat){

    }
}
