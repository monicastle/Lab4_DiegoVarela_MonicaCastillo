/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

/**
 *
 * @author diego
 */
public class Mono extends Primates {

    private String color;

    public Mono(String color, int comida, int alimentacion, String planeta, String lugar, String nombre, String sanguineo, String sexo, double altura, double peso) throws MiExcepcion {
        super(comida, alimentacion, planeta, lugar, nombre, sanguineo, sexo, altura, peso);
        this.color = color;
    } // Fin Mono

    public String getColor() {
        return color;
    } // Fin Get Color

    public void setColor(String color) {
        this.color = color;
    } // Fin Set Color

} // Fin Mono
