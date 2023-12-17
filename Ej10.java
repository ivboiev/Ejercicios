package EjClassroom2;

public class Ej10 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,7,21,14};
		int divEntre7 = 0;
		for(int i = 0; i < tabla.length; i++) {
			
			//Uso tabla[i] % 7 == 0 para comprobar si valor es divisible entre 7. Si es verdad, divEntre7 aumenta a 1;
			if (tabla[i] % 7 == 0) {
				divEntre7++;
			}
				
				
		}
        System.out.println("Hay " + divEntre7 + " divisibles entre 7");
	}

}
