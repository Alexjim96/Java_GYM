import java.util.*;
/** Gym Virtual:
        Angeles Martínez Meza
        Alejandro Jiménez Jiménez
        Daniel Alejandro López Hernández
 */
public class DietGoal{
  //Atributos
  private FoodPlan planAlimentacion;  // Objeto de tipo FoodPlan
  private String foodName;            // Alimento
  private boolean state;              // estado de la meta(come/no come)
  //Constructor
  public Goal(){
    this.planAlimentacion = new FoodPlan();
    this.state = false;
    this.foodName = "na";
  }

  // Seters
  public void setState(boolean estado){
    this.state = estado;
  }
  public void setFoodName(String foodName){
    this.foodName = foodName;
  }

  // Geters
  public boolean getState(){
    return this.state;
  }
  public String getFoodName(){
    return this.foodName;
  }

  //toString 
  public String toString(){
    String message;
    message = "El alimento " + this.foodName + " ";
    message += (this.state)? "Se ingirio" : "no se a consumido";
    return message;
  }
  public GoodFoodCounter(){
      
  }
}
