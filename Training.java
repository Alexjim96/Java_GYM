import java.util.*;
public class Training{
  /* Clase Training: En esta clase se define el plan de entrenamiento de cada
     usuario. */

  private Goal goal;              // Meta
  private Date date;              // Fecha
  private float timePerDay;       // Tiempo al día, medido en horas
  private Excercises exercise;   // Ejercicio
  private double burnedCalories;  // Calorias quemadas

  /* Métodos constructores */
  public Training(){
    this.goal = new Goal();  // Debería ser un arreglo de metas?
    this.date = new Date();
    this.timePerDay =  (float) 3.5;
    this.exercise = new Excercises();  // También debería ser un arreglo?
    this.burnedCalories = 0;
  }

  public Training(double weight, int height, char sex, int age, String frequency){
    // ¿Cómo manejar los datos de este constructor?
  }

  public double calculatedBurnedCalories(double weight, int height, char sex, String frequency){
    /* Función que calcula las calorias quemadas */
    return 5.5; 
  }

  /* Métodos set */
  public void setGoal(Goal meta){
    this.goal = meta;
  }
  public void setDate(Date fec){
    this.date = fec;
  }
  public void setTimePerDay(float num){
    this.timePerDay = num;
  }
  public void setBurnedCalories(double num){
    this.burnedCalories = num;
  }
  /* Método para definir los ejercicios del plan de entrenamiento */
  public void setExcercise(Excercises other){
    this.exercise = other;
  }

  /* Métodos get */
  public String getGoal(){
    return this.goal.toString();
  }
  public Date getDate(){
    return this.date;
  }
  public float getTimePerDay(){
    return this.timePerDay;
  }
  public double getBurnedCalories(){
    return this.burnedCalories;
  }
  public Excercises getExcercises(){
    return this.exercise;
  }

  /* Método equals */
  public boolean equals(Training other){
    boolean ban = true;
    if (!(this.date.equals(other.date))) {
      ban = false;
    }
    if (this.timePerDay != other.timePerDay) {
      ban = false;
    }
    if (!(this.exercise.equals(other.exercise))) {
      ban = false;
    }
    return ban;
  }

  /* Método toString */
  public String toString(String usuario){
    String message;
    String respNameExcercise;
    message = "Este es el plan de entrenamiento de " + usuario + "\n";
    message += "El plan consiste en los siguientes ejercicios:\n";
    respNameExcercise = this.exercise.getName();
    message += respNameExcercise + "\n";

    return message;
  }
}  // Fin clase
