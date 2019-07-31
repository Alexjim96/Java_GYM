import java.util.*;
/** Gym Virtual:
        Angeles Martínez Meza
        Alejandro Jiménez Jiménez
        Daniel Alejandro López Hernández
 */
public class Food extends FoodPlan{
    //Atributos
     private String[] foodGroup = new foodGroup[9];         // Declaracion y creacion del array Grupo Alimenticio
     private String[] foodType = new foodType[5];           // Declaracion y creacion del array  tipo de comida
     private String foodName;                               // Nombre del alimento
     private String quantity;                               // Cantidad
     private double caloriesPerSlice;                       //Calorias por porcion

    //Constructor
     public Food(){
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
     public String[] getFoodType(){
         return tipo;
     }
     public String getFoodName(){
       return this.alimento;
     }
     public String getQuantity(){
      return this.cantidad;
     }
     public double getCaloriesPerSlice(){
        return this.caloriasPorcion;
     }

    //toString 
     public String toString(){
       String message;
       message = this.quantity + " del alimento " + this.foodName ;
       message += " contiene " + this.caloriesPerSlice + "calorias \n";
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
  	public void rentar(String nombreCliente){//cuando se renta un auto se asigna en nombre del cliente, se cambia el status a rentado, disponible flase, e inicia el kmetraje
		this.cliente=nombreCliente;
		this.estaRentado=true;
		this.disponible=false;
		this.kilometraje=0;
		//grabar en la bd
		
	}
	
	public void devuelve(int kmRecorridos){f//al  regresar un vehiculo, se proporcionará el kilometraje y con base a este se calculara el precio a pagar (kmetraje*2)
		//si km es negativo no la aceptes
		if(kmRecorridos>0){
			double factor =0;
			this.cliente="no disponible";
			this.estaRentado=false;
			this.disponible=true;
			this.kilometraje=kmRecorridos;
			if(kmRecorridos>=100)
				factor=2;
			else
				if(kmRecorridos>=1000)
					factor=2.5;
				else
					factor=3;
			
			
			this.precio=kmRecorridos*factor*1.16;
		}
		//grabar eb bd
		
		
	}

}
