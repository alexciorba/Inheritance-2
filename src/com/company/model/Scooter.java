package com.company.model;

public class Scooter extends Auto{

    public String marca;
    public Scooter(String nrInmatriculare,int nrRoti,double greutate,String marca){
        super(nrInmatriculare,nrRoti,"Scuter",greutate);
        this.marca=marca;
    }
    public Scooter(String line){
        super(line);
        this.marca=line.split(",")[4];
    }

    public String getMarca() {
        return marca;
    }

    public String descriereScuter(){
        String text=super.descriereAuto();
        text+="marca : " + marca + "\n";
        return text;

    }

    @Override

    public String toSave(){
        String text=super.toSave();
        text+="," + marca;
        return text;
    }

}
