package com.mdshadmanhasan.main;

import com.mdshadmanhasan.BMW;
import com.mdshadmanhasan.Hyundai;
import com.mdshadmanhasan.bike.Bike;

/**
 * Created by Md Shadman Hasan on 4/3/2017.
 */
public class main {
    public static void main(String[] args) {
        BMW myBMW = new BMW("Awesome BMW");
        myBMW.displayVehicle();
        myBMW.drive(300);
        myBMW.setAirConditionedOrNot(true);
        myBMW.setTyres(4);
        myBMW.setBrakeType("Hydrolic");
        myBMW.setGears(5);
        myBMW.setHornStrength(100.5);
        System.out.println(myBMW.toString());

        BMW myBMW2 = new BMW("GT9");
        myBMW2.displayVehicle();
        myBMW2.drive(400);

        BMW myBMW3 = new BMW("GT10");
        myBMW3.displayVehicle();
        myBMW3.drive(500);

        BMW myBMW4 = new BMW("GT11");
        myBMW4.displayVehicle();
        myBMW4.drive(600);

        Hyundai hnd1 = new Hyundai("HND001");
        hnd1.displayVehicle();
        hnd1.drive(100);

        Hyundai hnd2 = new Hyundai("HND002");
        hnd2.displayVehicle();
        hnd2.drive(200);

        Bike honda = new Bike("Honda");
        honda.displayVehicle();;
        honda.drive(50);


    }
}
