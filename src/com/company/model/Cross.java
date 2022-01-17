package com.company.model;

import javax.annotation.PostConstruct;

public class Cross extends Auto{

    public int capacitate;

    public Cross(String nrInmatriculare,int nrRoti,double greutate,int capacitate){
        super(nrInmatriculare,nrRoti,"Cross",greutate);
        this.capacitate=capacitate;

    }

    public int getCapacitate() {
        return capacitate;
    }

    public Cross(String line){
        super(line);
        this.capacitate=Integer.parseInt(line.split(",")[4]);
    }

    public String descriereCross(){
        String text=super.descriereAuto();
        text+="capacitate motor : " + capacitate + "\n";
        return  text;
    }

    @Override

    public String toSave(){
        String text=super.toSave();
        text+="," + capacitate ;
        return text;
    }
}
