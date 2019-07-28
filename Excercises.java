import java.util.*;
public class Excercises{
  /* Clase Excercises que define todos los ejercicios que conforman un plan default:
     entrenamiento. */
     private String name;     // Nombre del ejercicio
     private int numSeries;   // Número de series
     private int repetition;  // Número de repeticiones
     private String machine;  // Máquina en la que se hará el ejercicio
     private String type;     // Tipo de ejercicio
     private String warmup;   // ?

     /* Métodos constructores */
     public Excercises(){
       this.numSeries = 0;
       this.repetition = 0;
       this.machine = "Default";
       this.type = "Default";
       this.warmup = "Default";
       this.name = "Default";
     }

     /* Métodos set */
     public void setName(String nombre){
       this.name = nombre;
     }
     public void setNumSeries(int num){
       this.numSeries = num;
     }
     public void setRepetition(int num){
        this.repetition = num;
     }
     public void setMachine(String nombre){
       this.machine = nombre;
     }
     public void setType(String nombre){
       this.type = nombre;
     }
     public void setWarmup(String nombre){
       this.warmup = nombre;
     }

     /* Métodos get */
     public String getName(){
       return this.name;
     }
     public int getNumSeries(){
      return this.numSeries;
     }
     public int getRepetition(){
        return this.repetition;
     }
     public String getMachine(){
      return this.machine;
     }
     public String getType(){
      return this.type;
     }
     public String getWarmup(){
      return this.warmup;
     }

     /* Método equals */
     public boolean equals(Excercises other){
        boolean ban = true;
        if (this.numSeries != other.numSeries) {
          ban = false;
        }
        if (this.repetition != other.repetition) {
          ban = false;
        }
        if (!(this.machine.equals(other.machine))) {
          ban = false;
        }
        if (!(this.type.equals(other.type))) {
          ban = false;
        }
        if (!(this.warmup.equals(other.warmup))) {
          ban = false;
        }
        return ban;
     }

     /* Método toString */
     public String toString(){
       String message;
       message = "Este es el ejercicio " + this.name + "\n";
       message += "Es del tipo " + this.type + "\n";
       message += "Se realiza en la máquina " + this.machine + "\n";
       message += "Se hacen " + this.numSeries + " de " + this.repetition + " repeticiones.";
       return message;
     }

}
