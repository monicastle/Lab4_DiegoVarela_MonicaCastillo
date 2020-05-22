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

    public Avion(int numpasajeros, String pilotoatm, String gasolina, String partida, String llegada, int combustible, int distancia, int altitud) throws MiExcepcion {
        super(gasolina, partida, llegada, combustible, distancia, altitud);
        this.numpasajeros = numpasajeros;
        this.pilotoatm = pilotoatm;
    } // Fin Constructor Avion

    public int getNumpasajeros() {
        return numpasajeros;
    } // Fin Get Num Pasajeros

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    } // Fin Set Num Pasajeros

    public String getPilotoatm() {
        return pilotoatm;
    } // Fin Get Piloto Automatico

    public void setPilotoatm(String pilotoatm) {
        this.pilotoatm = pilotoatm;
    } // Fin Get Piloto Automatico

} // Fin Avion
