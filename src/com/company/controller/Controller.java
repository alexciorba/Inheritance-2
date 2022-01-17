package com.company.controller;

import com.company.model.*;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<Auto>listaAuto;

    public Controller(){
        listaAuto=new ArrayList<>();
        load();
    }

    public void load(){
        try {
            File file = new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\model2\\src\\com\\company\\source\\auto.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String linie=scanner.nextLine();
                switch (linie.split(",")[3]){
                    case "Atv":this.listaAuto.add(new Atv(linie));
                        break;
                    case  "Masina" : this.listaAuto.add(new Car(linie));
                        break;
                    case "Cross" : this.listaAuto.add(new Cross(linie));
                        break;
                    case "Scuter" : this.listaAuto.add(new Scooter(linie));
                        break;

                }
            }

        }catch (Exception e){

        }
    }

    public String toSaveAuto(){
        String text="";
        for(Auto auto :listaAuto){
            text+=auto.toSave()+"\n";
        }
        return text;
    }
    public void saveAuto(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\model2\\src\\com\\company\\source\\auto.txt");
        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveAuto());
            printWriter.close();
        }catch (Exception e){

        }
    }


}
