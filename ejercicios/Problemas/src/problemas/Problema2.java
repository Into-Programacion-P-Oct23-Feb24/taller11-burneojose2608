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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("ingrese del 1 a 3");
        n = entrada.nextInt();
        if (n == 1){
            obtnercuadrado();
        }else
            if(n ==2 ){
                obtnertriangulo();
            }else
                if( n == 3){
                    obtenerrectangulo();
                }
    }
    public static void obtenercuadro() {
         Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("ingrese un lado");
        lado = entrada.nextDouble();
        area = lado*lado*lado;
    }
    public static void  obtenertriangulo() {
         Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
    }
}
