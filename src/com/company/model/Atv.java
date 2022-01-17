package com.company.model;

public class Atv extends Auto{

    public int nrLocuri;

    public Atv(String nrInmatriculare,int nrRoti,double greutate,int nrLocuri){
        super(nrInmatriculare,nrRoti,"Atv",greutate);
        this.nrLocuri=nrLocuri;
    }

    public Atv(String line){
        super(line);
        this.nrLocuri=Integer.parseInt(line.split(",")[4]);
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public String descriereAtv(){
        String text=super.descriereAuto();
        text+="nr locuri : " + nrLocuri + "\n";
        return text;
    }
    @Override
    public String toSave(){
        String text=super.toSave();
        text+="," + nrLocuri;

        return text;
    }
}
