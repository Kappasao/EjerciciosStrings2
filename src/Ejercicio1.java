import java.io.*;


/**
 * Created by 46995932D on 24/11/2016.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce el String A.");
            String a = buffer.readLine();
            System.out.println("Introduce el String B.");
            String b = buffer.readLine();

            Integer max = Math.max(a.length(), b.length());

            String resultado = "";

            for (int i = 0; i < max; i++) {

                if (i < a.length()) {
                    resultado = resultado + a.charAt(i);
                }
                if (i < b.length()) {
                    resultado = resultado + b.charAt(i);
                }
            }
            System.out.println(resultado);
        } catch (IOException e) {

        }
    }


}
