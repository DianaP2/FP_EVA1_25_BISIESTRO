package eva1_25_bisiestro;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */
public class EVA1_25_BISIESTRO {

    public static void main(String[] args) {
        int año;
        
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Ingrese año");
        año=captu.nextInt();
        captu.nextLine();
        
        if(año % 400 == 0){
            System.out.println("Es año biciestro");
        }else if (año % 100 == 0){
            System.out.println("No es año biciestro");
        }else if(año % 4 == 0){
             System.out.println("Es año biciestro");

        }
    }
    
}
