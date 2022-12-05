public class ejtema4OpenBootcamp {
    public static void main(String[] args) {
            //bloque ejercicio condicional
            int numeroIf = -4;
            if (numeroIf > 0) {
                System.out.println("Es positivo");
            } else if (numeroIf < 0) {
                System.out.println("Es negativo");
            } else {
                System.out.println("Es cero");
            }
            //bloque ejercicio while
            int numeroWhile = 0;
            while (numeroWhile < 3){
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile +1;
            }


            //bloque ejercicio do while
            do{
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile + 1;
            }while (numeroWhile < 3);


            //bloque ejercicio for

            for ( int numeroFor = 0; numeroFor <= 3; numeroFor++) {
                System.out.println(numeroFor);
            }


            //bloque ejercicio switch
            var estacion = "VERANO";
            switch (estacion){
                case "VERANO":
                    System.out.println("es verano");
                    break;
                case "INVIERNO":
                    System.out.println("es invierno");
                    break;
                case "OTOÑO":
                    System.out.println("es otoño");
                    break;
                case  "PRIMAVERA":
                    System.out.println("es primavera");
                    break;
            }
        }



    }
