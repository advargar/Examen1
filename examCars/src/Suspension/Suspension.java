package Suspension;

import carInterface.ISuspension;

public abstract class Suspension implements ISuspension{
	//Inmutabilidad
	public final void print() {
	  System.out.println(tipo());
	}
}
