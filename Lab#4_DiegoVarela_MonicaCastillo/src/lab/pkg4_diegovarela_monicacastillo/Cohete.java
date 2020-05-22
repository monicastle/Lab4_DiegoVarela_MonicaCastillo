/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

/**
 *
 * @author Monica
 */
public class Cohete extends Espacial {

    private int numseparaciones;

    public Cohete(int numseparaciones, String tipocomb, String planetapart, String planetalleg, int combustible, int distancia, int altitud) throws MiExcepcion {
        super(tipocomb, planetapart, planetalleg, combustible, distancia, altitud);
        this.numseparaciones = numseparaciones;
    } // Fin Constructor Cohete

    public int getNumseparaciones() {
        return numseparaciones;
    } // Fin Get Num Separaciones

    public void setNumseparaciones(int numseparaciones) {
        this.numseparaciones = numseparaciones;
    } // Fin Set Num Separaciones

} // Fin Cohete
