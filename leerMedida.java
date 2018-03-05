package cinco;

import java.util.Scanner;

public class leerMedida {

	 static TempHumDia leerMedida () { 

         Scanner leer = new Scanner(System.in); 
         int dia,mes,a�o, tempmax, tempmin, hummax, hummin; 
         TempHumDia  medicion = null; 
          
        boolean error = true; 
        do { 
        System.out.println("D�a:"); 
        dia = leer.nextInt(); 
        System.out.println("Mes:"); 
        mes = leer.nextInt(); 
        System.out.println("A�o:"); 
        a�o = leer.nextInt(); 
  
        if ( fechaOK( dia,mes,a�o) ) { 
             System.out.println ( " T� M�xima:"); 
             tempmax = leer.nextInt(); 
             System.out.println ( " T� M�nima:"); 
             tempmin = leer.nextInt(); 
             System.out.println ( " H� M�xima:"); 
             hummax = leer.nextInt(); 
             System.out.println ( " H� M�nima:"); 
             hummin = leer.nextInt(); 
             medicion = new TempHumDia ( dia,mes,a�o, tempmax, tempmin, hummax, hummin); 
             error = false; 
            } 
        else 
        { 
            System.out.println(" Fecha �rronea"); 
        } 
     
    } while (error); 
    return medicion; 
} 
     
// Programa principal de pruebas 
/* 
 * En el programa principal crea una estaci�n, introduce cinco d�as pedidas por  teclado (si la fecha no es correcta te la tiene que volver a pedir) y lista esos d�as. 
Luego borra dos (pedida por teclado y valid�ndola de nuevo) y los vuelve a listar. 
 * 
 */ 
public static void main (  String [] argv ){ 
         
        EstacionMeteorologica estaci�n  = new EstacionMeteorologica("Burgos",2017); 
        

        System.out.println(" Introducir 5 medidas :"); 
         

        for (int i=0; i< 5; i++){ 
             TempHumDia  medicion = leerMedida (); 
             estaci�n.AddDia( medicion); 
        } 
         
       estaci�n.ListarDias(); 
         
       System.out.println("Introduca 2 medidas a Borrar:"); 
       TempHumDia  medida1 = leerMedida(); 
       TempHumDia  medida2 = leerMedida(); 
        
       estaci�n.delDia(medida1); 
       estaci�n.delDia(medida2); 

        
       estaci�n.ListarDias();       
              
    }             

public static boolean fechaOK(int dia, int mes, int a�o){ 
	 boolean ok=false;
	 
     if(a�o%400==0) {
   	 if(mes==2) {
   		 if(dia<=29) {
   			 	ok=true;
   		 }
   	 } 
     }else {
   	  if(mes==2) {
   		  if(dia<=28) {
   			 System.out.print("nice");
   			  ok=true;
   		  }
   	  }else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==9||mes==12) {
   		  if(dia<=31) {
   			  ok=true;
   			  System.out.println("nice");
   		  }else {
   			  System.out.println("ERROR");
   			  ok=false;
   		  }
   	  }else{
   		  if(dia<=30) {
   			  ok=true; 
   			 System.out.print("nice");
   		  }else {
   			  System.out.print("ERROR");
   			  ok=false;
   		  }
   	  }
     }
     
     return ok;
    
   }

         

}
