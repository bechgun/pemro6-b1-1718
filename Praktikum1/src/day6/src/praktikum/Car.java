/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Gun Gun
 */
public class Car extends vehicle {
    public Car(){
        System.out.println("Car Constructor");
    }
    void retreat (){
        System.out.println("Mundur");
    }
    
    // overidding method
    @Override
    void brake(){
        System.out.println("Car Brake");
    }
}
