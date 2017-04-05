package com.mdshadmanhasan;

/**
 * Created by Md Shadman Hasan on 4/3/2017.
 */
public class Hyundai extends Car {

    public Hyundai (String vehicleName){
        this.vehicleName = vehicleName;
    }
    @Override
    public void drive(double toKilometer) {
        System.out.println("You Are Driving a Hyundai Car and You Have Driven " + toKilometer + "KM");
    }
}
