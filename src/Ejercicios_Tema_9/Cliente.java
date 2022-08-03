package Ejercicios_Tema_9;

public class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public Cliente() {
        super();
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String toString(){
        return "Nombre: " + super.getNombre() + "\n" +
                "Edad: " + super.getEdad() + "\n" +
                "Telefono: " + super.getTelefono() + "\n" +
                "Credito: " + this.credito + "\n";
    }

    public static void main(String[] args){

        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setEdad(26);
        nuevoCliente.setNombre("Álvaro");
        nuevoCliente.setTelefono("+34 611 28 95 66");
        nuevoCliente.setCredito(1462.22);

        System.out.println("Nuevo cliente añadido: \n" + nuevoCliente);

        Trabajador nuevoTrabajador = new Trabajador();
        nuevoTrabajador.setEdad(28);
        nuevoTrabajador.setNombre("Victor");
        nuevoTrabajador.setTelefono("+34 615 88 15 66");
        nuevoTrabajador.setSueldo(1500.00);

        System.out.println("Nuevo trabajador añadido: \n" + nuevoTrabajador);

    }

}
