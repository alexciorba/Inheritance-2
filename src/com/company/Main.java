package com.company;

import com.company.model.Car;
import com.company.model.Scooter;

public class Main {

    public static void main(String[] args) {
        Car car=new Car("TM17KIT",4,2200,"Audi");
        System.out.println(car.descriereAuto());

        Scooter scooter=new Scooter("TM02PPP",2,780,"Honda");
        System.out.println(scooter.descriereScuter());
    }
}
