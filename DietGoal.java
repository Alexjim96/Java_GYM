import java.util.*;
/** Gym Virtual:
        Angeles Martínez Meza
        Alejandro Jiménez Jiménez
        Daniel Alejandro López Hernández
 */
public class DietGoal{
  //Atributos
 // private FoodPlan planAlimentacion;  // Objeto de tipo FoodPlan
  private String foodName;            // Alimento
  private boolean state;              // estado de la meta(come/no come)
  private int BADcounter=0;
  
  //Constructor
  public DietGoal(){
    this.setState(false);
    this.setFoodName("na");
  }

//Métodos
  public String countDietGoals(String foodName){
    String message;
    this.setFoodName(foodName);
    this.setState(true);
    if(foodName == "papas" || foodName == "pastel" || foodName == "refresco" || foodName == "chicharron"  ){
           this.setBADcounter(BADcounter + 1);
    }
    message = "El alimento " + this.foodName + " ";
    message += (this.state)? "se ingirio " : "no se a consumido ninguna ";
    message += getBADcounter()+" veces";
    return message;
  }

  // Seters
  public void setState(boolean estado){
    this.state = estado;
  }
  public void setFoodName(String foodName){
    this.foodName = foodName;
  }
  public void setBADcounter(int num){
        this.BADcounter = num;
  }

  // Geters
  public boolean getState(){
    return this.state;
  }
  public String getFoodName(){
    return this.foodName;
  }
  public int getBADcounter(){
      return this.BADcounter;
  }

  //toString 
  public String toString(){
    String message;
    message = "El alimento " + this.foodName + " ";
    message += (this.state)? "se ingirio" : "no se a consumido";
    return message;
  }
  //equals
  public boolean equals(DietGoal other){
    boolean var = true;
    if (!(this.foodName.equals(other.foodName))) {
      var = false;
    }
    if (this.state != other.state) {
      var = false;
    }
    return var;
  }

  
}
