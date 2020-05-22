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
public class Primates extends Seresv {
    private Transporte transporte;
    private int comida;
    private int alimentacion;
    private String planeta;
    private String lugar;

    public Primates( int comida, int alimentacion, String planeta, String lugar, String nombre, String sanguineo, String sexo, double altura, double peso) {
        super(nombre, sanguineo, sexo, altura, peso);
        this.comida = comida;
        this.alimentacion = alimentacion;
        this.planeta = planeta;
        this.lugar = lugar;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(int alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Primates{" + "transporte=" + transporte + ", planeta=" + planeta + '}';
    }
    
}
