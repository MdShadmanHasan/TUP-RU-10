package com.mdshadmanhasan.bike;

import com.mdshadmanhasan.Vehicle;

/**
 * Created by Md Shadman Hasan on 4/3/2017.
 */
public class Bike extends Vehicle {
    @Override
    public void drive(double toKilometer) {
        System.out.println("This Bike has driven " + toKilometer + "KM");
    }

    public Bike(String vehicleName) {
        this.vehicleName = vehicleName;
        tyres = 2;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "tyres=" + tyres +
                ", gears=" + gears +
                ", brakeType='" + brakeType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", hornStrength=" + hornStrength +
                '}';
    }
}
