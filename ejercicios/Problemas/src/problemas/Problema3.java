/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String promedio;
        double[] nota = new double[4];
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Ingrese la nota");
            nota[i] = entrada.nextDouble();
        }
        promedio = obtenerPromedio(nota);
        System.out.printf("El promedio de las notas: %.2f, %.2f, %.2f, %.2f es "
                + "%s\n",
                 nota[0], nota[1], nota[2], nota[3], promedio);
    }

    public static String obtenerPromedio(double[] a) {
        double suma = 0;
        double promedio;
        String Cualitativo;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        promedio = suma / 4;
        if (promedio >= 0 && promedio <= 5) {
            Cualitativo = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                Cualitativo = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    Cualitativo = "Muy Bueno";
                } else {
                    Cualitativo = "Sobresaliente";
                }
            }
        }
        return Cualitativo;
    }
}
        

        
    
    

