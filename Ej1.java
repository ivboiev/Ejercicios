package EjClassroom2;

public class Ej1 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
		int cantidad = 0;
		for(int i = 0; i < tabla.length; i++) {
			if(tabla[i] == 3) {
				cantidad++;
			}
		//Si tabla[i] == 3, cantidad aumenta a 1.
		}
		System.out.println("Hay " + cantidad + " numeros 3");


	}

}
