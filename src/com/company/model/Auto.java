package com.company.model;

public class Auto {

    private String nrInmatriculare;
    private int nrRoti;
    private String tipAuto;
    private double greutate;

    public Auto(String nrInmatriculare, int nrRoti, String tipAuto, double greutate){
        this.greutate=greutate;
        this.nrInmatriculare=nrInmatriculare;
        this.nrRoti=nrRoti;
        this.tipAuto = tipAuto;
    }
    public Auto(String line){
        this(line.split(",")[0],
                Integer.parseInt(line.split(",")[1]),
                line.split(",")[2],
                Double.parseDouble(line.split(",")[3])
                );
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

    public void setTipAuto(String tipAuto) {
        this.tipAuto = tipAuto;
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

    public String getTipAuto() {
        return this.tipAuto;
    }

    public String descriereAuto(){
        String text="";
        text+="Nr inmatriculare : " + nrInmatriculare + "\n";
        text+="Nr roti : " + nrRoti + "\n";
        text+="tip permis : " + tipAuto + "\n";
        text+="greutate : " + greutate + "\n";
        return text;
    }
    public String toSave(){
        String text="";
        text+=nrInmatriculare + "," + nrRoti + "," + tipAuto + "," + greutate;
        return text;
    }
}
