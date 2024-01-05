/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        int r ;
        int c;
        String nombre;
        String cedula;
        int p ;
        System.out.println("cuantos clientes desea ingresar");
        nombre = entrada.nextLine();
        System.out.println("Inh}grese su numero de cedula");
        cedula = entrada.nextLine();
        System.out.println("si desea obtener el valor de la planilla de luzy"
                + "si desea obtner el valor de su predio");
        r = entrada.nextInt();
        if (r == 1){
            calcularvalordeluz();
           
        }else{
            calcularpredio();
        }  
    }
    public static void calcularvalordeluz() {
        Scanner entrada = new Scanner(System.in);
        double kilovatio;
        double numero;
        double total;
        System.out.println("Ingrese el valor del kilovatio");
        kilovatio= entrada.nextDouble();
        System.out.println("Ingrese los kilovatios del mes");
        numero= entrada.nextDouble();
        total = (kilovatio +numero);
        System.out.printf(" El valor a pagar es %s", total);
    }
    public static void calcularpredio() {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        double inmueble;
        System.out.println("ingrese el valor del inmueble");
        inmueble = entrada.nextDouble();
        resultado = (inmueble * 0.2);
        System.out.printf(" El valor a pagar es %s", resultado);
    }
}
