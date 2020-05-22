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
public class Avion extends Aereon {
    private int numpasajeros;
    private String pilotoatm;

    public Avion(int numpasajeros, String pilotoatm, String gasolina, String partida, String llegada, int combustible, int distancia, int altitud) {
        super(gasolina, partida, llegada, combustible, distancia, altitud);
        this.numpasajeros = numpasajeros;
        this.pilotoatm = pilotoatm;
    }

    public int getNumpasajeros() {
        return numpasajeros;
    }

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }

    public String getPilotoatm() {
        return pilotoatm;
    }

    public void setPilotoatm(String pilotoatm) {
        this.pilotoatm = pilotoatm;
    }
    
}
