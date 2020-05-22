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
public class Helicoptero extends Aereon{
    private int numhelices;
    private int numpatas;

    public Helicoptero(int numhelices, int numpatas, String gasolina, String partida, String llegada, int combustible, int distancia, int altitud) {
        super(gasolina, partida, llegada, combustible, distancia, altitud);
        this.numhelices = numhelices;
        this.numpatas = numpatas;
    }

    public int getNumhelices() {
        return numhelices;
    }

    public void setNumhelices(int numhelices) {
        this.numhelices = numhelices;
    }

    public int getNumpatas() {
        return numpatas;
    }

    public void setNumpatas(int numpatas) {
        this.numpatas = numpatas;
    }
    
}
