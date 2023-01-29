/** 
 * Esta clase es el funcionamiento de una cuenta bancaria
 * @author svrau
 * @version 15
 * @since 28/01/2023
 * */

/**
 * clase cuenta 
 */

package cuentas;
public class CCuenta {

	/**
	 * Atributos de la clase 
	 */
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    public CCuenta()
    {
    }
    /**
     * construrtor de los parametros
     * @param nom String
     * @param cue String
     * @param sal double
     * @param tipo double 
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /** 
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }
/** 
 * 
 * @param cantidad a ingresar en la cuenta 
 * @throws Exception devuelve en caso de que sea cantidad negaiva
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * 
 * @param cantidad a retirar de la ceunta
 * @throws Exception devuelve en caso de que se un numero superior al saldo cuenta > saldo
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
/**
 * @return  devuelve  nombre 
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre pasarlo como parametro 
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return devuelve  cuenta
 */
public String getCuenta() {
	return cuenta;
}
/**
 * @param cuenta pasarlo como parametro
 */
public void setCuenta(String cuenta) {
	this.cuenta = cuenta;
}
/**
 * @return devuelve saldo
 */
public double getSaldo() {
	return saldo;
}
/**
 * @param saldo pasarlo como parametro
 */
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
/**
 * @return devuelve tipoInteres
 */
public double getTipoInteres() {
	return tipoInteres;
}
/**
 * @param tipoInteres pasarlo como parametro
 */
public void setTipoInteres(double tipoInteres) {
	this.tipoInteres = tipoInteres;
}
   
}
	


