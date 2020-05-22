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
public class Aereon extends Transporte {

    private String gasolina;
    private String partida;
    private String llegada;

    public Aereon(String gasolina, String partida, String llegada, int combustible, int distancia, int altitud) throws MiExcepcion {
        super(combustible, distancia, altitud);
        this.gasolina = gasolina;
        this.partida = partida;
        this.llegada = llegada;
    } // Fin Constructor Aereo Normal

    public String getGasolina() {
        return gasolina;
    } // Fin Get Gasolina

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    } // Fin Set Gasolina

    public String getPartida() {
        return partida;
    } // Fin Get Partida

    public void setPartida(String partida) {
        this.partida = partida;
    } // Fin Set Partida

    public String getLlegada() {
        return llegada;
    } // Fin Get Llegada

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    } // Fin Set Llegada

} // Fin Aereo Normal
