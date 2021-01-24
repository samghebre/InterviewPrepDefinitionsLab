package Abstraction_And_Encapsulation;

import java.io.InvalidClassException;
import java.util.logging.Logger;

public class BankCustomerAbstractionAndEncapsulation {
    //by putting the modifier private in each variable we encapsulate the data to the getter and setter methods
    private int acc_no;
    private float balance_amt;
    private int pin_num;
    private String fullName;
    private int age;
    private String address;


    public void withdraw_Money() throws Exception, InvalidClassException {
        //throws exception in the signature declares an exception
        if(getPin_num()!= pin_num) {
            Logger logger = Logger.getGlobal();
            logger.warning(pin_num + "is wrong PIN#");
            throw new InvalidClassException(String.valueOf(getPin_num())); //throw exception explicitly throw an exception within the method
        }
        //to withdraw money only pin_num is required. This means the remaining properties are hidden for withdraw_Money method. This is abstraction.
        //if wrong pin_num entered it throws a warning message of invalid class exception
    }

    public BankCustomerAbstractionAndEncapsulation(int acc_no, float balance_amt, int pin_num, String fullName, int age, String address) {
        this.acc_no = acc_no;
        this.balance_amt = balance_amt;
        this.pin_num = pin_num;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    //create getters and setters method to access the data in the class
    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public float getBalance_amt() {
        return balance_amt;
    }

    public void setBalance_amt(float balance_amt) {
        this.balance_amt = balance_amt;
    }

    public int getPin_num() throws InvalidClassException {
        //throws exception in the signature declares an exception
        if(getPin_num()!= pin_num) {
            Logger logger = Logger.getGlobal();
            logger.warning(pin_num + "is wrong PIN#");
            throw new InvalidClassException(String.valueOf(getPin_num())); //throw exception explicitly throw an exception within the method
        }
        return pin_num;
    }

    public void setPin_num(int pin_num) {
        this.pin_num = pin_num;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
