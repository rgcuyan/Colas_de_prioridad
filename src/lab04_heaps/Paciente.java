package lab04_heaps;
//Ruddy Cuyan - 1360324

public class Paciente {
    private int urgencia, disponibilidad, medicamentos, edad, indice;
    private String nombre;

    public Paciente(int urgencia, int disponibilidad, int medicamentos, int edad, String nombre) {
        this.urgencia = urgencia;
        this.disponibilidad = disponibilidad;
        this.medicamentos = medicamentos;
        this.edad = edad;
        this.nombre = nombre;
        indice = monticulo();
    }

    private int monticulo(){
        int plus = urgencia * disponibilidad * medicamentos * edad;
        return plus;
    }
    
    public int getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(int urgencia) {
        this.urgencia = urgencia;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(int medicamentos) {
        this.medicamentos = medicamentos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
