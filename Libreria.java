/**
	Clase libreria para usar metodos confiables y aprueba de errores para entradas del usuario
	se crean funciones y procedimeintos para capturar diferentes tipo de variable
*/
import java.util.*;
public final class Libreria{

	public static void imprime(String mensaje){
		System.out.println(mensaje);
	}
	public static String capturaTexto(String msj){
		Scanner entrada = new Scanner(System.in);
		System.out.print(msj);
		return(entrada.nextLine());
	}
	public static int capturaEntero(String msj, int inicio, int fin){
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		boolean valorCorrecto = false;

		do{
			System.out.print(msj);
			try{
				num = entrada.nextInt();
				if(num>=inicio && num <=fin){
					valorCorrecto = true;
				}else{
					System.out.println("La opcion no esta dentro del rango, intenta de nuevo.");
				}
			}catch(InputMismatchException e){
				System.out.println("Debes ingresar un número entero, intentalo de nuevo.");
				entrada.nextLine(); //Libera lo que se quede atrapado en el buffer
			}
		}while(!(valorCorrecto));

		return num;
	}
	public static Double capturaDoble(String msj, double inicio, double fin){
		Scanner entrada = new Scanner(System.in);
		double num = 0;
		boolean valorCorrecto = false;

		do{
			System.out.print(msj);
			try{
				num = entrada.nextDouble();
				if(num>=inicio && num <=fin){
					valorCorrecto = true;
				}else{
					System.out.println("La opcion no esta dentro del rango, intenta de nuevo.");
				}
			}catch(InputMismatchException e){
				System.out.println("Debes ingresar un número decimal, intentalo de nuevo.");
				entrada.nextLine();
			}
		}while(!(valorCorrecto));

		return num;
	}
	public static char capturaChar(String msj){
		Scanner entrada = new Scanner(System.in);
		char valor = '\0';
		do{
			System.out.print(msj);
			valor = entrada.nextLine().charAt(0);
		}while(valor=='\0');

		return(valor);

	}
}
