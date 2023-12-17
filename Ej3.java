package EjClassroom2;

public class Ej3 {

	public static void main(String[] args) {
		int tabla[]= {3,4,3,77,1,1,23,14};
		int repetido = 0;
		//Hecho int repetido para contar números repetidos. Hecho segundo FOR para comparar números
		
				for (int i = 0; i < tabla.length - 1; i++) {
					for(int j = i + 1; j < tabla.length; j++) {
						if (tabla[i] == tabla[j]) {
							repetido++;
						}
					}
				}
		        System.out.println("Hay " + repetido + " repetidos numeros");
	}

}
