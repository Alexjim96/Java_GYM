import java.util.*;
/** Gym Virtual:
        Angeles Martínez Meza
        Alejandro Jiménez Jiménez
        Daniel Alejandro López Hernández
 */
public class Food {
    //Atributos
     private String[] foodGroup = {"Aceites y Grasas", "Alimentos libres", "AOA", "Azucares","Cereales","Fruta","Lacteos","Leguminosas","Verdura"};         // Declaracion y creacion del array Grupo Alimenticio
     private String[] foodType={"Desayuno", "Colacion1", "Comida", "Colacion2","Cena"};                      // Declaracion y creacion del array  type de comida
     private String foodName;                               // Nombre del alimento
     private String quantity;                               // Cantidad
     private double caloriesPerSlice;                       //Calorias por porcion
     private String type;
     private String group;
     
     
    // Seters
     public void setFoodName(String alimento){
       this.foodName = alimento;
     }
     public void setQuantity(String quantity){
       this.quantity = quantity;
     }
     public void setType(int tipo){
        switch(tipo){
            case 1:
              this.type= foodType[0];
            break; 
            case 2:
              this.type= foodType[1];
            break;
            case 3:
              this.type= foodType[2];
            break;
            case 4:
              this.type= foodType[3];
            break;
            case 5:
              this.type= foodType[4];
            break;
        }
      }

      public void setGroup(int grupo){
        switch(grupo){
            case 1:
              this.group= foodGroup[0];
            break; 
            case 2:
              this.group= foodGroup[1];
            break;
            case 3:
              this.group= foodGroup[2];
            break;
            case 4:
              this.group= foodGroup[3];
            break;
            case 5:
              this.group= foodGroup[4];
            break;
            case 6:
              this.group= foodGroup[5];
            break;
            case 7:
              this.group= foodGroup[6];
            break;
            case 8:
              this.group= foodGroup[7];
            break;
            case 9:
              this.group= foodGroup[8];
            break;
        }
      }

     public void setCaloriesPerSlice (double calorias){
        this.caloriesPerSlice = calorias;
     }


    //Geters
     public String getType(){
       return this.type;
     }
     public String getGroup(){
       return this.group;
     }
     public String getFoodName(){
       return this.foodName;
     }
     public String getQuantity(){
      return this.quantity;
     }
     public double getCaloriesPerSlice(){
        return this.caloriesPerSlice;
     }

     //Constructor
     public Food(){
       this.setFoodName("NA");
       this.setQuantity("NA");
       this.setCaloriesPerSlice(0);
     }

    //toString 
     public String toString(){
       String message;
       message = this.quantity + " de " + this.foodName ;
       message += " contiene " + this.caloriesPerSlice + " calorias \n";
       message += "se consumio en "+ this.type +" y es de grupo "+ this.group;
       return message;
     }

    //equals
    public boolean equals(Food other){
    boolean var = true;
    if (!(this.foodName.equals(other.caloriesPerSlice))) {
      var = false;
    }
    if (!(this.quantity.equals(other.quantity))) {
      var = false;
    }
    if (this.caloriesPerSlice != other.caloriesPerSlice) {
      var = false;
    }
    return var;
  }

}
