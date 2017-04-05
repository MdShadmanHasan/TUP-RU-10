package com.mdshadmanhasan;

/**
 * Created by Md Shadman Hasan on 4/3/2017.
 */
public abstract class Vehicle {
    protected int tyres;
    protected int gears;
    protected String brakeType;
    protected String vehicleName;
    protected double hornStrength;

    protected abstract void drive(double toKilometer);

    public void displayVehicle(){
        System.out.println("The Name of the vehicle is : " + vehicleName);
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double getHornStrength() {
        return hornStrength;
    }

    public void setHornStrength(double hornStrength) {
        this.hornStrength = hornStrength;
    }
}
