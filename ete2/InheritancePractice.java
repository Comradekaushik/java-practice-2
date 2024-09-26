package ete2;

import st2.newstrpractice;

public class InheritancePractice {
    public static void main(String[] args) {
        Car myCar = new Car(5);
        System.out.println(myCar.toString());

        
    }
}
class Vehicle{
    int wheels;
    double speed;
    Vehicle(int w){
        this.wheels = w;
        this.speed = w*50;

    }
    

    
}
class Car extends Vehicle{
    int wheels;
    Car(int w){
        super(w);
        this.wheels = w+1;

    }
    @Override
    public String toString(){
        return (this.speed + "****--****" + this.wheels + "****-****" + super.wheels);

    }
}