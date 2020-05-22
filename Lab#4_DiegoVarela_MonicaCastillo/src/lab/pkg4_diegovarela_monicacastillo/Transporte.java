/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Transporte {
    private int combustible;
    private int distancia;
    private int altitud;
    private ArrayList<Primates> primates=new ArrayList();

    public Transporte(int combustible, int distancia, int altitud) {
        this.combustible = combustible;
        this.distancia = distancia;
        this.altitud = altitud;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public ArrayList<Primates> getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList<Primates> primates) {
        this.primates = primates;
    }

    @Override
    public String toString() {
        return "Transporte{" + "combustible=" + combustible + ", primates=" + primates + '}';
    }
    
}
