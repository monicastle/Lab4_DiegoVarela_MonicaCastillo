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
public class Seresv {

    private String nombre;
    private String sanguineo;
    private String sexo;
    private double altura;
    private double peso;

    public Seresv(String nombre, String sanguineo, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.sanguineo = sanguineo;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    } // Fin Constructor Seres Vivos

    public String getNombre() {
        return nombre;
    } // Fi Get Nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // Fin Set Nombre

    public String getSanguineo() {
        return sanguineo;
    } // Fin Get Sanguineo

    public void setSanguineo(String sanguineo) {
        this.sanguineo = sanguineo;
    } // Fin Set Sanguineo

    public String getSexo() {
        return sexo;
    } // Fin Get Sexo

    public void setSexo(String sexo) {
        this.sexo = sexo;
    } // Fin Set Sexo

    public double getAltura() {
        return altura;
    } // Fin Get Altura

    public void setAltura(double altura) {
        this.altura = altura;
    } // Fin Set Altura

    public double getPeso() {
        return peso;
    } // Fin Get Peso

    public void setPeso(double peso) {
        this.peso = peso;
    } // Fin Set Peso

    @Override
    public String toString() {
        return "Seresv{" + "nombre=" + nombre + ", sexo=" + sexo + '}';
    } // Fin To String

} // Fin Seres Vivos
