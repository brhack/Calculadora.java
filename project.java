/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet1edgar;

import java.util.Scanner;


/**
 *
 * @author invCSTI
 */

public class Projet1Edgar {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);//crear constructor para leer
        
        calculadora x = new calculadora();//crear el contructor x llamando a clase calculadora  
        System.out.println("menu calculadora" );
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        int opc=leer.nextInt();      
        if(opc==1)
        {
          Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);
            System.out.println("num1");
            int n1=leer.nextInt();
            System.out.println("num2");
            int n2=leer.nextInt();
            int suma= x.suma(n1,n2);
            System.out.println("el resultado es: "+ suma);
        }
        if(opc==2)
        {   System.out.println("num1");
            int n1=leer.nextInt();
            System.out.println("num2");
            int n2=leer.nextInt();
            int resta=x.resta(n1, n2);
            System.out.println("la resta es: "+ resta);
        }
         if(opc==3)
        {   System.out.println("num1");
            int n1=leer.nextInt();
            System.out.println("num2");
            int n2=leer.nextInt();
            int multipli=x.multipli(n1, n2);
            System.out.println("la multiplicacion es: "+ multipli);
        }
         if(opc==4)
        {   
            System.out.println("num1");
            int n1=leer.nextInt();
            System.out.println("num2");
            int n2=leer.nextInt();
            double divi=x.divi(n1, n2);
            System.out.println("la division es: "+ divi);
        }
        /*calculadora x = new calculadora(); //crear el constructor x llamando a clase calculadora        
       int suma=x.suma(10, 5);// valores de la suma       
       System.out.println("el resulatado es: "+ suma);//imprimir resultado de suma       
       int resta= x.resta(2, 1);//valores de resta       
       System.out.println("la resta es: "+resta);//imprimir resultado de resta
       x.nume1=15;
       System.out.println("el numero n1 es: "+x.nume1);
        */
    }
}
