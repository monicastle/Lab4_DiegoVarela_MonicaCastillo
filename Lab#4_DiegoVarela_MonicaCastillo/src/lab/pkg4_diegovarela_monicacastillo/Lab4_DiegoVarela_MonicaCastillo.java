/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Monica
 */
public class Lab4_DiegoVarela_MonicaCastillo {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<String> usernames = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char resp = 's';
        while (resp == 's' || resp == 'S') {

            System.out.println("***MENU***");
            System.out.println("1) Registro");
            System.out.println("2) Log In");
            System.out.println("3) Salida");
            System.out.print("Ingrese la opcion deseada: ");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¡Bienvenido al Sistema de Registro!");
                    System.out.print("Ingrese su correo electronico: ");
                    String correo = entrada.next();
                    System.out.print("Ingrese un nombre de usuario: ");
                    String usuario = entrada.next();
                    while (Usernames(usuario) == true) {
                        System.out.println("¡El username ingresado ya se encuentra registrado!");
                        System.out.print("Ingrese un nombre de usuario: ");
                        usuario = entrada.next();
                    } // Fin While
                    ArrayList<String> idiomas = new ArrayList();
                    char resp2 = 's';
                    while (resp2 == 's' || resp2 == 'S') {
                        System.out.println("***IDIOMAS***");
                        System.out.println("1. Español");
                        System.out.println("2. Ingles");
                        System.out.println("3. Frances");
                        System.out.println("4. Italiano");
                        System.out.println("5. Aleman");
                        System.out.println("6. Portugues");
                        System.out.println("7. Mandarin");
                        System.out.println("8. No hablo mas Idiomas");
                        System.out.print("Ingrese el idioma que habla: ");
                        int idioma = entrada.nextInt();
                        switch (idioma) {
                            case 1:
                                idiomas.add("Español");
                                break;
                            case 2:
                                idiomas.add("Ingles");
                                break;
                            case 3:
                                idiomas.add("Frances");
                                break;
                            case 4:
                                idiomas.add("Italiano");
                                break;
                            case 5:
                                idiomas.add("Aleman");
                                break;
                            case 6:
                                idiomas.add("Portugues");
                                break;
                            case 7:
                                idiomas.add("Mandarin");
                                break;
                            case 8:
                                resp2 = 'n';
                                break;
                            default:
                                System.out.println("¡Entrada no valida!");
                        } // Fin Default
                    } // Fin While Respuesta
                    System.out.print("Ingrese su contraseña: ");
                    String contraseña = entrada.next();
                    System.out.print("Ingrese su fecha de nacimiento :");
                    String fecha = entrada.next();
                    System.out.println("¡Se ha logrado registrar exitosamente!");
                    break;
                case 2:
                    break;
                case 3:
                    resp = 'n';
                    break;
                default:
                    System.out.println("¡Entrada no valida!");
            } // Fin Switch
        } // Fin While Respuesta
    } // Fin Main

    public static boolean Usernames(String username) {
        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(username)) {
                return true;
            } else {
                return false;
            } // Fin If
        } // Fin For
        return false;
    } // Fin Codigos

//    System.out.println (
//
//    "***MENU***");
//    System.out.println (
//
//    "1) Agregar Ingeniero");
//    System.out.println (
//
//    "2) Modificar Ingeniero");
//    System.out.println (
//
//    "3) Eliminar Ingeniero");
//    System.out.println (
//
//"4) Viajar");
} // Fin Class

