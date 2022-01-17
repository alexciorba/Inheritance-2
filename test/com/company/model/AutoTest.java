package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    @Test


    public void testConstructor(){
        Auto auto=new Auto("TM17KIT,4,Masina,2400");
        assertEquals(auto.getNrInmatriculare(),"TM17KIT");
        assertEquals(auto.getNrRoti(),4);
        assertEquals(auto.getTipAuto(),"Masina");
        assertEquals(auto.getGreutate(),2400);



        Car car= new Car("TM11ANA,4,Masina,2100,Audi");
        assertEquals(car.getNrInmatriculare(),"TM11ANA");
        assertEquals(car.getNrRoti(),4);
        assertEquals(car.getTipAuto(),"Masina");
        assertEquals(car.getGreutate(),2100);
        assertEquals(car.getMarca(),"Audi");

        Atv atv=new Atv("TM22AAA,4,Atv,1000,2");
        assertEquals(atv.getNrInmatriculare(),"TM22AAA");
        assertEquals(atv.getNrRoti(),4);
        assertEquals(atv.getTipAuto(),"Atv");
        assertEquals(atv.getGreutate(),1000);
        assertEquals(atv.getNrLocuri(),2);

        Cross cross =new Cross("TM19CCC,2,Cross,700,125");
        assertEquals(cross.getNrInmatriculare(),"TM19CCC");
        assertEquals(cross.getNrRoti(),2);
        assertEquals(cross.getTipAuto(),"Cross");
        assertEquals(cross.getGreutate(),700);
        assertEquals(cross.getCapacitate(),125);


        Scooter scooter=new Scooter("TM12NNN,2,Scuter,800,Piagio");
        assertEquals(scooter.getNrInmatriculare(),"TM12NNN");
        assertEquals(scooter.getNrRoti(),2);
        assertEquals(scooter.getTipAuto(),"Scuter");
        assertEquals(scooter.getGreutate(),800);
        assertEquals(scooter.getMarca(),"Piagio");



    }







}