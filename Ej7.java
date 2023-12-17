package EjClassroom2;

public class Ej7 {

	 //Uso metodo para calcular par 
          static boolean esPar(int x) {	
	      return x%2==0;
	      }
          
          public static void main(String[] args) {
	         int tabla[] = {1,32,52,66,7,14,52,23};
	         int par = 0;
	         int impar = 0;
    
	         for(int i = 0; i<tabla.length; i++) {
	        	 
	         if(esPar(tabla[i]))      	             
	         par++;
		  else
			 impar++;
     }  
          System.out.println("Hay " + par + " Pares");	
          System.out.println("Hay " + impar + " Impares");	
          if (par > impar) {
        	  System.out.println("Hay más pares");
          }
          else if (impar > par) {
        	  System.out.println("Hay más impares");
          }
          else {
        	  System.out.println("Pares = Impares");
          }
      }

}
