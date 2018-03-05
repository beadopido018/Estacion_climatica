package cinco;

import java.util.Scanner;

public class leerMedida {

	 static TempHumDia leerMedida () { 

         Scanner leer = new Scanner(System.in); 
         int dia,mes,año, tempmax, tempmin, hummax, hummin; 
         TempHumDia  medicion = null; 
          
        boolean error = true; 
        do { 
        System.out.println("Día:"); 
        dia = leer.nextInt(); 
        System.out.println("Mes:"); 
        mes = leer.nextInt(); 
        System.out.println("Año:"); 
        año = leer.nextInt(); 
  
        if ( fechaOK( dia,mes,año) ) { 
             System.out.println ( " Tº Máxima:"); 
             tempmax = leer.nextInt(); 
             System.out.println ( " Tº Mínima:"); 
             tempmin = leer.nextInt(); 
             System.out.println ( " Hº Máxima:"); 
             hummax = leer.nextInt(); 
             System.out.println ( " Hº Mínima:"); 
             hummin = leer.nextInt(); 
             medicion = new TempHumDia ( dia,mes,año, tempmax, tempmin, hummax, hummin); 
             error = false; 
            } 
        else 
        { 
            System.out.println(" Fecha érronea"); 
        } 
     
    } while (error); 
    return medicion; 
} 
     
// Programa principal de pruebas 
/* 
 * En el programa principal crea una estación, introduce cinco días pedidas por  teclado (si la fecha no es correcta te la tiene que volver a pedir) y lista esos días. 
Luego borra dos (pedida por teclado y validándola de nuevo) y los vuelve a listar. 
 * 
 */ 
public static void main (  String [] argv ){ 
         
        EstacionMeteorologica estación  = new EstacionMeteorologica("Burgos",2017); 
        

        System.out.println(" Introducir 5 medidas :"); 
         

        for (int i=0; i< 5; i++){ 
             TempHumDia  medicion = leerMedida (); 
             estación.AddDia( medicion); 
        } 
         
       estación.ListarDias(); 
         
       System.out.println("Introduca 2 medidas a Borrar:"); 
       TempHumDia  medida1 = leerMedida(); 
       TempHumDia  medida2 = leerMedida(); 
        
       estación.delDia(medida1); 
       estación.delDia(medida2); 

        
       estación.ListarDias();       
              
    }             

public static boolean fechaOK(int dia, int mes, int año){ 
	 boolean ok=false;
	 
     if(año%400==0) {
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
