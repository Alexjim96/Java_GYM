/*
	Clase usuario
	se implementa todo lo necesario que debe tener un usuario
	en el sistema
*/
public class User{
	private String userName;
	private String email;
	private int age;
	private String password; //No Asignado
	private double height;
	private double weight;
	private char sex; //No tiene
	private double imc      = 0.0;
	private int frecuency   = 0;
	private int idUser      = 0; //debe incrementar casa vez que se crea un nuevo usuario

	public User(){
		this.userName = "Desconocido";
		this.email    = "example@email.com";
		this.age      = 0;
		this.password = "NA"; //No Asignado
		this.height   = 0.0;
		this.weight   = 0.0;
		this.sex 	  = 'N'; //No tiene
		this.imc      = 0.0;
		this.frecuency= 0;
		this.idUser   = 0;

	}
	public User(String userName, String email, int age, String password, double height, double weight, char sex){
	    this.setUserName(userName);
	    this.setEmail(email);
		this.setAge(age);
		this.setPassword(password);
		this.setHeight(height);
		this.setWeight(weight);
		this.setSex(sex);
}
	//getters
	public String getUserName(){
		return this.userName;
	}
	public String getEmail(){
		return this.email;
	}
	public int getAge(){
		return this.age;
	}
	public String getPassword(){
		return this.password;
	}
	public double getHeight(){
		return this.height;
	}
	public double getWeight(){
		return this.weight;
	}
	public char getSex(){
		return this.sex;
	}
	public double getImc(){
		return this.imc;
	}
	public int getFrecuency(){
		return this.frecuency;
	}
	public int getIdUser(){
		return this.idUser;
	}
	//setters
	public void setUserName(String name){
		if(name.length()>0 && name.length()<60)
			this.userName = name;
		else
			this.userName = "Sin nombre";
	}
	public void setEmail(String email){
		if(email.length()>0)
			this.email = email;
		else
			this.email = "No asignado";
	}
	public void setAge(int age){
		if(age>10 && age<60)
			this.age = age;
		else
			this.age = 99;
	}
	public void setPassword(String pass){
		if(pass.length()>=8)
			this.password = pass;
		else
			this.password = "NA";
	}
	public void setHeight(double height){
		this.height = height;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public void setSex(char sex){
		if(sex == 'M' || sex == 'F')
			this.sex = sex;
		else
			sex = 'N';
	}
	public void setImc(){
		if(this.weight > 0 && this.height > 0)
			this.imc = this.weight/(this.height*this.height);
	}
	public void setFrecuency(int freq){
		this.frecuency = freq;
	}
	public void setIdUser(int id){
		this.idUser = id;
	}

	/*Obtiene los datos del usuario de la BD si no enccuentra de acuerdo al nombre y a la contraseña manda
		manda false que quiere decir que no esta registrado en el sistema
		*/
	public boolean login(String name, String pass){
		/*String[] datosUser = {"Juan","12as3"};//Obtenidos de la base de datos
		if(name==datosUser[0] && pass==datosUser[1])*/
			return true;
	}

	public boolean signin(){// metodo que puede guardar los datos del usuario en la base de datos
		/*String querySignin = "INSERT INTO user VALUES("+
							 this.idUser + ", " +
							 this.userName + ", " +
							 this.email + ", " +
							 this.password + ", " +
							 this.weight + ", " +
							 this.height + ", " +
							 this.sex + ", " +
							 this.imc + ");";
		System.out.println(querySignin);*/
		return true;
	}
	public boolean recoverPassword(String newPass){
		//manda email al Usuario
		this.setPassword(newPass);
		if(this.getPassword().equals("NA"))
				return false;
		else
			return true;
	}
	public String getTrainPlan(){
		int idUser = this.idUser;
		Training us = new Training();
		return(us.toString(this.userName));
	}
	// Descomentar cuando FoodPlan este completa y sin errores
	// public String getFoodPlan(int idUser){
	// 	FoodPlan us = new FoodPlan();
	// 	return(us.toString());
	// }
	public boolean equals(User other){
		if(this.userName.equals(other.userName)&&this.password.equals(other.password) ||
			this.idUser==other.idUser||this.email.equals(other.email))
			return true;
		else
			return false;
	}
	@Override
	public String toString(){
		String infoUser = "***Información del usuario***\n" +
						 "ID del usuario : " + this.idUser + "\n" +
						 "Nombre: " + this.userName + "\n" +
						 "Su correo: " + this.email + "\n" +
						 "Su edad: " + this.age + "\n" +
						 "Su sexo: " + this.sex + "\n" +
						 "La contraseña de su cuenta: " +this.password + "\n" +
						 "***Características físicas del usuario*** \n" +
						 "Su estatura: " + this.height + " m\n" +
						 "Su peso: " + this.weight + " kg\n" +
						 "Su IMC: " + this.imc + "\n" +
						 "La frecuencia: " + this.frecuency;
		return infoUser;
	}

}
