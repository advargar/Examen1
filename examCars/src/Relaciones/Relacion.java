package Relaciones;

import carInterface.IRelacionesDiferenciales;

public abstract class Relacion implements IRelacionesDiferenciales{
	//Inmutabilidad
			public final void print() {
			  System.out.println(tipo());
			}
}
