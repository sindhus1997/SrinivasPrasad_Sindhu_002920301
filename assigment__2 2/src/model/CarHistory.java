/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
/**
 *
 * @author sindhusrinivas
 */
public class CarHistory {
    private ArrayList<Car> carrecords;
    
    public CarHistory(){
        this.carrecords = new ArrayList<Car>();
    }

    public ArrayList<Car> getHistory() {
        return carrecords;
    }

    public void setHistory(ArrayList<Car> records) {
        this.carrecords = records;
    }
    
    public Car addNewCar(){
        Car NewCar = new Car();
        carrecords.add(NewCar);
        return NewCar;
    }
   
    
    public void deleteCar(Car CAR){
        carrecords.remove(CAR);
    }
}