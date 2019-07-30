import java.util.*;
public class TryTrainingPlan{
	public static void main(String[] args) {
		/* Clase para realizar pruebas de funcionamiento de las clases Training, Goal, Excercises */

		/* Prueba de la clase Goal */
		Scanner teclado = new Scanner(System.in);
		Libreria.imprime("Las metas de GymVirtual son las siguientes, elije la que cumpla con tus intereses: ");
		Libreria.imprime("1.- Ganar masa muscular.");
		Libreria.imprime("2.- Bajar de peso.");
		Libreria.imprime("2.- Mantener peso.");
		/* Meta ganar masa muscular */
		int op = Libreria.capturaEntero("Opción elegida(1): ",1,3);  // Opción para elegir metas
		op -= 1;
		Goal meta1 = new Goal(op);
		/* Meta bajar de peso */
		op = Libreria.capturaEntero("Opción elegida(2): ",1,3);
		op -= 1;
		Goal meta2 = new Goal(op);
		/* Meta mantener peso */
		op = Libreria.capturaEntero("Opción elegida(3): ",1,3);
		op -= 1;
		Goal meta3 = new Goal(op);
		/* Meta default */
		Goal metaDef = new Goal();

		/* Visualización de las metas */
		Libreria.imprime(meta1.toString());
		Libreria.imprime(meta2.toString());
		Libreria.imprime(meta3.toString());
		Libreria.imprime(metaDef.toString());

		/* Prueba de métodos set y get */
		meta1.setEstimatedTime(2023, 8, 20);
		Libreria.imprime("Nueva fecha de meta1: " + meta1.getEstimatedTime());
		meta1.setState(true);
		Libreria.imprime("El estado de la meta1 se cambio a: " + meta1.getState());

		/* Impresión de la meta1 después de usar los métodos set y get */
		Libreria.imprime("Nueva meta1:");
		Libreria.imprime(meta1.toString());

		/* Prueba método equals */
		Libreria.imprime("Las metas 1 y 2 son iguales?");
		Libreria.imprime((meta1.equals(meta2))? "Si" : "No");

	}  // Fin main
}  // Fin clase TryTrainingPlan
