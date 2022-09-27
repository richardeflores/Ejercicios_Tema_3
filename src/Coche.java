//Clase coche creada

public class Coche {
    //atributo de clase
    int puertasCoche = 0;

    //funcion que incremente el número de puertas
    public void agregarPuerta () {
        puertasCoche++;
    }

    //funcion para imprimir número de puertas
    public void numeroPuertas () {
        System.out.println("La cantidad de puertas del coche es: " + puertasCoche);
    }
}
