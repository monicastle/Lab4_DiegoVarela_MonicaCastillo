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
    static ArrayList<String> contraseñas = new ArrayList();
    static ArrayList ingenieros = new ArrayList();
    static ArrayList transportes = new ArrayList();

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
                    System.out.print("Ingrese su nombre: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Ingrese su correo electronico: ");
                    String correo = entrada.next();
                    System.out.print("Ingrese un nombre de usuario: ");
                    String usuario = entrada.next();
                    while (Usernames(usuario) == true) {
                        System.out.println("¡El username ingresado ya se encuentra registrado!");
                        System.out.print("Ingrese un nombre de usuario: ");
                        usuario = entrada.next();
                    } // Fin While
                    usernames.add(usuario);
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
                    contraseñas.add(contraseña);
                    System.out.print("Ingrese su fecha de nacimiento :");
                    String fecha = entrada.next();
                    System.out.print("Ingrese su grupo sanguineo :");
                    String sanguineo = entrada.next();
                    System.out.println("***Genero***");
                    System.out.println("1. Femenino");
                    System.out.println("2. Masculino");
                    System.out.println("Ingrese su genero: ");
                    int opcion2 = entrada.nextInt();
                    String sexo = "";
                    switch (opcion2) {
                        case 1:
                            sexo = "Femenino";
                            break;
                        case 2:
                            sexo = "Masculino";
                            break;
                        default:
                            System.out.println("¡Entrada no valida!");
                    } // Fin Switch Generos
                    System.out.print("Ingrese su altura: ");
                    double altura = entrada.nextDouble();
                    System.out.println("Ingrese su peso: ");
                    double peso = entrada.nextDouble();
                    System.out.println("¡Se ha logrado registrar exitosamente!");
                    ingenieros.add(new Ingenieros(correo, usuario, contraseña, fecha, nombre, sanguineo, sexo, altura, peso));
                    break;
                case 2:
                    System.out.print("Ingrese su nombre de uuario: ");
                    String user2 = entrada.next();
                    while (Usernames(user2) == false) {
                        System.out.println("¡El username ingresado no se encuentra registrado!");
                        System.out.print("Ingrese su nombre de usuario: ");
                        user2 = entrada.next();
                    } // Fin While
                    System.out.print("Ingrese su contraseña: ");
                    String contra2 = entrada.next();
                    while (Registro(user2, contra2) == false) {
                        System.out.println("¡Contraseña no valida!");
                        System.out.print("Ingrese su contraseña: ");
                        contra2 = entrada.next();
                    } // Fin While
                    System.out.println("¡Bienvenido " + user2 + "!");
                    System.out.println("¿Que desea hacer el dia de hoy?");
                    System.out.println("***MENU***");
                    System.out.println("1) Agregar Ingeniero");
                    System.out.println("2) Modificar Ingeniero");
                    System.out.println("3) Eliminar Ingeniero");
                    System.out.println("4) Viajar");
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
    } // Fin Usernames

    public static boolean Registro(String username, String password) {
        int pos;
        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(username)) {
                pos = i;
                if (contraseñas.get(pos).equals(password)) {
                    return true;
                } else {
                    return false;
                }// Fin If
            } // Fin If
        } // Fin For
        return false;
    } // Fin Registro

} // Fin Class

