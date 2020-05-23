/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

import java.awt.Color;

/**
 *
 * @author diego
 */
public class Primates extends Seresv {

    private int comida;
    private int alimentacion;
    private String planeta;
    private String lugar;

    public Primates(int comida, int alimentacion, String planeta, String lugar, String nombre, String sanguineo, String sexo, double altura, double peso) throws MiExcepcion {
        super(nombre, sanguineo, sexo, altura, peso);
        this.comida = comida;
        this.setAlimentacion(alimentacion);
        this.planeta = planeta;
        this.lugar = lugar;
    } // Fin Constructor Primates

    public int getComida() {
        return comida;
    } // Fin Get Comida

    public void setComida(int comida) {
        this.comida = comida;
    } // Fin Set Comida

    public int getAlimentacion() {
        return alimentacion;
    } // Fin Get Alimentacion

    public void setAlimentacion(int alimentacion) throws MiExcepcion {
        if (alimentacion < 1 && alimentacion > 100) {
            throw new MiExcepcion(Color.orange, "¡La cantidad de comida debe ser del 1 al 100!");
        } // Fin If
        this.alimentacion = alimentacion;
    } // Fin Set Alimentacion

    public String getPlaneta() {
        return planeta;
    } // Fin Get Planeta

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    } // Fin Set Planeta

    public String getLugar() {
        return lugar;
    } // Fin Get Lugar

    public void setLugar(String lugar) {
        this.lugar = lugar;
    } // Fin Set Lugar

    @Override
    public String toString() {
        return "Primates{"+ ", planeta=" + planeta + '}';
    } // Fin To String

} // Fin Primates
