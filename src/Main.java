public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(5,8,10);
        System.out.println(resultado);

        //Parte 2 del ejercicio; creando el objeto miCoche y añadiendo puerta
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();

        //Muestra el número de puertas después del incremento
        miCoche.numeroPuertas();
    }


    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}