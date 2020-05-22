/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

import java.awt.Color;

/**
 *
 * @author Monica
 */
public class MiExcepcion extends Exception {

    private Color color;

    public MiExcepcion() {
        super();
    } // Fin Constructor Mi Excepcion

    public MiExcepcion(Color color, String string) {
        super(string);
        this.color = color;
    } // Fin Constructor Mi Excepcion

    public Color getColor() {
        return color;
    } // Fin Get Color

    public void setColor(Color color) {
        this.color = color;
    } // Fin Set Color

    @Override
    public String toString() {
        return "MiExcepcion{" + "Color: " + color + '}';
    } // Fin To String

} // Fin Mi Excepcion
