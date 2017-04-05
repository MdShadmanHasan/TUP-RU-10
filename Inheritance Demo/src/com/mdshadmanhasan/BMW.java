package com.mdshadmanhasan;

/**
 * Created by Md Shadman Hasan on 4/3/2017.
 */
public class BMW extends Car {

    public BMW (String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public void drive(double toKilometer) {
        System.out.println("BMW has driven " + toKilometer + "KM");
    }


}
