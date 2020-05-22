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
public class Espacial extends Transporte {

    private String tipocomb;
    private String planetapart;
    private String planetalleg;

    public Espacial(String tipocomb, String planetapart, String planetalleg, int combustible, int distancia, int altitud) throws MiExcepcion {
        super(combustible, distancia, altitud);
        this.tipocomb = tipocomb;
        this.planetapart = planetapart;
        this.planetalleg = planetalleg;
    } // Fin Constructor Espacial

    public String getTipocomb() {
        return tipocomb;
    } // Fin Get Tipo Combustible

    public void setTipocomb(String tipocomb) {
        this.tipocomb = tipocomb;
    } // Fin Set Tipo Combustible

    public String getPlanetapart() {
        return planetapart;
    } // Fin Get Planeta Partida

    public void setPlanetapart(String planetapart) {
        this.planetapart = planetapart;
    } // Fin Set Planeta Partida

    public String getPlanetalleg() {
        return planetalleg;
    } // Fin Get Planeta Llegada

    public void setPlanetalleg(String planetalleg) {
        this.planetalleg = planetalleg;
    } // Fin Set Planeta Llegada

} // Fin Espacial
