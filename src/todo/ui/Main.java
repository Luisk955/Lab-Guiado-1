/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDo.ui;

import todo.cl.Tarea;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import todo.cl.Proyecto;
import todo.cl.Responsable;
import todo.cl.TextFileIO;

/**
 *
 * @author Luisk
 */
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        mostrarMenu();
    }

    public static void mostrarMenu() throws IOException {
        int opcion = -1;
        do {
            out.println("1. Registrar tarea");
            out.println("2. Listar tareas");
            out.println("3. Registrar responsable");
            out.println("4. Listar responsables");
            out.println("5. Registrar proyecto");
            out.println("6. Listar proyectos");
            out.println("0. Salir");
            out.println("Digite la opcion");
            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);

        } while (opcion != 0);
    }

    public static void procesarOpcion(int pOpcion) throws IOException {
        switch (pOpcion) {
            case 1:
                registrarTarea();
                break;

            case 2:
                listarTareas();
                break;

            case 3:
                registrarResponsable();
                break;

            case 4:
                listarResponsables();
                break;

            case 5:
                registrarProyecto();
                break;

            case 6:
                listarProyectos();
                break;

            case 0:

                out.println("Gracias por usar la aplicación");
                break;

            default:

                out.println("Opción incorrecta");
                break;
        }

    }

    public static void registrarTarea() throws IOException {

        TextFileIO archivo = new TextFileIO("tareas.txt");

        int id;
        String descripcion;
        LocalDate fechaVencimiento;
        String responsable;
        String proyecto;

        out.println(
                "Digite el id de la tarea");
        id = Integer.parseInt(in.readLine());

        out.println(
                "Digite la descripcion de la tarea");
        descripcion = in.readLine();

        out.println(
                "Digite el responsable de la tarea");
        responsable = in.readLine();

        out.println(
                "Digite el proyecto de la tarea");
        proyecto = in.readLine();

        out.println("Digite la fecha de vencimiento de la tarea");
        fechaVencimiento = crearFecha();

        Tarea task = new Tarea(id, descripcion, LocalDate.now(), fechaVencimiento, responsable, proyecto);

        archivo.setData(task.toString());

    }

    public static LocalDate crearFecha() throws IOException {
        LocalDate fecha;
        int mes;
        int year;
        int dia;
        out.println("Digite el dia");
        dia = Integer.parseInt(in.readLine());

        out.println("Digite el mes");
        mes = Integer.parseInt(in.readLine());

        out.println("Digite el año");
        year = Integer.parseInt(in.readLine());

        fecha = LocalDate.of(year, mes, dia);

        return fecha;

    }

    /**
     *
     * @throws IOException
     */
    public static void listarTareas() throws java.io.IOException {
        TextFileIO archivo = new TextFileIO("tareas.txt");
        ArrayList<String> lista = archivo.getData();
        int cont = 0;
        for (String dato : lista) {
            out.println(lista.get(cont));
            cont++;
        }
    }

    public static void registrarResponsable() throws IOException {

        TextFileIO archivo = new TextFileIO("responsables.txt");

        String nombre;
        String apellidos;
        String identificacion;

        out.println("Digite el nombre del responsable");
        nombre = in.readLine();

        out.println("Digite los apellidos del responsable");
        apellidos = in.readLine();

        out.println("Digite la identificacion del responsable");
        identificacion = in.readLine();

        Responsable responsable = new Responsable(nombre, apellidos, identificacion);

        archivo.setData(responsable.toString());
    }

    public static void listarResponsables() throws java.io.IOException {
        TextFileIO archivo = new TextFileIO("responsables.txt");
        ArrayList<String> lista = archivo.getData();
        int cont = 0;
        for (String dato : lista) {
            out.println(lista.get(cont));
            cont++;
        }
    }

    public static void registrarProyecto() throws IOException {
        TextFileIO archivo = new TextFileIO("proyectos.txt");
        String nombre;
        LocalDate fechaCreacion;

        out.println("Digite el nombre del proyecto");
        nombre = in.readLine();

        out.println("Digite la fecha de creacion del proyecto");
        fechaCreacion = crearFecha();

        Proyecto proyecto = new Proyecto(nombre, fechaCreacion);

        archivo.setData(proyecto.toString());

    }

    public static void listarProyectos() throws java.io.IOException {
        TextFileIO archivo = new TextFileIO("proyectos.txt");
        ArrayList<String> lista = archivo.getData();
        int cont = 0;
        for (String dato : lista) {
            out.println(lista.get(cont));
            cont++;
        }
    }
}
