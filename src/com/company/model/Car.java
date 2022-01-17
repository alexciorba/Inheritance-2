package com.company.model;

public class Car extends  Auto{

    public String marca;

    public Car(String nrInmatriculare,int nrRoti,double greutate,String marca){
        super(nrInmatriculare,nrRoti,"Masina",greutate);
        this.marca=marca;
    }
    public Car(String line){
        super(line);
        this.marca=line.split(",")[4];
    }

    public String descriereCar(){
        String text=super.descriereAuto();
        text+="marca : " + marca + "\n";
        return text;

    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toSave(){
        String text=super.toSave();
        text+="," + marca;
        return text;
    }
}
