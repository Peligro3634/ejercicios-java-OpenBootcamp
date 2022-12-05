public class ejtema3OpenBootcamp {
    public static void main(String[] args) {
        //primera parte funcion suma de tres variables
        suma(10, 20, 30);


        //segunda parte class coche con sus respectivas funciones
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.puertas);


    }
    //funcion suma
    public static void suma(int a, int b, int c){

        System.out.println(a+b+c);
    }
    //clase coche
    static class Coche{
        public int puertas = 0;
        public void AgregarPuertas() {
            this.puertas ++;
        }
    }
}
