import java.util.*;
public class Goal{
  /* Clase Goal que define las metas de cada uno de los usuarios. */
  private Date estimatedTime;  // Tiempo estimado
  private boolean state;       // Estado (cumplida, no cumplida)
  private String name;         // Nombre de la meta
  private String []names = {"Ganar masa muscular", "Perder peso", "Mantener peso"};  // Nombre de la meta ( Definir un arreglo que contenga varios nombres
                               // de metas)
  /* Métodos constructores */
  public Goal(){
    estimatedTime = new Date();
    state = false;
    name = "Dafault";
  }
  public Goal(int op){
    estimatedTime = new Date();
    Calendar calendario = Calendar.getInstance();
    calendario.setTime(estimatedTime);
    switch (op) {
      case 0:
          calendario.add(Calendar.DAY_OF_YEAR,10);
          estimatedTime = calendario.getTime();
          state = false;
          name = names[op];
      break;
      case 1:
        calendario.add(Calendar.DAY_OF_YEAR,20);
        estimatedTime = calendario.getTime();
        state = false;
        name = names[op];
      break;
      case 2:
        calendario.add(Calendar.DAY_OF_YEAR,30);
        estimatedTime = calendario.getTime();
        state = false;
        name = names[op];
      break;
      default:
        estimatedTime = new Date();
        state = false;
        name = "Dafault";
      break;
    }
  }

  /* Métodos set */
  public void setEstimatedTime(int anio, int mes, int dia){
    anio -= 1900;
    mes -= 1;
    Date fecha2 = new Date(anio, mes, dia);
    this.estimatedTime = fecha2;
  }
  public void setState(boolean val){
    this.state = val;
  }

  /* Métodos get */
  public Date getEstimatedTime(){
    return this.estimatedTime;
  }
  public boolean getState(){
    return this.state;
  }
  public String getName(){
    return this.name;
  }

  /* Método equals */
  public boolean equals(Goal other){
    boolean ban = true;
    if (!(this.estimatedTime.equals(other.estimatedTime))) {
      ban = false;
    }
    if (this.state != other.state) {
      ban = false;
    }
    return ban;
  }

  /* Métodos toString */
  public String toString(){
    String message;
    message = "Esta es la meta " + this.name + "\n";
    message += "Se tiene previsto cumplirla el: " + this.estimatedTime + "\n";
    message += (this.state)? "La meta se ha cumplido." : "La meta aún no se cumple";
    message += ".\n";
    return message;
  }
}
