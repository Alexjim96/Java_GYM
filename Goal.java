import java.util.*;
public class Goal{
  /* Clase Goal que define las metas de cada uno de los usuarios. */
  private Date estimatedTime;  // Tiempo estimado
  private boolean state;       // Estado (cumplida, no cumplida)
  private String name;         // Nombre de la meta
  /* Métodos constructores */
  public Goal(){
    this.estimatedTime = new Date();
    this.state = false;
    this.name = "Dafault";
  }

  /* Métodos set */
  public void setEstimatedTime(Date fec){
    this.estimatedTime = fec;
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
    message += (this.state)? "La meta se cumplió" : "La meta aun no se cumple";
    message += ".\n";
    return message;
  }
}
