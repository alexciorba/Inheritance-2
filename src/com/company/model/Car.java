package com.company.model;

public class Car extends  Auto{

    public String marca;

    public Car(String nrInmatriculare,int nrRoti,double greutate,String marca){
        super(nrInmatriculare,nrRoti,"B",greutate);
        this.marca=marca;
    }

    public String descriereCar(){
        String text=super.descriereAuto();
        text+="marca : " + marca + "\n";
        return text;

    }
}
