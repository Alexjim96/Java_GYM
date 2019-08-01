import java.util.*;
/** Gym Virtual:
        Angeles Martínez Meza
        Alejandro Jiménez Jiménez
        Daniel Alejandro López Hernández
 */
public class FoodPlan extends Food{
    //Atributos
     private int idUser;                                    // Identificador de ususario
     private double consumedCalories;                       // Calorias consumidas
     private double caloriesPerDay;                         // Calorias por día
     private Food food1=new Food();                                   // Alimentos

    //Constructor
     public FoodPlan(){
       this.setConsumedCalories(0);
       this.setCaloriesPerDay(0);
       }

    // Seters
     public void setConsumedCalories(double cal){
       this.consumedCalories = cal;
     }
     public void setCaloriesPerDay(double calorias){
        this.caloriesPerDay = calorias;
     }

    //Geters
     public double getConsumedCalories(){
       return this.consumedCalories;
     }
     public double getCaloriesPerDay(){
      return this.caloriesPerDay;
     }

    //toString 
     public String toString(){
       String message;
       message = " del alimento ";
       message += " debe consumir " + this.caloriesPerDay + "de las cuales, consumio" + this.consumedCalories;
       return message;
     }
  //equals 
    public boolean equals(FoodPlan other){
      boolean var = true;
      if (this.consumedCalories != other.consumedCalories) {
        var = false;
      }
      if (this.caloriesPerDay != other.caloriesPerDay) {
        var = false;
      }
      return var;
    }
    //Metodos
     public double calculateConsumedCalories(double weight, int height, char sex, int age){
     double caloriasC = 0;
    if (sex == 'H') {
      caloriasC = 66.473 + (13.751 * weight) + (5.0033 * height) – (6.7550 * age);
     }
     else{
      caloriasC = 655.1 + (9.463 * weight) + (1.85 * height) - (4.6756  * age);
     }
     return caloriasC; 
  }
}
