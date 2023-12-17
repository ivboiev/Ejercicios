package EjClassroom2;

public class Ej4 {

	public static void main(String[] args) {
		    int tabla[]= {1,2,3,4,5,6,7,8}; 
	    	int ayuda;
	  	//Uso auxiliar(ayuda) para guardar último número
		    ayuda = tabla[tabla.length-1];
	     	for(int i = tabla.length-1; i > 0; i--) {
			//Aqui movemos los números a la derecha
			tabla[i] = tabla[i-1];
						
		    }
            tabla[0] = ayuda;
            for(int i = 0; i < tabla.length; i++)
            System.out.print(" " + tabla[i]);

	}

}
