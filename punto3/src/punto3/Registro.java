package punto3;

import java.util.ArrayList;

public class Registro {

	ArrayList<Socios> asistencia;
	int cupo;
	Clase Clase;
	int descuento;
	String pago;
	
	public Registro(ArrayList<Socios> asistencia, int cupo, Clase clase,
			int descuento, String pago) {
		this.asistencia = asistencia;
		this.cupo = cupo;
		Clase = clase;
		this.descuento = descuento;
		this.pago = pago;
	}


	
}
