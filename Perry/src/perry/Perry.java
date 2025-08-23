/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Perry {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      System.out.println("Ingrese la longitud de cola del Papa Castor (cm):");
        double longColaCastor = sc.nextDouble();
        
        System.out.println("Ingrese la velocidad de nado del Papa Castor (km/h, hasta 8):");
        double velocidadNadoCastor = sc.nextDouble();
        
         papaCastor castor = new papaCastor(longColaCastor, velocidadNadoCastor);
         
         String picoOrniVerde = "6.8 cm";
        String patasOrniVerde = "7.5 cm";
         
          OrniVerde loquillo = new OrniVerde(picoOrniVerde, patasOrniVerde, longColaCastor, velocidadNadoCastor);
         
         System.out.println("Ingrese propulsion de Blue( de 5 a 10 km/s)");
         double pronBlue = sc.nextDouble();
         OrniAzul blue = new OrniAzul(pronBlue, longColaCastor, velocidadNadoCastor);
         
         System.out.println("Ingrese propulsion de Blui( de 5 a 10 km/s)");
         double pronBlui = sc.nextDouble();
         OrniAzul blui = new OrniAzul(pronBlui, longColaCastor, velocidadNadoCastor);
   
         papaCastor[] ornis = new papaCastor[3];
       
        
         System.out.println("------------------------------------");
         
         //----------------------Carga de posiciones--------------------//
         
    try {
         
        System.out.println("En que posicion desea guardar a Loquillo?(0,1 o 2)");
        int posicionLoquillo = sc.nextInt();
         
         System.out.println("En que posicion desea guardar a Blue?(0,1 o 2)");
        int posicionBlue = sc.nextInt();
        
          System.out.println("En que posicion desea guardar a Blui?(0,1 o 2)");
        int posicionBlui = sc.nextInt();
        
         ornis[posicionLoquillo]= loquillo;
         ornis[posicionBlue]= blue;
         ornis[posicionBlui]= blui;
    } catch (Exception mistmaException) {
            System.out.println("Ingreso fallido");
        }
        finally{
            System.out.println("Los ornitohermanos estan juntos al fin… ");
            for (papaCastor o : ornis) {
                System.out.println(o);
            
        }
    }
      System.out.println("------------------------------------");
         
         //----------------------Nadadores--------------------//
        
        System.out.println("Lista de nadadores");   
        List<OrniAzul> nadadores = new ArrayList<>();
        for (papaCastor orni : ornis) {
            if (orni instanceof OrniAzul) {
                nadadores.add((OrniAzul) orni);
                
            }     
        }
        System.out.println("Cantidad de nadadores " + nadadores.size());
            for (OrniAzul n : nadadores) {
                System.out.println(n);
        }
     
        System.out.println("------------------------------------");
        System.out.println("Quien fue el mas rapido?");    
            
        Iterator<OrniAzul> iterator = nadadores.iterator();
        while (iterator.hasNext()) {
            OrniAzul orniAzul = iterator.next();
            System.out.println("Nombre: " + (orniAzul == blue ? "Blue" : "Blui") +
                               ", Propulsion: " + orniAzul.getPropulsion() + " km/s");  
         
        }
        
    }
}

