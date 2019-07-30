/**
    Clase de prueba para cada uno de los metodos
    de las clases del proyecto GYM VIRTUAl
*/
public class PruebaProyecto{
    public static void main(String[] args) {
        int opcion = 0;
        Libreria.imprime("****BIENVENIDO A GYM VIRTUAL!****\n");
        Libreria.imprime("\t*************");
        Libreria.imprime("\t*    MENU   *");
        Libreria.imprime("\t*************\n");
        Libreria.imprime("\t1. Clase Usuario");
        Libreria.imprime("\t2. Clase Plan de Entrenamiento");
        Libreria.imprime("\t3. Clase Ejercicos");
        Libreria.imprime("\t4. Clase Objetivo");
        Libreria.imprime("\t5. Clase Plan de Alimentación");
        Libreria.imprime("\t6. Clase Objetivo de Alimentación\n");

        System.out.print("");
        opcion = Libreria.capturaEntero("Seleccione una opción del menú: ",1,6);
        switch(opcion){
            case 1:
                pruebaUser();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;

        }
    }
    public static void pruebaUser(){
        User user1 = new User();
        User user2 = new User("Juan","juan@mail.com",23,"12as3",1.78,76,'M');

        Libreria.imprime("****Bienvenido al registro****\nIngresa los datos siguientes.");
        user1.setUserName(Libreria.capturaTexto("Nombre: "));
        user1.setEmail(Libreria.capturaTexto("Email: "));
        user1.setAge(Libreria.capturaEntero("Edad: ",0,100));
        user1.setPassword(Libreria.capturaTexto("Contraseña: "));
        user1.setSex(Libreria.capturaChar("Sexo(F/M): "));
        user1.setWeight(Libreria.capturaDoble("Peso: ",0,1000));
        user1.setHeight(Libreria.capturaDoble("Estatura(en metros): ",0,1000));
        user1.setIdUser(1);
        user1.setImc();
        System.out.println("Registro: "+user1.signin());

        Libreria.imprime("****Prueba de inicio de sesión****");
        System.out.println("Inicio: "+user1.login(Libreria.capturaTexto("Usuario: "),Libreria.capturaTexto("Contraseña: ")));
        System.out.println();

        user2.setImc();
        Libreria.imprime("Creacion de usuario con nombre: "+user2.getUserName());
		System.out.printf("IMC de %s: %.1f\n",user2.getUserName(),user2.getImc());
        System.out.printf("Tu IMC: %.1f\n",user1.getImc());
        Libreria.imprime("El usuario "+user2.getUserName()+" es igual a "+user1.getUserName()
                         +": "+user1.equals(user2));
        System.out.println();
        Libreria.imprime("********************************");
        Libreria.imprime(user1.toString());
        Libreria.imprime("********************************");
        Libreria.imprime(user2.toString());


    }
}
