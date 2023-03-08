/**
 * 
 */
package HotelRural;

import java.sql.Date;

/**hghgyh
 * @author Mario
 *@version 1.1
 */
public class Reservas {
int numReserva;
Date fechaEntrada;
Date fechaSalida;
int numPersonas;

/**sirve para que te devuelva el valor de numReserva
 * @return devuelve el valor de numReserva
 */
public int getNumReserva() {
	return numReserva;
}
/**sirve para que te devuelva el valor de
 * @param numReserva, devuelve el valor de
 */
public void setNumReserva(int numReserva) {
	this.numReserva = numReserva;
}
/**sirve para que te devuelva el valor de numReserva
 * @return devuelve el valor de numReserva
 */
public Date getFechaEntrada() {
	return fechaEntrada;
}
/**sirve para que te devuelva el valor de fechaEntrada
 * @param fechaEntrada, devuelve el valor de fechaEntrada
 */
public void setFechaEntrada(Date fechaEntrada) {
	this.fechaEntrada = fechaEntrada;
}
/**sirve para que te devuelva el valor de fechaentrada
 * @return devuelve el valor de fechasalida
 */
public Date getFechaSalida() {
	return fechaSalida;
}
/**sirve para que te devuelva el valor de fechaSalida
 * @param fechaSalida, devuelve el valor de fechaSalida
 */
public void setFechaSalida(Date fechaSalida) {
	this.fechaSalida = fechaSalida;
}
/**sirve para que te devuelva el valor de numPersonas
 * @return numPersonas, devuelve el valor de numPersonas
 */
public int getNumPersonas() {
	return numPersonas;
}
/**sirve para que te devuelva el valor de numPersonas
 * @param numPersonas, devuelve el valor de numPersonas
 */
public void setNumPersonas(int numPersonas) {
	this.numPersonas = numPersonas;
}


}
