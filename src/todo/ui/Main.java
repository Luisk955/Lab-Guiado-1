/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDo.ui;

import ToDo.cl.Tarea;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import ToDo.cl.TextFileIO;
/**
 *
 * @author Luisk
 */
public class Main {

    static TextFileIO archivo = new TextFileIO("Archivo.txt");
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
            case 0:

                out.println("Gracias por usar la aplicación");
                break;
            default:

                out.println("Opción incorrecta");
                break;
        }

    }

    public static void registrarTarea() throws IOException {
        int id;
        String descripcion;
        LocalDate fechaVencimiento;
        String responsable;
        String proyecto;

        out.println("Digite el id de la tarea");
        id = Integer.parseInt(in.readLine());

        out.println("Digite la descripcion de la tarea");
        descripcion = in.readLine();

        out.println("Digite el responsable de la tarea");
        responsable = in.readLine();

        out.println("Digite el proyecto de la tarea");
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
        ArrayList<String> lista = archivo.getData();
        int cont = 0;
        for (String dato :lista){
            out.println(lista.get(cont));
            cont++;
        }
    }
}
