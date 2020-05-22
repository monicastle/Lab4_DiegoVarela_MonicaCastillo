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
public class Naveesp extends Espacial {

    private int propulsores;

    public Naveesp(int propulsores, String tipocomb, String planetapart, String planetalleg, int combustible, int distancia, int altitud) throws MiExcepcion {
        super(tipocomb, planetapart, planetalleg, combustible, distancia, altitud);
        this.propulsores = propulsores;
    } // Fin Constructor Nave Espacial

    public int getPropulsores() {
        return propulsores;
    } // Fin Get Propulsores

    public void setPropulsores(int propulsores) {
        this.propulsores = propulsores;
    } // Fin Set Propulsores

} // Fin Nave Espacial
