/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    static ArrayList<Primates> primates = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
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
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
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
                    ingenieros.add(new Ingenieros(correo, usuario, contraseña, sdf.parse(fecha), nombre, sanguineo, sexo, altura, peso));
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
                    System.out.println("1) Agregar ");
                    System.out.println("2) Modificar");
                    System.out.println("3) Eliminar");
                    System.out.println("4) Viajar");
                    int op = entrada.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("¿Que desea agregar?");
                            System.out.println("1) Mono");
                            System.out.println("2) Gorila");
                            System.out.println("3) Helicoptero");
                            System.out.println("4) Avion comercial");
                            System.out.println("5) Nave espacial");
                            System.out.println("6) Cohete");
                            int opc = entrada.nextInt();
                            switch (opc) {
                                case 1:
                                    System.out.println("Ingrese el color de piel del mono:");
                                    String color = entrada.next();
                                    System.out.println("Ingrese la cantidad de comida que consume:");
                                    int consumo = entrada.nextInt();
                                    System.out.println("Ingrese el planeta de salida:");
                                    String planeta = entrada.next();
                                    System.out.println("Ingrese el lugar de nacimiento:");
                                    String nacimiento = entrada.next();
                                    System.out.println("¡Bienvenido al Sistema de Registro!");
                                    System.out.print("Ingrese su nombre: ");
                                    String nomb = entrada.nextLine();
                                    System.out.print("Ingrese su grupo sanguineo :");
                                    String sanguineo2 = entrada.next();
                                    System.out.println("***Genero***");
                                    System.out.println("1. Femenino");
                                    System.out.println("2. Masculino");
                                    System.out.println("Ingrese su genero: ");
                                    int opcio = entrada.nextInt();
                                    String sexo2 = "";
                                    switch (opcio) {
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
                                    double altura2 = entrada.nextDouble();
                                    System.out.println("Ingrese su peso: ");
                                    double peso2 = entrada.nextDouble();
                                    primates.add(new Mono(color, 100, consumo, planeta, nacimiento, nomb, sanguineo2, sexo2, altura2, peso2));
                                    break;
                                case 2:
                                    System.out.println("Ingrese el iq del gorila");
                                    int iq = entrada.nextInt();
                                    if (iq < 130 && iq > 139) {
                                        System.out.println("Porfavor elija un IQ entre 130 y 139 porfavor");
                                        iq = entrada.nextInt();
                                    }
                                    System.out.println("Ingrese la cantidad de comida que consume:");
                                    int consumo2 = entrada.nextInt();
                                    System.out.println("Ingrese el planeta de salida:");
                                    String planeta2 = entrada.next();
                                    System.out.println("Ingrese el lugar de nacimiento:");
                                    String nacimiento2 = entrada.next();
                                    System.out.println("¡Bienvenido al Sistema de Registro!");
                                    System.out.print("Ingrese su nombre: ");
                                    String nomb3 = entrada.nextLine();
                                    System.out.print("Ingrese su grupo sanguineo :");
                                    String sanguineo3 = entrada.next();
                                    System.out.println("***Genero***");
                                    System.out.println("1. Femenino");
                                    System.out.println("2. Masculino");
                                    System.out.println("Ingrese su genero: ");
                                    int optio = entrada.nextInt();
                                    String sexo3 = "";
                                    switch (optio) {
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
                                    double altura3 = entrada.nextDouble();
                                    System.out.println("Ingrese su peso: ");
                                    double peso3 = entrada.nextDouble();
                                    primates.add(new Gorila(iq, 100, consumo2, planeta2, nacimiento2, nomb3, sanguineo3, sexo3, altura3, peso3));
                                    break;
                                case 3:
                                    System.out.println("Ingrese el numero de helices.");
                                    int numhelices = entrada.nextInt();
                                    System.out.println("Ingrese el numero de patas.");
                                    int numpatas = entrada.nextInt();
                                    System.out.println("Ingrese el tipo de gasolina :");
                                    System.out.println("1) Regular");
                                    System.out.println("2) Super");
                                    System.out.println("3) Diesel");
                                    int opti = entrada.nextInt();
                                    String gasolina = "";
                                    switch (opti) {
                                        case 1:
                                            gasolina = "Regular";
                                            break;
                                        case 2:
                                            gasolina = "Super";
                                            break;
                                        case 3:
                                            gasolina = "Diesel";
                                            break;
                                    }
                                    System.out.println("Ingrese de que pais sale el helicoptero:");
                                    String partida = entrada.next();
                                    System.out.println("Ingrese el pais de llegada del helicoptero");
                                    String llegada = entrada.next();
                                    System.out.println("Ingrese la cantidad de km que puede recorrer el helicoptero");
                                    int recorrido = entrada.nextInt();
                                    System.out.println("ingrese la altitud:");
                                    int altitud = entrada.nextInt();
                                    Helicoptero e = new Helicoptero(numhelices, numpatas, gasolina, partida, llegada, 100, recorrido, altitud);
                                    transportes.add(e);
                                    for (Primates pr : primates) {
                                        System.out.println("pr");
                                    }
                                    System.out.println("Que primate le desea asignar al helicoptero?");
                                    int n = entrada.nextInt();
                                    primates.get(n).setTransporte(e);
                                    e.getPrimates().add(primates.get(n));
                                    break;
                                case 4:
                                    System.out.println("Ingrese el numero de pasajeros que puede llevar:");
                                    int numpasajeros = entrada.nextInt();
                                    System.out.println("Funciona el piloto automatico?");
                                    System.out.println("1) Si");
                                    System.out.println("2) No");
                                    int o = entrada.nextInt();
                                    String piloto = "";
                                    switch (o) {
                                        case 1:
                                            piloto = "Funciona";
                                            break;
                                        case 2:
                                            piloto = "No funciona";
                                            break;
                                    }
                                    System.out.println("Ingrese el tipo de gasolina :");
                                    System.out.println("1) Regular");
                                    System.out.println("2) Super");
                                    System.out.println("3) Diesel");
                                    int opti2 = entrada.nextInt();
                                    String gasolina2 = "";
                                    switch (opti2) {
                                        case 1:
                                            gasolina2 = "Regular";
                                            break;
                                        case 2:
                                            gasolina2 = "Super";
                                            break;
                                        case 3:
                                            gasolina2 = "Diesel";
                                            break;
                                    }
                                    System.out.println("Ingrese de que pais sale el avion:");
                                    String partida2 = entrada.next();
                                    System.out.println("Ingrese el pais de llegada del avion:");
                                    String llegada2 = entrada.next();
                                    System.out.println("Ingrese la cantidad de km que puede recorrer el avion:");
                                    int recorrido2 = entrada.nextInt();
                                    System.out.println("ingrese la altitud:");
                                    int altitud2 = entrada.nextInt();
                                    Avion a = new Avion(numpasajeros, piloto, gasolina2, partida2, llegada2, 100, recorrido2, altitud2);
                                    transportes.add(a);
                                    for (Primates pr : primates) {
                                        System.out.println("pr");
                                    }
                                    System.out.println("Que primate le desea asignar al helicoptero?");
                                    int nu = entrada.nextInt();
                                    primates.get(nu).setTransporte(a);
                                    a.getPrimates().add(primates.get(nu));
                                    break;
                                case 5:
                                    System.out.println("Ingrese el numero de propulsores");
                                    int propulsores = entrada.nextInt();
                                    System.out.println("Ingrese el tipo de gasolina :");
                                    System.out.println("1) Regular");
                                    System.out.println("2) Super");
                                    System.out.println("3) Diesel");
                                    int opti3 = entrada.nextInt();
                                    String gasolina3 = "";
                                    switch (opti3) {
                                        case 1:
                                            gasolina3 = "Quimico solido";
                                            break;
                                        case 2:
                                            gasolina3 = "Propelente liquido";
                                            break;
                                        
                                    }
                                    System.out.println("Ingres eel ´lanete de partida:");
                                    String partida3 = entrada.next();
                                    System.out.println("Ingres eel ´lanete de llegada:");
                                    String llegada3 = entrada.next();
                                    System.out.println("Ingrese la cantidad de km que puede recorrer el avion:");
                                    int distancia3 = entrada.nextInt();
                                    System.out.println("ingrese la altitud:");
                                    int altitud3 = entrada.nextInt();
                                    Naveesp nav = new Naveesp(propulsores, gasolina3, partida3, llegada3, 100, distancia3, altitud3);
                                    transportes.add(nav);
                                    for (Primates pr : primates) {
                                        System.out.println("pr");
                                    }
                                    System.out.println("Que primate le desea asignar al helicoptero?");
                                    int num = entrada.nextInt();
                                    primates.get(num).setTransporte(nav);
                                    nav.getPrimates().add(primates.get(num));
                                    break;
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        
                    }
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

