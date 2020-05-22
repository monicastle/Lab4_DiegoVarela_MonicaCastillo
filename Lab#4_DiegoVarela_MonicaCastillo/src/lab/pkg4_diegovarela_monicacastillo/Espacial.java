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
public class Espacial extends Transporte{
    private String tipocomb;
    private String planetapart;
    private String planetalleg;

    public Espacial(String tipocomb, String planetapart, String planetalleg, int combustible, int distancia, int altitud) {
        super(combustible, distancia, altitud);
        this.tipocomb = tipocomb;
        this.planetapart = planetapart;
        this.planetalleg = planetalleg;
    }

    public String getTipocomb() {
        return tipocomb;
    }

    public void setTipocomb(String tipocomb) {
        this.tipocomb = tipocomb;
    }

    public String getPlanetapart() {
        return planetapart;
    }

    public void setPlanetapart(String planetapart) {
        this.planetapart = planetapart;
    }

    public String getPlanetalleg() {
        return planetalleg;
    }

    public void setPlanetalleg(String planetalleg) {
        this.planetalleg = planetalleg;
    }
    
}
