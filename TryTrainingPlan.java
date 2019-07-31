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

		/* Prueba de la clase Excercises */
		/* Creación de objetos de la clase Excercises */
		Excercises ejDefault = new Excercises();  // Ejercicio con constructor por default
		Excercises ejerc1 = new Excercises("Pesas", 5, 10, "Banco", 3, "Peso de 5Kg");
		Excercises ejerc2 = new Excercises("Press de pecho", 5, 10, "Banco", 3, "Peso de 5Kg");
		Excercises ejerc3 = new Excercises("Press de pierna", 5, 10, "Banco", 3, "Peso de 5Kg");
		Excercises ejerc4 = new Excercises("Press de tricep", 5, 10, "Banco", 3, "Peso de 5Kg");
		Excercises ejerc15 = new Excercises("Mancuernas", 5, 10, "Banco", 3, "Peso de 5Kg");
		Excercises ejerc5 = new Excercises("Remo", 5, 10, "Poleas", 2, "Peso de 5Kg");
		Excercises ejerc6 = new Excercises("Caminar", 5, 10, "Caminadora", 2, "Peso de 5Kg");
		Excercises ejerc7 = new Excercises("Correr", 5, 10, "Caminadora", 2, "Peso de 5Kg");
		Excercises ejerc8 = new Excercises("Trotar", 5, 10, "Caminadora", 2, "Peso de 5Kg");
		Excercises ejerc9 = new Excercises("Nadar", 5, 10, "Caminadora", 2, "Peso de 5Kg");
		Excercises ejerc10 = new Excercises("Saltar cuerda", 5, 10, "N/A", 1, "Peso de 5Kg");
		Excercises ejerc11 = new Excercises("Bicicleta", 5, 10, "Bicicletas", 1, "Peso de 5Kg");
		Excercises ejerc12 = new Excercises("Croisant", 5, 10, "N/A", 1, "Peso de 5Kg");
		Excercises ejerc13 = new Excercises("Croisant", 5, 10, "N/A", 1, "Peso de 5Kg");
		Excercises ejerc14 = new Excercises("Croisant", 5, 10, "N/A", 1, "Peso de 5Kg");
		/* Prueba del método toString */
		Libreria.imprime(ejDefault.toString());
		Libreria.imprime(ejerc1.toString());
		Libreria.imprime(ejerc5.toString());
		Libreria.imprime(ejerc14.toString());
		/* Prueba de métodos Set y Get 
		   Para probar estos métodos se corregirá la información del ejercicio 14
		   que es creado con el nombre Croisant */
	    ejerc14.setName("Crossfit");
	    ejerc14.setNumSeries(3);
	    ejerc14.setRepetition(0);
	    ejerc14.setMachine("N/A");
	    ejerc14.setType(2);
	    ejerc14.setWarmup("Calentamiento ligero.");
		/* Visualización del ejercicio 14 a traves de los métodos get */
		Libreria.imprime("El nombre del ejercicio 14 es: " + ejerc14.getName());
		Libreria.imprime("El tipo del ejercicio 14 es: " + ejerc14.getType());
		Libreria.imprime("En el ejercicio 14 se hacen " + ejerc14.getNumSeries() + " series");
		Libreria.imprime("En el ejercicio 14 cada serie es de: " + ejerc14.getRepetition() + " repeticiones" );
		Libreria.imprime("El ejercicio 14 se hace en la maquina: " + ejerc14.getMachine());
		Libreria.imprime("El Calentamiento del ejercicio 14 es: " + ejerc14.getWarmup());
		/* Prueba del método equals de la clase Excercises */
		Libreria.imprime("Comparación ejercicios 1 y 14 (no son iguales.)");
		Libreria.imprime((ejerc14.equals(ejerc1))? "Son iguales." : "No son iguales.");
		Libreria.imprime("Comparación ejercicios 12 y 13 (son iguales.)");
		Libreria.imprime((ejerc12.equals(ejerc13))? "Son iguales." : "No son iguales.");

		/* Prueba de la clase Training */
		/* Prueba de constructores */
		Training planDefault = new Training();  // Plan por default
		Excercises [] arrPlan1 = new Excercises[5];
		arrPlan1[0] = ejerc1;
		arrPlan1[1] = ejerc2;
		arrPlan1[2] = ejerc3;
		arrPlan1[3] = ejerc4;
		arrPlan1[4] = ejerc15;
		Training plan1 = new Training(meta1, 5, arrPlan1);
		/* Prueba del método toString */
		Libreria.imprime("Información del plan por default: ");
		Libreria.imprime(planDefault.toString());
		Libreria.imprime("Información del plan 1: ");
		Libreria.imprime(plan1.toString());
		/* Prueba de métodos set y get */
		planDefault.setGoal(meta2);
		planDefault.setTimePerDay((float)8.9);
		planDefault.setBurnedCalories(5000);
		planDefault.setExcercise(ejerc1,0);
		planDefault.setExcercise(ejerc2,1);
		planDefault.setExcercise(ejerc3,2);
		planDefault.setExcercise(ejerc4,3);
		planDefault.setExcercise(ejerc15,4);

		/* Impresión de la información del plan default a través de 
		   los métodos get */
		Libreria.imprime("La meta del plan default es: " + planDefault.getGoal());
		Libreria.imprime("La fecha para cumplir este plan es: " + planDefault.getDate());
		Libreria.imprime("El tiempo que se le dedica a este plan al dia son: " + planDefault.getTimePerDay() + " hrs.\n");
		Libreria.imprime("Las calorias que se queman con este plan son: " + planDefault.getBurnedCalories());
		Libreria.imprime("Los ejercicios que conforman este plan son: ");
		for (int i = 0; i < planDefault.getExcercises().length ;i++ ) {
			Libreria.imprime(planDefault.getExcercises(i) + ".\n");
		}


	}  // Fin main
}  // Fin clase TryTrainingPlan
