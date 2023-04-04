package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nombre, apellido y fecha de nacimiento de
        //una persona
        String nombre;
        String apellido;
        String fecha;
        LocalDate fechaNac;

        Scanner miScanner = new Scanner(System.in);
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("d/M/yyyy");

        /////////////////////

        System.out.println("Ingrese nombre de la persona 1");
        nombre = miScanner.nextLine();

        System.out.println("Ingrese apellido de la persona 1");
        apellido = miScanner.nextLine();

        System.out.println("Ingrese fecha de nacimiento de la persona 1 en formato dd/mm/yy: ");
        fecha = miScanner.nextLine();
        fechaNac = LocalDate.parse(fecha, formatoFechaHora);

        Persona persona1 = new Persona();
        persona1.setNombre(nombre);
        persona1.setApellido(apellido);
        persona1.setFecha(fechaNac);
        System.out.println(persona1.getFecha());

        ////////////////////

        System.out.println("Ingrese nombre de la persona 2");
        nombre = miScanner.nextLine();

        System.out.println("Ingrese apellido de la persona 2");
        apellido = miScanner.nextLine();

        System.out.println("Ingrese fecha de nacimiento de la persona 2 en formato dd/mm/yy: ");
        fecha = miScanner.nextLine();
        fechaNac = LocalDate.parse(fecha, formatoFechaHora);

        Persona persona2 = new Persona();
        persona2.setNombre(nombre);
        persona2.setApellido(apellido);
        persona2.setFecha(fechaNac);

        //////////////////

        System.out.println("Ingrese nombre de la persona 3");
        nombre = miScanner.nextLine();

        System.out.println("Ingrese apellido de la persona 3");
        apellido = miScanner.nextLine();

        System.out.println("Ingrese fecha de nacimiento  de la persona 3 en formato dd/mm/yy: ");
        fecha = miScanner.nextLine();
        fechaNac = LocalDate.parse(fecha, formatoFechaHora);

        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setApellido(apellido);
        persona3.setFecha(fechaNac);

        //////////////////

        System.out.println("Nombre de la persona 1: " + persona1.getNombre());
        System.out.println("Apellido de la persona 1: " + persona1.getApellido());
        System.out.println("Fecha de nacimiento de la persona 1: " + persona1.getFecha());
        System.out.println();

        //////////////////

        System.out.println("Nombre de la persona 2: " + persona2.getNombre());
        System.out.println("Apellido de la persona 2: " + persona2.getApellido());
        System.out.println("Fecha de nacimiento de la persona 2: " + persona2.getFecha());
        System.out.println();

        //////////////////

        System.out.println("Nombre de la persona 3: " + persona3.getNombre());
        System.out.println("Apellido de la persona 3: " + persona3.getApellido());
        System.out.println("Fecha de nacimiento de la persona 3: " + persona3.getFecha());
        System.out.println();

    }
}
