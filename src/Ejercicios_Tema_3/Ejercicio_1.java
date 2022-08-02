package Ejercicios_Tema_3;

public class Ejercicio_1 {

    public static int suma_TRES(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println("El resultado es: "+Ejercicio_1.suma_TRES(1,2,3));

        Coche coche_Ejercicio = new Coche();
        coche_Ejercicio.poner_Puerta();
        coche_Ejercicio.poner_Puerta();
        coche_Ejercicio.poner_Puerta();
        coche_Ejercicio.poner_Puerta();

        System.out.println("El número de puertas del coche es: "+ coche_Ejercicio.num_Puertas);
    }
}

