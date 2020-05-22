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
    static ArrayList<Transporte> transportes = new ArrayList();
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
                    entrada.nextLine();
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
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.print("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
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
                    System.out.print("Ingrese su peso: ");
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
                            System.out.println("4) Avion Comercial");
                            System.out.println("5) Nave Espacial");
                            System.out.println("6) Cohete");
                            int opc = entrada.nextInt();
                            switch (opc) {
                                case 1:
                                    System.out.print("Ingrese el color de piel del mono: ");
                                    String color = entrada.next();
                                    System.out.print("Ingrese la cantidad de comida que consume: ");
                                    int consumo = entrada.nextInt();
                                    System.out.print("Ingrese el planeta de salida: ");
                                    String planeta = entrada.next();
                                    System.out.print("Ingrese el lugar de nacimiento: ");
                                    String nacimiento = entrada.next();
                                    System.out.println("¡Bienvenido al Sistema de Registro!");
                                    System.out.print("Ingrese su nombre: ");
                                    String nomb = entrada.nextLine();
                                    System.out.print("Ingrese su grupo sanguineo:");
                                    String sanguineo2 = entrada.next();
                                    System.out.println("***Genero***");
                                    System.out.println("1. Femenino");
                                    System.out.println("2. Masculino");
                                    System.out.print("Ingrese su genero: ");
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
                                    System.out.print("Ingrese su peso: ");
                                    double peso2 = entrada.nextDouble();
                                    try {
                                        primates.add(new Mono(color, 100, consumo, planeta, nacimiento, nomb, sanguineo2, sexo2, altura2, peso2));
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    } // Fin Try Catch
                                    break;
                                case 2:
                                    System.out.println("Ingrese el iq del gorila");
                                    int iq = entrada.nextInt();
                                    if (iq < 130 && iq > 139) {
                                        System.out.println("Porfavor elija un IQ entre 130 y 139 porfavor");
                                        iq = entrada.nextInt();
                                    } // Fin If
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
                                    try {
                                        primates.add(new Gorila(iq, 100, consumo2, planeta2, nacimiento2, nomb3, sanguineo3, sexo3, altura3, peso3));
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    } // Fin Try Catch
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
                                        default:
                                            System.out.println("¡Entrada No Valida!");
                                    } // Fin Switch
                                    System.out.println("Ingrese de que pais sale el helicoptero:");
                                    String partida = entrada.next();
                                    System.out.println("Ingrese el pais de llegada del helicoptero");
                                    String llegada = entrada.next();
                                    System.out.println("Ingrese la cantidad de km que puede recorrer el helicoptero");
                                    int recorrido = entrada.nextInt();
                                    System.out.println("ingrese la altitud:");
                                    int altitud = entrada.nextInt();
                                    Helicoptero e = null;
                                    try {
                                        e = new Helicoptero(numhelices, numpatas, gasolina, partida, llegada, 100, recorrido, altitud);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    } // Fin Try Catch
                                    transportes.add(e);
                                    for (Primates pr : primates) {
                                        System.out.println("pr");
                                    }
                                    System.out.println("Que primate le desea asignar al helicoptero?");
                                    int n = entrada.nextInt();

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
                                        default:
                                            System.out.println("¡Entrada No Valida!");
                                    } // Fin Switch
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
                                        default:
                                            System.out.println("¡Entrada No Valida!");
                                    } // Fin Switch
                                    System.out.println("Ingrese de que pais sale el avion:");
                                    String partida2 = entrada.next();
                                    System.out.println("Ingrese el pais de llegada del avion:");
                                    String llegada2 = entrada.next();
                                    System.out.println("Ingrese la cantidad de km que puede recorrer el avion:");
                                    int recorrido2 = entrada.nextInt();
                                    System.out.println("ingrese la altitud:");
                                    int altitud2 = entrada.nextInt();
                                    Avion a = null;
                                    try {
                                        a = new Avion(numpasajeros, piloto, gasolina2, partida2, llegada2, 100, recorrido2, altitud2);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    } // Fin Try Catch
                                    transportes.add(a);
                                    if (primates.size() > 0) {
                                        for (Primates pr : primates) {
                                            System.out.println("pr");
                                        } // Fin For
                                        System.out.println("Que primate le desea asignar al helicoptero?");
                                        int nu = entrada.nextInt();
                                        a.getPrimates().add(primates.get(nu));
                                    }

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
                                        default:
                                            System.out.println("¡Entrada No Valida!");
                                    } // Fin Switch
                                    System.out.println("Ingres eel ´lanete de partida:");
                                    String partida3 = entrada.next();
                                    System.out.println("Ingres eel ´lanete de llegada:");
                                    String llegada3 = entrada.next();
                                    System.out.println("Ingrese la cantidad de km que puede recorrer la nave espacial:");
                                    int distancia3 = entrada.nextInt();
                                    System.out.println("ingrese la altitud:");
                                    int altitud3 = entrada.nextInt();
                                    Naveesp nav = null;
                                    try {
                                        nav = new Naveesp(propulsores, gasolina3, partida3, llegada3, 100, distancia3, altitud3);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    } // Fin Try Catch
                                    transportes.add(nav);
                                    if (primates.size() > 0) {
                                        for (Primates pr : primates) {
                                            System.out.println("pr");
                                        } // Fin For
                                        System.out.println("Que primate le desea asignar a la nave espacial?");
                                        int num = entrada.nextInt();

                                        nav.getPrimates().add(primates.get(num));
                                    }
                                    break;
                                case 6:
                                    System.out.println("Ingrese el numero de separaciones:");
                                    int numsep = entrada.nextInt();
                                    System.out.println("Ingrese el tipo de gasolina :");
                                    System.out.println("1) Regular");
                                    System.out.println("2) Super");
                                    System.out.println("3) Diesel");
                                    int opti4 = entrada.nextInt();
                                    String gasolina4 = "";
                                    switch (opti4) {
                                        case 1:
                                            gasolina4 = "Quimico solido";
                                            break;
                                        case 2:
                                            gasolina4 = "Propelente liquido";
                                            break;
                                        default:
                                            System.out.println("¡Entrada No Valida!");
                                    } // Fin Switch
                                    System.out.println("Ingresecel planeta de partida:");
                                    String partida4 = entrada.next();
                                    System.out.println("Ingresecel planeta de llegada:");
                                    String llegada4 = entrada.next();
                                    System.out.println("Ingrese la cantidad de km que puede recorrer el cohete:");
                                    int distancia4 = entrada.nextInt();
                                    System.out.println("ingrese la altitud:");
                                    int altitud4 = entrada.nextInt();
                                    Cohete coh = null;
                                    try {
                                        coh = new Cohete(numsep, gasolina4, partida4, llegada4, 100, distancia4, altitud4);
                                    } catch (MiExcepcion ex) {
                                        System.out.println(ex.getMessage());
                                    } // Fin Try Catch
                                    transportes.add(coh);
                                    if (primates.size() > 0) {
                                        for (Primates pr : primates) {
                                            System.out.println("pr");
                                        } // Fin For
                                        System.out.println("Que primate le desea asignar al cohete?");
                                        int nume = entrada.nextInt();
                                        coh.getPrimates().add(primates.get(nume));
                                    }

                                    break;
                                default:
                                    System.out.println("¡Entrada No Valida!");
                            } // Fin Switch
                            break;
                        case 2:
                            System.out.println("Que desea modificar?");
                            System.out.println("1)Primates");
                            System.out.println("2)Transporte");
                            int c = entrada.nextInt();
                            if (c == 1) {
                                for (Primates primate : primates) {
                                    System.out.println(primate);
                                }
                                System.out.println("Ingrese la posicion que desea modificar?");
                                int po = entrada.nextInt();
                                if (primates.get(po) instanceof Mono) {
                                    System.out.println("Que desea modificar?");
                                    System.out.println("1) Color");
                                    System.out.println("2) Planeta asignado");
                                    System.out.println("3) lugar de nacimiento");
                                    System.out.println("4) Nombre");
                                    System.out.println("5) Sanguineo");
                                    System.out.println("6) Sexo");
                                    System.out.println("7) Altura");
                                    System.out.println("8) Peso");
                                    System.out.println("que deseas modificar?");
                                    int oop = entrada.nextInt();
                                    switch (oop) {
                                        case 1:
                                            System.out.println("Ingrese el color del mono:");
                                            String color = entrada.next();
                                            ((Mono) primates.get(po)).setColor(color);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el planeta asignado:");
                                            String planeta = entrada.next();
                                            ((Mono) primates.get(po)).setPlaneta(planeta);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el lugar de nacimiento del mono:");
                                            String nacimien = entrada.next();
                                            ((Mono) primates.get(po)).setLugar(nacimien);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese el nombre del mono:");
                                            String nomb = entrada.next();
                                            ((Mono) primates.get(po)).setNombre(nomb);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese el grupo sanguineo del mono:");
                                            String sangre = entrada.next();
                                            ((Mono) primates.get(po)).setSanguineo(sangre);
                                            break;
                                        case 6:
                                            System.out.println("***Genero***");
                                            System.out.println("1. Femenino");
                                            System.out.println("2. Masculino");
                                            System.out.print("Ingrese su genero: ");
                                            int opcio = entrada.nextInt();
                                            String sexo2 = "";
                                            switch (opcio) {
                                                case 1:
                                                    sexo2 = "Femenino";
                                                    break;
                                                case 2:
                                                    sexo2 = "Masculino";
                                                    break;
                                                default:
                                                    System.out.println("¡Entrada no valida!");
                                            } // Fin Switch Generos
                                            ((Mono) primates.get(po)).setSexo(sexo2);
                                            break;
                                        case 7:
                                            System.out.println("Ingrese la altura del mono:");
                                            double altu = entrada.nextDouble();
                                            ((Mono) primates.get(po)).setAltura(altu);
                                            break;
                                        case 9:
                                            System.out.println("Ingrese el peso del mono:");
                                            double pes = entrada.nextDouble();
                                            ((Mono) primates.get(po)).setPeso(pes);

                                            break;

                                    }
                                } else if (primates.get(po) instanceof Gorila) {
                                    System.out.println("Que desea modificar?");
                                    System.out.println("1) Iq");
                                    System.out.println("2) Planeta asignado");
                                    System.out.println("3) lugar de nacimiento");
                                    System.out.println("4) Nombre");
                                    System.out.println("5) Sanguineo");
                                    System.out.println("6) Sexo");
                                    System.out.println("7) Altura");
                                    System.out.println("8) Peso");
                                    System.out.println("que deseas modificar?");
                                    int oop = entrada.nextInt();
                                    switch (oop) {
                                        case 1:
                                            System.out.println("Ingrese su iq:");
                                            int iq = entrada.nextInt();
                                            if (iq < 130 && iq > 139) {
                                                System.out.println("Porfavor elija un IQ entre 130 y 139 porfavor");
                                                iq = entrada.nextInt();
                                            } // Fin If
                                            ((Gorila) primates.get(po)).setIq(iq);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el planeta asignado:");
                                            String planeta = entrada.next();
                                            ((Gorila) primates.get(po)).setPlaneta(planeta);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el lugar de nacimiento del mono:");
                                            String nacimien = entrada.next();
                                            ((Gorila) primates.get(po)).setLugar(nacimien);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese el nombre del mono:");
                                            String nomb = entrada.next();
                                            ((Gorila) primates.get(po)).setNombre(nomb);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese el grupo sanguineo del mono:");
                                            String sangre = entrada.next();
                                            ((Gorila) primates.get(po)).setSanguineo(sangre);
                                            break;
                                        case 6:
                                            System.out.println("***Genero***");
                                            System.out.println("1. Femenino");
                                            System.out.println("2. Masculino");
                                            System.out.print("Ingrese su genero: ");
                                            int opcio = entrada.nextInt();
                                            String sexo2 = "";
                                            switch (opcio) {
                                                case 1:
                                                    sexo2 = "Femenino";
                                                    break;
                                                case 2:
                                                    sexo2 = "Masculino";
                                                    break;
                                                default:
                                                    System.out.println("¡Entrada no valida!");
                                            } // Fin Switch Generos
                                            ((Gorila) primates.get(po)).setSexo(sexo2);
                                            break;
                                        case 7:
                                            System.out.println("Ingrese la altura del mono:");
                                            double altu = entrada.nextDouble();
                                            ((Gorila) primates.get(po)).setAltura(altu);
                                            break;
                                        case 8:
                                            System.out.println("Ingrese el peso del mono:");
                                            double pes = entrada.nextDouble();
                                            ((Gorila) primates.get(po)).setPeso(pes);

                                            break;
                                    }
                                }
                            } else if (c == 2) {
                                for (Transporte trans : transportes) {
                                    System.out.println(trans);
                                }
                                System.out.println("Ingrese la posicion que desea modificar?");
                                int pos = entrada.nextInt();
                                if (transportes.get(pos) instanceof Naveesp) {
                                    System.out.println("Que desea modificar?");
                                    System.out.println("1) Propulsores");
                                    System.out.println("2) Tipo de combustible");
                                    System.out.println("3) Planeta del que parte");
                                    System.out.println("4) Planeta de llegada");
                                    System.out.println("5) Distancia que recorre");
                                    System.out.println("6) Altitud");
                                    System.out.println("que deseas modificar?");
                                    int oop = entrada.nextInt();
                                    switch (oop) {
                                        case 1:
                                            System.out.println("Ingrese el numero de propulsores");
                                            int propulsores = entrada.nextInt();
                                            ((Naveesp) transportes.get(pos)).setPropulsores(propulsores);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el tipo de gasolina :");
                                            System.out.println("1) Regular");
                                            System.out.println("2) Super");
                                            System.out.println("3) Diesel");
                                            int opti3 = entrada.nextInt();
                                            String gasolina = "";
                                            switch (opti3) {
                                                case 1:
                                                    gasolina = "Quimico solido";
                                                    break;
                                                case 2:
                                                    gasolina = "Propelente liquido";
                                                    break;
                                                default:
                                                    System.out.println("¡Entrada No Valida!");
                                            } // Fin Switch
                                            ((Naveesp) transportes.get(pos)).setTipocomb(gasolina);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el planeta de partida:");
                                            String partida = entrada.next();
                                            ((Naveesp) transportes.get(pos)).setPlanetapart(partida);
                                            break;
                                        case 4:
                                            System.out.println("Ingres eel ´lanete de llegada:");
                                            String llegada = entrada.next();
                                            ((Naveesp) transportes.get(pos)).setPlanetalleg(llegada);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese la cantidad de km que puede recorrer el cohete:");
                                            int distancia = entrada.nextInt();
                                            ((Naveesp) transportes.get(pos)).setDistancia(distancia);
                                            break;
                                        case 6:
                                            System.out.println("ingrese la altitud:");
                                            int altitud = entrada.nextInt();
                                            ((Naveesp) transportes.get(pos)).setAltitud(altitud);
                                            break;

                                    }
                                } else if (transportes.get(pos) instanceof Cohete) {
                                    System.out.println("Que desea modificar?");
                                    System.out.println("1) Separaciones");
                                    System.out.println("2) Tipo de combustible");
                                    System.out.println("3) Planeta del que parte");
                                    System.out.println("4) Planeta de llegada");
                                    System.out.println("5) Distancia que recorre");
                                    System.out.println("6) Altitud");
                                    System.out.println("que deseas modificar?");
                                    int oop = entrada.nextInt();
                                    switch (oop) {
                                        case 1:
                                            System.out.println("Ingrese el numero de separaciones");
                                            int separaciones = entrada.nextInt();
                                            ((Cohete) transportes.get(pos)).setNumseparaciones(separaciones);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el tipo de gasolina :");
                                            System.out.println("1) Regular");
                                            System.out.println("2) Super");
                                            System.out.println("3) Diesel");
                                            int opti3 = entrada.nextInt();
                                            String gasolina = "";
                                            switch (opti3) {
                                                case 1:
                                                    gasolina = "Quimico solido";
                                                    break;
                                                case 2:
                                                    gasolina = "Propelente liquido";
                                                    break;
                                                default:
                                                    System.out.println("¡Entrada No Valida!");
                                            } // Fin Switch
                                            ((Cohete) transportes.get(pos)).setTipocomb(gasolina);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el planeta de partida:");
                                            String partida = entrada.next();
                                            ((Cohete) transportes.get(pos)).setPlanetapart(partida);
                                            break;
                                        case 4:
                                            System.out.println("Ingres eel ´lanete de llegada:");
                                            String llegada = entrada.next();
                                            ((Cohete) transportes.get(pos)).setPlanetalleg(llegada);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese la cantidad de km que puede recorrer el cohete:");
                                            int distancia = entrada.nextInt();
                                            ((Cohete) transportes.get(pos)).setDistancia(distancia);
                                            break;
                                        case 6:
                                            System.out.println("ingrese la altitud:");
                                            int altitud = entrada.nextInt();
                                            ((Cohete) transportes.get(pos)).setAltitud(altitud);
                                            break;

                                    }
                                } else if (transportes.get(pos) instanceof Avion) {
                                    System.out.println("Que desea modificar?");
                                    System.out.println("1) Numero de pasajeros");
                                    System.out.println("2) Piloto automatico");
                                    System.out.println("3) Gasolina");
                                    System.out.println("4) Pais de partida");
                                    System.out.println("5) Pais de llegada");
                                    System.out.println("6) Distancia que recorre");
                                    System.out.println("7) Altitud");
                                    System.out.println("que deseas modificar?");
                                    int oop = entrada.nextInt();
                                    switch (oop) {
                                        case 1:
                                            System.out.println("Ingrese el numero de pasajeros que puede llevar:");
                                            int numpasajeros = entrada.nextInt();
                                            ((Avion) transportes.get(pos)).setNumpasajeros(numpasajeros);
                                            break;
                                        case 2:
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
                                                default:
                                                    System.out.println("¡Entrada No Valida!");
                                            } // Fin Switch
                                            ((Avion) transportes.get(pos)).setPilotoatm(piloto);
                                            break;
                                        case 3:
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
                                                default:
                                                    System.out.println("¡Entrada No Valida!");
                                            } // Fin Switch
                                            ((Avion) transportes.get(pos)).setGasolina(gasolina2);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese de que pais sale el avion:");
                                            String partida = entrada.next();
                                            ((Avion) transportes.get(pos)).setPartida(partida);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese de que pais al que llega el avion:");
                                            String llegada = entrada.next();
                                            ((Avion) transportes.get(pos)).setLlegada(llegada);
                                            break;
                                        case 6:
                                            System.out.println("Ingrese la distancia que recorre: ");
                                            int distancia = entrada.nextInt();
                                            ((Avion) transportes.get(pos)).setDistancia(distancia);
                                            break;
                                        case 7:
                                            System.out.println("Ingrese la altitud:");
                                            int altitud = entrada.nextInt();
                                            ((Avion) transportes.get(pos)).setAltitud(altitud);
                                            break;

                                    }
                                } else if (transportes.get(pos) instanceof Helicoptero) {
                                    System.out.println("Que desea modificar?");
                                    System.out.println("1) Numero de helices");
                                    System.out.println("2) Numero de patas");
                                    System.out.println("3) Gasolina");
                                    System.out.println("4) Pais de partida");
                                    System.out.println("5) Pais de llegada");
                                    System.out.println("6) Distancia que recorre");
                                    System.out.println("7) Altitud");
                                    System.out.println("que deseas modificar?");
                                    int oop = entrada.nextInt();
                                    switch (oop) {
                                        case 1:
                                            System.out.println("INgrese el numero de helices:");
                                            int numhelic = entrada.nextInt();
                                            ((Helicoptero) transportes.get(pos)).setNumhelices(numhelic);
                                            break;
                                        case 2:
                                            System.out.println("i   Ngrese le numero de patas:");
                                            int numpatas = entrada.nextInt();
                                            ((Helicoptero) transportes.get(pos)).setNumpatas(numpatas);
                                            break;
                                        case 3:
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
                                                default:
                                                    System.out.println("¡Entrada No Valida!");
                                            } // Fin Switch
                                            ((Helicoptero) transportes.get(pos)).setGasolina(gasolina2);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese de que pais sale el avion:");
                                            String partida = entrada.next();
                                            ((Helicoptero) transportes.get(pos)).setPartida(partida);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese de que pais al que llega el avion:");
                                            String llegada = entrada.next();
                                            ((Helicoptero) transportes.get(pos)).setLlegada(llegada);
                                            break;
                                        case 6:
                                            System.out.println("Ingrese la distancia que recorre: ");
                                            int distancia = entrada.nextInt();
                                            ((Helicoptero) transportes.get(pos)).setDistancia(distancia);
                                            break;
                                        case 7:
                                            System.out.println("Ingrese la altitud:");
                                            int altitud = entrada.nextInt();
                                            ((Helicoptero) transportes.get(pos)).setAltitud(altitud);
                                            break;
                                    }
                                }
                            }

                            break;

                        case 3:
                            System.out.println("¿Que desea eliminar?");
                            System.out.println("1) Mono");
                            System.out.println("2) Gorila");
                            System.out.println("3) Helicoptero");
                            System.out.println("4) Avion Comercial");
                            System.out.println("5) Nave Espacial");
                            System.out.println("6) Cohete");
                            System.out.print("Ingrese la opcion deseada: ");
                            int opcion3 = entrada.nextInt();
                            switch (opcion3) {
                                case 1:
                                    for (Object o : primates) {
                                        if (o instanceof Mono) {
                                            System.out.println(primates.indexOf(o) + " = " + o);
                                        } // Fin If
                                    } // Fin For
                                    break;
                                case 2:
                                    for (Object o : primates) {
                                        if (o instanceof Gorila) {
                                            System.out.println(primates.indexOf(o) + " = " + o);
                                        } // Fin If
                                    } // Fin For
                                    break;
                                case 3:
                                    for (Object o : transportes) {
                                        if (o instanceof Helicoptero) {
                                            System.out.println(transportes.indexOf(o) + " = " + o);
                                        } // Fin If
                                    } // Fin For
                                    break;
                                case 4:
                                    for (Object o : transportes) {
                                        if (o instanceof Helicoptero) {
                                            System.out.println(transportes.indexOf(o) + " = " + o);
                                        } // Fin If
                                    } // Fin For
                                    break;
                                case 5:
                                    for (Object o : transportes) {
                                        if (o instanceof Helicoptero) {
                                            System.out.println(transportes.indexOf(o) + " = " + o);
                                        } // Fin If
                                    } // Fin For
                                    break;
                                case 6:
                                    for (Object o : transportes) {
                                        if (o instanceof Helicoptero) {
                                            System.out.println(transportes.indexOf(o) + " = " + o);
                                        } // Fin If
                                    } // Fin For
                                    break;
                                default:
                                    System.out.println("¡Entrada No Valida!");
                            } // Fin Switch Eliminar
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("¡Entrada No Valida!");
                    } // Fin Switch
                    break;

                case 3:
                    resp = 'n';
                    break;
                default:
                    System.out.println(
                            "¡Entrada no valida!");
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

