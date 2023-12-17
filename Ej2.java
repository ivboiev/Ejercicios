package EjClassroom2;

public class Ej2 {

	public static void main(String[] args) {
		int tabla[]= {11,7,13,33,15,20,77,3,2,1};
		int mitad = tabla.length /2;
		int suma1Mit = 0;
		int suma2Mit = 0;
		
		//Dividir a 2 porque quiero calcular suma de primera mitad.
		for(int i = 0; i <= tabla.length/2-1; i++)
			suma1Mit += tabla[i];
        System.out.println("Primera mitad = " + suma1Mit);
        
        //Uso i = tabla.length/2 porque quiero calcular suma de la segunda mitad.
        for(int i = tabla.length/2; i < tabla.length; i++)
			suma2Mit = suma2Mit + tabla[i];
        System.out.println("Segunda mitad = " + suma2Mit);
        
        //Uso if para comparar mitades
        if (suma1Mit > suma2Mit) {
        	System.out.println("Primera mitad > Segunda mitad");
        }
        else if (suma1Mit < suma2Mit) {
        	System.out.println("Segunda mitad > Primera mitad");
        }
        else if (suma1Mit == suma2Mit) {
        	System.out.println("Las mitades son iguales");
        }

	}

}
