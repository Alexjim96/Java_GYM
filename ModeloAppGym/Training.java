import java.util.*;
import java.text.SimpleDateFormat;  // Para formato
final class Training implements IBaseDatos{
  /* Clase Training: En esta clase se define el plan de entrenamiento de cada
     usuario. */
  /* Creación del formato para las fechas manejadas */
  SimpleDateFormat formatoEsMX = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy", new Locale("ES", "MX"));
  private Goal goal;              // Meta
  private Date date;              // Fecha
  private float timePerDay;       // Tiempo al día, medido en horas
  private Excercises []exercise;  // Ejercicios
  private double burnedCalories;  // Calorias quemadas
  private String userName;        // Nombre del usuario

  /* Métodos constructores */
  public Training(){
    goal = new Goal();
    date = new Date();
    timePerDay = 0;
    exercise = new Excercises[5];
    for (int i = 0; i < exercise.length ;i++ ) {
      exercise[i] = new Excercises();  // Inicialización del arreglo con ejercicios por default
    }
    burnedCalories = 0;
    userName = "Sin nombre";
  }

  public Training(Goal meta, float tiempo, Excercises []ejercicios, User usuario){
    goal = meta;
    date = meta.getEstimatedTime();
    timePerDay = tiempo;
    exercise = ejercicios;
    burnedCalories = calculatedBurnedCalories(usuario.getWeight(),usuario.getHeight(), usuario.getSex(),usuario.getAge());
    userName = usuario.getUserName();
  }

  public double calculatedBurnedCalories(double weight, double height, char sex, int age){
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
  public void setUserName(String nombre){
    this.userName = nombre;
  }
  /* Método para definir los ejercicios del plan de entrenamiento */
  public void setExcercise(Excercises other , int ind){
    /* Este método define uno de los ejercicios del plan, recibe el índice del arreglo
       donde se almacenará el ejercicio */
    this.exercise[ind] = other;
  }

  /* Métodos get */
  public String getGoal(){
    return this.goal.getName();
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
  public String getUserName(){
    return this.userName;
  }

  /* Método equals */
  public boolean equals(Training other){
    boolean ban = true;
    if (!(this.goal.getName().equals(other.goal.getName()))) {
    	ban = false;
    }
    if (!(this.date.equals(other.date))) {
      ban = false;
    }
    if (this.timePerDay != other.timePerDay) {
      ban = false;
    }
    /* Se puede revisar unicamente el tamaño y el orden de los elementos ya que
       una vez se implemente la base de datos, el sistema asignará los ejercicios */
    if (this.exercise.length != other.exercise.length) {
    	ban = false;
    }
    else{
    	for (int i = 0; i < this.exercise.length ; i++ ) {
    		if (!(this.exercise[i].getName().equals(other.exercise[i].getName()))) {
    			ban = false;
    			break;
    		}
    	}
    }
    if (!(this.userName.equals(other.getUserName()))) {
      ban = false;
    }
    return ban;
  }

  /* Método toString */
  public String toString(String usuario){
    /* Este método tomará información del plan de entrenamiento de la base de datos a partir del
       nombre de usuario, por el momento solo se imprime */
    String message;
    String respNameExcercise = "";
    message = "Se presenta la iformació del plan de entrenamiento de: " + usuario + " \n";
    message += "El plan consiste en los siguientes ejercicios:\n";
    for (int i = 0 ; i < this.exercise.length ;i++ ) {
      respNameExcercise += this.exercise[i].getName() + "\n";
    }
    message += respNameExcercise;
    message += "La meta de este plan es: " + this.goal.getName();
    message += "\nAproximadamente se cumplirá el: " + formatoEsMX.format(this.date) + "\n";
    message += "Se queman aproximadamente " + this.burnedCalories + " calorias.";
    return message;
  }

  /* Interacción con la base de datos */
  public boolean insertData(){
  	return false;
  }
  public boolean selectData(){
  	return false;
  }
  public boolean deleteData(){
  	return false;
  }
  public boolean updateData(){
  	return false;
  }
}  // Fin clase
