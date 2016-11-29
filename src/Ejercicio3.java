import java.io.*;

/**
 * Created by 46995932d on 29/11/2016.
 */
public class Ejercicio3 {

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce un texto");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String a = buffer.readLine();

        //Llamamos al metodo numocurrenciassubstring pasando como parametro a y cat//
        //Por lo tanto devolvera el numero de veces que cat aparece en el string a//
        int contCat=numOcurrenciasSubstring(a,"cat");
        System.out.println(contCat);
        //Llamamos al metodo numocurrenciassubstring pasando como parametro a y dog//
        //Por lo tanto devolvera el numero de veces que dog aparece en el string a//
        int contDog=numOcurrenciasSubstring(a,"dog");
        System.out.println(contDog);

        if (contCat==contDog){
            System.out.println("Estan las mismas veces Cat y Dog");
        }
        else{
            System.out.println("No estan las mismas veces Cat y Dog");
        }
    }

    //Este metodo devuelve el numero de veces que el string target aparece en el string origen//
    public static int numOcurrenciasSubstring(String origen, String target) {

        int contador = 0;

        int indiceActual = 0;

        boolean fin = false;

        while (!fin) {

            int indiceEncontrado = origen.indexOf(target, indiceActual);

            if (indiceEncontrado == -1) {
                System.out.println("hemos acabado con " + target);
                fin = true;
            } else {
                System.out.println("Hemos encontrado en la posición " + indiceEncontrado);
                contador++;
                indiceActual = indiceEncontrado + 1;
            }

        }

        System.out.println("el numero de ocurrencias es de " + contador);

        return contador;

    }
}
