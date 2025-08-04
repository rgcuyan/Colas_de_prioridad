package lab04_heaps;
import java.util.Scanner;
import java.util.PriorityQueue;
//Ruddy Cuyan - 1360324

public class Lab04_Heaps {

    //Variables globales
    private static Scanner leer = new Scanner(System.in);
    private static PriorityQueue<Paciente> pq = new PriorityQueue<>((a,b)->a.getIndice()-b.getIndice());
    private static int pacientes = 0;

    //Metodos main
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        boolean repetir = true;
        do {
            System.out.println("");
            System.out.println("Ingrese una opcion valida!");
            System.out.println("0. Salir\n1. crear paciente");
            int opcionMenu = leer.nextInt();
            leer.nextLine();
            switch (opcionMenu) {
                case 1:
                    agregarPacienteAlHeap();
                    verificar_cantidad_pacientes();
                    break;
                case 0:
                    repetir = false;
                    break;
            }
            
        } while (repetir);
    }

    private static void agregarPacienteAlHeap() {
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
        System.out.print("Ingrese la Edad: ");
        e = leer.nextInt();
        leer.nextLine();

        //creacion del objeto Paciente
        Paciente paciente = new Paciente(u, d, m, e, n);
        System.out.println("Numero total del paciente: " + paciente.getIndice());
        pq.add(paciente);
        pacientes += 1;
        System.out.println("Longitud: " + pq.size() + ", Vacio: " + pq.isEmpty() + ", Pacientes: " + pacientes);
    }
    
    private static void verificar_cantidad_pacientes(){
        System.out.println("");
        int resultado = pacientes % 2;
        if(resultado != 1){
            System.out.println("Sacando paciente ya que hay " + pacientes + " paciente/s...");
            Paciente p = pq.poll();
            System.out.println("Sacando a...\n" + p.getNombre() + "\nEdad: " + p.getEdad() + "\nIndice: " + p.getIndice());
            imprimir_cola();
        }
    }
    
    private static void imprimir_cola(){
        System.out.println("");
        int i = 0;
        System.out.println("ORDEN DE LA COLA...");
        for(Paciente p : pq){
            i++;
            System.out.println("Paciente #" + i + " " + p.getNombre() + ", Edad: " + p.getEdad());
        }
    }
}
