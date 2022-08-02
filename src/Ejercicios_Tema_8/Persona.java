package Ejercicios_Tema_8;

public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;

    }

    public String getTelefono(){
        return this.telefono;
    }


    public static void main(String[] args){

        Persona fernando = new Persona();
        fernando.setEdad(25);
        fernando.setNombre("Fernando");
        fernando.setTelefono("+34 651 25 22 11");

        System.out.println(fernando.getNombre() + " esta en el sistema.\n" +
                            "Edad: " + fernando.getEdad() + "\n" +
                            "Teléfono: "+ fernando.getTelefono());


    }




}
