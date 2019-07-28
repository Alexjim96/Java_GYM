import java.util.*;
/** Gym Virtual:
        Angeles Martínez Meza
        Alejandro Jiménez Jiménez
        Daniel Alejandro López Hernández
 */
public class FoodPlan{
    //Atributos
     private int idUser;                                    // Identificador de ususario
     private String[] foodType = new foodType[5];           // Declaracion y creacion del array  tipo de comida
     private double consumedCalories;                       // Calorias consumidas
     private double caloriesPerDay;                         //Calorias por día

    //Constructor
     public FoodPlan(){
       this.foodName = "NA";
       this.quantity = "";
       this.caloriesPerSlice = 0;
       String[] foodGroup = {"Aceites y Grasas", "Alimentos libres", "AOA", "Azucares","Cereales","Fruta","Lacteos","Leguminosas","Verdura"};
       String[] foodType = {"Desayuno", "Colacion1", "Comida", "Colacion2","Cena"};
     }

    // Seters
     public void setFoodType(String[] tipo){
         this.foodType = tipo;
     }
     public void setFoodName(String alimento){
       this.foodName = alimento;
     }
     public void setQuantity(String quantity){
       this.quantity = quantity;
     }
     public void setCaloriesPerSlice (double calorias){
        this.caloriesPerSlice = calorias;
     }

    //Geters
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
     public String[] getFoodType(){
      return tipo;
     }

    //toString 
     public String toString(){
       String message;
       message = this.quantity + " del alimento " + this.foodName ;
       message += " contiene " + this.caloriesPerSlice + "calorias \n";
       return message;
     }

}
