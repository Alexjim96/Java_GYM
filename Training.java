import java.util.*;
public class Training{
  /* Clase Training: En esta clase se define el plan de entrenamiento de cada
     usuario. */

  private Goal goal;              // Meta
  private Date date;              // Fecha
  private float timePerDay;       // Tiempo al día, medido en horas
  private Excercises []exercise;   // Ejercicios
  private double burnedCalories;  // Calorias quemadas

  /* Métodos constructores */
  public Training(){
    goal = new Goal();  // Debería ser un arreglo de metas?
    date = new Date();
    timePerDay = 0;
    exercise = new Excercises[5];  // También debería ser un arreglo?
    for (int i = 0; i < exercise.length ;i++ ) {
      exercise[i] = new Excercises();  // Inicialización del arreglo con ejercicios por default
    }
    burnedCalories = 0;
  }

  public Training(Goal meta, float tiempo, Excercises []ejercicios){
    goal = meta;
    date = meta.getEstimatedTime();
    timePerDay = tiempo;
    exercise = ejercicios;
    /* Falta el cálculo de las calorias pero se necesitan los datos de la clase usuario */
  }

  public double calculatedBurnedCalories(double weight, int height, char sex, int age){
    /* Función que calcula las calorias quemadas */
    double cal = 0;
    if (sex == 'M') {
      cal = (13.75 * weight) + (5 * height) - (6.76 * age) + 66; 
     }
     else{
      cal = (9.56 * weight) + (1.85 * height) - (4.68 * age) + 655;
     }
     return cal; 
  }

  /* Métodos set */
  public void setGoal(Goal meta){
    this.goal = meta;
    setDate(meta);
  }
  public void setDate(Goal meta){
    this.date = meta.getEstimatedTime();
  }
  public void setTimePerDay(float num){
    this.timePerDay = num;
  }
  public void setBurnedCalories(double num){
    this.burnedCalories = num;
  }
  /* Método para definir los ejercicios del plan de entrenamiento */
  public void setExcercise(Excercises other , int ind){
    this.exercise[ind] = other;
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
  public Excercises getExcercises(int ind){
    return this.exercise[ind];
  }
  public Excercises [] getExcercises(){
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
    /* Falta modificar para revisar los ejercicios uno por uno */
    if (!(this.exercise.equals(other.exercise))) {
      ban = false;
    }
    return ban;
  }

  /* Método toString */
  public String toString(){
    String message;
    String respNameExcercise = "";
    message = "Se presenta la iformació del plan de entrenamiento: \n";
    message += "El plan consiste en los siguientes ejercicios:\n";
    for (int i = 0 ; i < this.exercise.length ;i++ ) {
      respNameExcercise += this.exercise[i].getName() + "\n";
    }
    message += respNameExcercise + "\n";
    message += "La meta de este plan es: " + this.goal.getName();
    return message;
  }
}  // Fin clase
