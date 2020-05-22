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
public class Gorila extends Primates {

    private int iq;

    public Gorila(int iq, int comida, int alimentacion, String planeta, String lugar, String nombre, String sanguineo, String sexo, double altura, double peso) throws MiExcepcion {
        super(comida, alimentacion, planeta, lugar, nombre, sanguineo, sexo, altura, peso);
        this.setIq(iq);
    } // Fin Constructor Gorila

    public int getIq() {
        return iq;
    } // Fin Get IQ

    public void setIq(int iq) throws MiExcepcion {
        if (iq < 130 && iq > 139) {
            throw new MiExcepcion(Color.red, "¡El IQ debe ser entre 130 y 139!");
        } // Fin If
        this.iq = iq;
    } // Fin Set IQ

} // Fin Gorila
