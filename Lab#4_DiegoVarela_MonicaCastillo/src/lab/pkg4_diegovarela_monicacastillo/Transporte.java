/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Transporte implements Viajar {

    Scanner entrada = new Scanner(System.in);
    private int combustible = 100;
    private int distancia;
    private int altitud;
    private ArrayList<Primates> primates = new ArrayList();

    public Transporte(int combustible, int distancia, int altitud) throws MiExcepcion {
        this.setCombustible(combustible);
        this.distancia = distancia;
        this.altitud = altitud;
    } // Fin Constructor Transporte

    public int getCombustible() {
        return combustible;
    } // Fin Get Combustible

    public void setCombustible(int combustible) throws MiExcepcion {
        if (combustible < 1 && combustible > 100) {
            throw new MiExcepcion(Color.red, "¡La cantidad de combustible debe ser del 1 al 100!");
        } // Fin If
        this.combustible = combustible;
    } // Fin Set Combustible

    public int getDistancia() {
        return distancia;
    } // Fin Get Distancia

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    } // Fin Set Distancia

    public int getAltitud() {
        return altitud;
    } // Fin Get Altitud

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    } // Fin Set Altitud

    public ArrayList<Primates> getPrimates() {
        return primates;
    } // Fin Get Primates

    public void setPrimates(ArrayList<Primates> primates) {
        this.primates = primates;
    } // Fin Set Primates

    @Override
    public String toString() {
        return "Transporte{" + "Combustible: " + combustible + ", Primates: " + primates + '}';
    } // Fin To String

    @Override
    public void Viajar(Transporte transporte, int distancia) {
        int distanciaresta = transporte.getDistancia();
        boolean valid = true;
        int totalcomida;
        int comb = transporte.getCombustible();
        int combresta;
        if (distancia > transporte.getDistancia()) {
            System.out.println("¡No se puede viajar!");
            System.out.println("No ajusta el combustible");
            valid = false;
        } else {
            distanciaresta = distanciaresta - distancia;
            transporte.setDistancia(distanciaresta);
            combresta = comb - ((distancia / transporte.getDistancia()) * 100);
            try {
                transporte.setCombustible(combresta);
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());;
            } // Fin Try Catch 
        } // Fin If
        if (valid) {
            for (int i = 0; i < transporte.getPrimates().size(); i++) {
                totalcomida = distancia * transporte.getPrimates().get(i).getAlimentacion();
                if (100 > totalcomida) {
                    transporte.getPrimates().get(i).setComida(transporte.getPrimates().get(i).getAlimentacion() - totalcomida);
                } else {
                    System.out.println("¡No se puede viajar!");
                    System.out.println("No ajusta la comida para un mono");
                } // Fin If
            } // Fin For
        } // Fin If
    } // Fin Viajar
} // Fin Transporte
