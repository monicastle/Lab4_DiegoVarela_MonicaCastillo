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
public class Gorila extends Primates{
    private int iq;

    public Gorila(int iq , int comida, int alimentacion, String planeta, String lugar, String nombre, String sanguineo, String sexo, double altura, double peso) {
        super( comida, alimentacion, planeta, lugar, nombre, sanguineo, sexo, altura, peso);
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
    
}
