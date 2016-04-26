/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restreader;

/**
 *
 * @author casva
 */
public class CarTracker {
    
    private int id;
    private int carId;
    private double latitude;
    private double longtitude;
    
    public CarTracker(int id, int carId,double latitude, double longtitude){
        this.id = id;
        this.carId = carId;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }
    
    
    
}
