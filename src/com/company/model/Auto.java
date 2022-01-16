package com.company.model;

public class Auto {

    private String nrInmatriculare;
    private int nrRoti;
    private String tipPermis;
    private double greutate;

    public Auto(String nrInmatriculare,int nrRoti,String tipPermis,double greutate){
        this.greutate=greutate;
        this.nrInmatriculare=nrInmatriculare;
        this.nrRoti=nrRoti;
        this.tipPermis=tipPermis;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public void setTipPermis(String tipPermis) {
        this.tipPermis = tipPermis;
    }

    public double getGreutate() {
        return this.greutate;
    }

    public int getNrRoti() {
        return this.nrRoti;
    }

    public String getNrInmatriculare() {
        return this.nrInmatriculare;
    }

    public String getTipPermis() {
        return this.tipPermis;
    }

    public String descriereAuto(){
        String text="";
        text+="Nr inmatriculare : " + nrInmatriculare + "\n";
        text+="Nr roti : " + nrRoti + "\n";
        text+="tip permis : " + tipPermis + "\n";
        text+="greutate : " + greutate + "\n";
        return text;
    }
}
