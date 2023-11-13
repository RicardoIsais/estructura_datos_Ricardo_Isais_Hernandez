package ArrayList;
import java.util.Random;
import ArrayList.LinkedList;
import java.util.Scanner;

public class TareaCifrados {

	public static void main(String[] args) throws Exception {
		Scanner leer = new Scanner(System.in);
		LinkedList arreglo = new LinkedList();
		Scanner scanner = new Scanner(System.in);
		TareaCifrados tareaCifrados = new TareaCifrados();
		boolean ciclo=true;

		while (ciclo) {
			System.out.println("Elija una opción:");
			System.out.println("1. Convertir a Binario");
			System.out.println("2. Aplicar XOR");
			System.out.println("3. Cifrado Polibio");
			System.out.println("4. Cifrado ADFGVX");
			System.out.println("5. Calcular MCD");
			System.out.println("6. Salir");
			int opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese la cadena de texto:");

				String texto1 = scanner.nextLine();
				arreglo = limpiarYRetornar(arreglo);
				convertirBinario(arreglo, texto1);
				System.out.println("Resultado en binario:");
				for (int i = 0; i < arreglo.size(); i++) {
					System.out.println(arreglo.get(i));
				}
				break;
			case 2:
				System.out.println("Ingrese la cadena de texto:");
				String texto2 = scanner.nextLine();
				System.out.println("Clave: 10101010");
				arreglo = limpiarYRetornar(arreglo);
				LinkedList resultado = CodificarXor(arreglo, texto2);
				System.out.println("Resultado XOR:");
				for (int i = 0; i < resultado.size(); i++) {
					System.out.println(resultado.get(i));
				}
				break;

			case 3:
				System.out.println("Ingrese la cadena de texto:");
				String texto3 = scanner.nextLine();
				LinkedList resultadoPolibio = new LinkedList();
				ImprimirTablaPolibio();
				resultadoPolibio = CifradoPolibio(resultadoPolibio, texto3);
				System.out.println("Resultado Polibio: ");
				for (int i = 0; i < resultadoPolibio.size(); i++) {
					System.out.println(resultadoPolibio.get(i));
				}
				break;

			case 4:
				System.out.println("Ingrese la cadena de texto:");
				String texto4 = scanner.nextLine();
				arreglo = limpiarYRetornar(arreglo);
				LinkedList resultado2 = CodificarADFGVX(arreglo, texto4);
				System.out.println("Resultado ADFGVX: ");
				for (int i = 0; i < resultado2.size(); i++) {
					System.out.println(resultado2.get(i));
				}
				break;
			case 5:
				System.out.println("Ingrese números separados por espacios: (Ejemplo:10 15 20)");
				String input = scanner.nextLine();
				String[] numerosStr = input.split(" ");
				LinkedList numeros = new LinkedList();
				for (String numStr : numerosStr) {
					numeros.add(Integer.parseInt(numStr));
				}
				int mcd = calcularMCD(numeros); 
				System.out.println("MCD de los números: " + mcd);
				break;
			case 6:
				System.out.println("Fin del programa.");
				ciclo=false;

				break;

			default:
				System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
				break;
			}
		}
	}


	public static void convertirBinario(LinkedList arreglo, String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			String binario = "";
			for (int j = 7; j >= 0; j--) { 
				binario += ((letra >> j) & 1);
			}
			arreglo.add(binario);
		}
	}
	public static LinkedList CodificarXor(LinkedList arreglo, String palabra)throws Exception {
		convertirBinario(arreglo, palabra);
		String code = "10101010";
		LinkedList resultado = new LinkedList();
		for (int i = 0; i < arreglo.size(); i++) {
			String binario = (String) arreglo.get(i);
			String codif = "";
			for (int j = 0; j < binario.length(); j++) {
				char bit1 = binario.charAt(j);
				char bit2 = code.charAt(j);
				char xorResult = (bit1 == bit2) ? '0' : '1';
				codif += xorResult;
			}

			resultado.add(codif);
		}

		return resultado;
	}

	public static void ImprimirTablaPolibio() {
		String matrizPolibio[][] = {{"A", "B", "C", "D", "E"},{"F", "G", "H", "I", "J", "K"},{"L", "M", "N", "O", "P"},{"Q", "R", "S", "T", "U"},{"V", "W", "X", "Y", "Z"}};
		System.out.println("Tabla de Polibio:");
		System.out.print("  1 2 3 4 5" + "\n");
		for (int i = 0; i < matrizPolibio.length; i++) {
			System.out.print(i + 1 + " ");
			for (int j = 0; j < matrizPolibio[0].length; j++) {
				System.out.print(matrizPolibio[i][j] + " ");
			}
			System.out.println();
		}
	}


	public static LinkedList CifradoPolibio(LinkedList arreglo, String palabra) {
		String matrizPolibio[][] = {{"A", "B", "C", "D", "E"},{"F", "G", "H", "I/J", "K"},{"L", "M", "N", "O", "P"},{"Q", "R", "S", "T", "U"},{"V", "W", "X", "Y", "Z"}};
		for (int k = 0; k < palabra.length(); k++) {
			char letra = Character.toUpperCase(palabra.charAt(k)); 
			if (letra == 'I' || letra == 'J') {
				arreglo.add("24"); 
			} else {
				boolean encontrado = false;
				for (int i = 0; i < matrizPolibio.length; i++) {
					for (int j = 0; j < matrizPolibio[0].length; j++) {
						if (matrizPolibio[i][j].charAt(0) == letra) {
							arreglo.add(String.valueOf(i + 1) + String.valueOf(j + 1));
							encontrado = true;
							break;
						}
					}
					if (encontrado) {
						break;
					}
				}
			}
		}
		return arreglo;
	}

	public static LinkedList CodificarADFGVX(LinkedList arreglo,String palabra) throws Exception{
		String matriz [][] = {
				{" ","A", "D", "F", "G", "V", "X"},{"A", "", "", "", "", "", ""},{"D", "", "", "", "", "", ""},{"F", "", "", "", "", "", ""},{"G", "", "", "", "", "", ""},{"V", "", "", "", "", "", ""},{"X", "", "", "", "", "", ""}};
		char[] letrasAl = letrasAleatorias("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray());
		int N=0;
		for (int i = 1; i < matriz.length; i++) {
			for (int j = 1; j < matriz[0].length; j++) {
				matriz[i][j]=String.valueOf(letrasAl[N]);
				N++;
			}
		} 
		imprimirMatriz( matriz);
		palabra=palabra.replaceAll(" ", "");
		for (int x = 0; x < palabra.length(); x++) {
			char caracter = palabra.charAt(x);
			int i = 1, j = 1;
			boolean encontrado = false;
			while (i < matriz.length && !encontrado) {
				while (j < matriz[0].length && !encontrado) {
					if (matriz[i][j].equalsIgnoreCase(String.valueOf(caracter))) {
						arreglo.add(String.valueOf(matriz[i][0]) + String.valueOf(matriz[0][j]));
						encontrado = true;
					}
					j++;
				}
				i++;
				j = 1;
			}
		}
		return arreglo;
	}
	public static char[] letrasAleatorias(char[] caracteres) {
		Random random = new Random();

		for (int i = caracteres.length - 1; i > 0; i--) {
			int index = random.nextInt(i + 1);
			char temp = caracteres[i];
			caracteres[i] = caracteres[index];
			caracteres[index] = temp;
		}

		return caracteres;
	}

	public static void imprimirMatriz(String[][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		} 

	}
	public static int calcularMCD(LinkedList numeros) throws Exception {
		int primerNumero =(int) numeros.get(0);
		int segundoNumero =(int) numeros.get(1);
		int mcd = encontrarMCD(primerNumero, segundoNumero);

		for (int i = 2; i < numeros.size(); i++) {
			mcd = encontrarMCD(mcd,(int) numeros.get(i));
		}
		return mcd;
	}

	public static int encontrarMCD(int numero1, int numero2) {
		if (numero2 == 0) {
			return numero1;
		}
		return encontrarMCD(numero2, numero1 % numero2);
	}

	public static LinkedList limpiarYRetornar(LinkedList arreglo) {
		arreglo = new LinkedList(); 
		return arreglo;
	}

}
