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
public class Helicoptero extends Aereon {

    private int numhelices;
    private int numpatas;

    public Helicoptero(int numhelices, int numpatas, String gasolina, String partida, String llegada, int combustible, int distancia, int altitud) throws MiExcepcion {
        super(gasolina, partida, llegada, combustible, distancia, altitud);
        this.numhelices = numhelices;
        this.numpatas = numpatas;
    } // Fin Constructor Helicoptero

    public int getNumhelices() {
        return numhelices;
    } // Fin Get Num Helices

    public void setNumhelices(int numhelices) {
        this.numhelices = numhelices;
    } // Fin Set Num Helices

    public int getNumpatas() {
        return numpatas;
    } // Fin Get Num Patas

    public void setNumpatas(int numpatas) {
        this.numpatas = numpatas;
    } // Fin Set Num Patas

} // Fin Helicoptero
