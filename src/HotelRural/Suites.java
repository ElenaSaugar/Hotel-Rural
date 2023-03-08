package HotelRural;

/**
 * @author Elena
 *
 */
public class Suites extends Habitaciones {

	double metros;
	String servicios;
	
	/**metodo para calcular los gastos de la suite
	 * @param calcular los gatos de la habitacion 
	 */
	public void calculoGastos() {
		
	}

	/**sirve para que te devuelva el valor de metros
	 * @return devuelve el valor de metros
	 */
	public double getMetros() {
		return metros;
	}

	/** setter para establecer el valor de metros
	 * @param metros establece el valor de los metros
	 */
	public void setMetros(double metros) {
		this.metros = metros;
	}

	/** sirve para que te devuelva el valor de servicios
	 * @return servicios, devuelve el valor de servicios
	 */
	public String getServicios() {
		return servicios;
	}

	/**setter para establecer el valor de servicios
	 * @param servicios, establece el valor de servicios
	 */
	public void setServicios(String servicios) {
		this.servicios = servicios;
	}
}
