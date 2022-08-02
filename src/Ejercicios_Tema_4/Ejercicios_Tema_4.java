package Ejercicios_Tema_4;

public class Ejercicios_Tema_4 {

    public static void  main(String[] args){
        int numeroIf = 1;
        int numeroWhile = 0;
        String estacion = "Verano";

        if (numeroIf < 0){
            System.out.println("numeroIf es negativo");
        }else if(numeroIf > 0){
            System.out.println("numeroIf es positivo");
        }else{
            System.out.println("numeroIf es 0");
        }

        while(numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }


        do{
            System.out.println(numeroWhile);
        }while(numeroWhile < 3);


        for(int numeroFor = 0;numeroFor <= 3;numeroFor++){
            System.out.println(numeroFor);
        }

        switch(estacion){
            case "Primavera" :
                System.out.println("Es primavera.");
                break;

            case "Verano" :
                System.out.println("Es verano");
                break;

            case "Otoño" :
                System.out.println("Es otoño");
                break;

            case "Invierno" :
                System.out.println("Es invierno");
                break;

            default:
                System.out.println("La variable introducida no es una estación");

        }





    }
}
