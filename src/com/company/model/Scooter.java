package com.company.model;

public class Scooter extends Auto{

    public String marca;
    public Scooter(String nrInmatriculare,int nrRoti,double greutate,String marca){
        super(nrInmatriculare,nrRoti,"A",greutate);
        this.marca=marca;
    }
    public String descriereScuter(){
        String text=super.descriereAuto();
        text+="marca : " + marca + "\n";
        return text;

    }

}
