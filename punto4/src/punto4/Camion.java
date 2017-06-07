package punto4;

public class Camion extends Vehiculo { //Herencia hija
	// Creamos un constructor
	public Camion(){
	this.marca = "Ford";
	this.asientos = 4;
	this.color = "Azul";
	}
	public Camion(String marca){ //Polimorfismo
		this.marca  = marca;
		this.asientos = 4;
		this.color = "Azul";
	}
}
