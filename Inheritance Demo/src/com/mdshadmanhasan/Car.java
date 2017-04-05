package com.mdshadmanhasan;

/**
 * Created by Md Shadman Hasan on 4/3/2017.
 */
public abstract class Car extends Vehicle {
    protected boolean airConditionedOrNot;

    public boolean isAirConditionedOrNot() {
        return airConditionedOrNot;
    }

    public void setAirConditionedOrNot(boolean airConditionedOrNot) {
        this.airConditionedOrNot = airConditionedOrNot;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyres=" + tyres +
                ", airConditionedOrNot=" + airConditionedOrNot +
                ", gears=" + gears +
                ", brakeType='" + brakeType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", hornStrength=" + hornStrength +
                '}';
    }
}
