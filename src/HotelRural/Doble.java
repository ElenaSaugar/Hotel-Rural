package HotelRural;

/**
 * @author Elena
 *
 */
public class Doble extends Habitaciones{

	boolean minibar;
	
	/**
	 * metodo para que calcule los descuentos
	 */
	public void calculoDescuentos() {
		
	}

	/**sirve para que te devuelva el valor de minibar
	 * @return minibar,devuelve el valor de minibar
	 */
	public boolean isMinibar() {
		return minibar;
	}

	/**setter para establecer el valor de minibar
	 * @param minibar establece el valor de minibar
	 */
	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}
}
