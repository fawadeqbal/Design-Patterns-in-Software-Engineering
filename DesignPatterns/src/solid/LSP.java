/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 *
 * @author fawad
 */
abstract class Vehicle {
    public abstract void startEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        // Start engine logic for a car
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        // Start engine logic for a motorcycle
    }
}

