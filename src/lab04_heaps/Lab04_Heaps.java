package lab04_heaps;
import java.util.Scanner;
import java.util.PriorityQueue;
//Ruddy Cuyan - 1360324

public class Lab04_Heaps {

    //Variables globales
    private static Scanner leer = new Scanner(System.in);
    private static PriorityQueue<Pacientes> pq = new PriorityQueue<>((a,b)->a.getIndice()-b.getIndice());

    //Metodos main
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean repetir = true;
        do {
            System.out.println("");
            System.out.println("Ingrese una opcion valida!");
            System.out.println("0. Salir\n1. crear paciente");
            int opcionMenu = leer.nextInt();
            leer.nextLine();
            switch (opcionMenu) {
                case 1 ->
                    agregarPacienteAlHeap();
                case 0 ->
                    repetir = false;
            }
        } while (repetir);
    }

    public static void agregarPacienteAlHeap() {
        System.out.println("");
        System.out.println("Entrando a agregarPaciente...");
        //variables
        int u, d, m, e;
        
        //Solicitar datos al usuario
        System.out.println("Nombre: ");
        String n = leer.nextLine();
        System.out.print("Ingrese la Urgencia {1 - 3}: ");
        u = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese la Disponibilidad {1 - 3}: ");
        d = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese los Medicamentos {1 - 3}: ");
        m = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese la Edad:");
        e = leer.nextInt();
        leer.nextLine();

        //creacion del objeto Paciente
        Pacientes paciente = new Pacientes(u, d, m, e, n);
        System.out.println("Total paciente: " + paciente.getIndice());
        pq.add(paciente);
        System.out.println("Longitud: " + pq.size() + ", Vacio: " + pq.isEmpty());
    }
}
