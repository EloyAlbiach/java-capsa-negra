/**
 * Created by eloy on 29/11/16.
 */
package factorial_capsa_negra;

/*
* Aquest algorisme no té en compte els valors negatius que demana a l'exercici
* Tampoc permet calcular valors superiors a factorial(12) ja que dóna error, cal
* pensar que s'ha utilitzat un int en lloc de un long.
*/
public class Factorial_capsa_negra {
    public static int factorial(int n){
        if(n == 0 || n== 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    /* Aquesta funció millora l'anterior */
    public static long factorial_bo(int n){
        if(n < 0) {
            return -1;
        }
        if(n == 0 || n== 1){
            return 1;
        }
        return n * factorial(n - 2);
    }
    
    public static void main(String[] args){
        System.out.println(factorial(Integer.parseInt(args[0])));
        
    }
}
