/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Transporte {

    private int combustible;
    private int distancia;
    private int altitud;
    private ArrayList<Primates> primates = new ArrayList();

    public Transporte(int combustible, int distancia, int altitud) throws MiExcepcion{
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
        return "Transporte{" + "combustible=" + combustible + ", primates=" + primates + '}';
    } // Fin To String

} // Fin Transporte
