package Ejercicioes_Tema_9;

public class Trabajador extends Persona{

    private double sueldo;

    public Trabajador() {

    }
    public Trabajador(int edad, String nombre, String telefono, double sueldo) {
        super(edad, nombre, telefono);
        this.sueldo = sueldo;
    }

    public Trabajador(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        return "Nombre: " + super.getNombre() + "\n" +
                "Edad: " + super.getEdad() + "\n" +
                "Telefono: " + super.getTelefono() + "\n" +
                "Sueldo: " + this.sueldo + "\n";
    }
}
