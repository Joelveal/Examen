package examen;

public class Fecha {
	/**
	 * @author JoelVelasco
	 * @verion version1.0
	 */
	public static boolean fechaValida;
	
/**
 * 
 * @param anio "es un parametro para los años"
 * @param mes "es un parametro para los meses del año"
 * @param dia "es un parametro para los dias"
 * @return "devuelve un booleano"
 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}