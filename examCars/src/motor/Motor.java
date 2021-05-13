package motor;

import carInterface.IMotor;

public abstract class Motor implements IMotor {
	//Inmutabilidad
		public final void print() {
		  System.out.println(tipo());
		}
}
