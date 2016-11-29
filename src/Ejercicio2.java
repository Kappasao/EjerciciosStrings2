import java.io.*;

/**
 * Created by 46995932d on 29/11/2016.
 */
public class Ejercicio2 {

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce un texto");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String a = buffer.readLine();

        boolean happy=true;

        for (int i=0; i<a.length();i++){
            if (a.charAt(i)=='g'){
                if (i>0 && i<(a.length()-1)){
                    if ( a.charAt(i-1)!='g'  && (a.charAt(i+1)!='g')){
                        happy=false;
                        break;
                    }
                }
                else if (i==(a.length()-1)){
                    if ( a.charAt(i-1)!='g'){
                        happy=false;
                        break;
                    }
                }
                else if (i==0){
                    if (a.charAt(i+1)!='g'){
                        happy=false;
                        break;
                    }
                }

            }
        }

        System.out.println("El String esta happy " +happy);
    }

}


