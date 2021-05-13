package Cars4x4;

import carInterface.IMotor;
import carInterface.IRelacionesDiferenciales;
import carInterface.ISuspension;

public class CarroGasolina extends Car{
	
    private final IMotor motor;
	
	private final IRelacionesDiferenciales relacion;
	
	private final ISuspension suspension;
	
	//Inyeccion de dependencia
	public CarroGasolina(IMotor motor, IRelacionesDiferenciales relacion, ISuspension suspension) {
		
		this.motor = motor;
		this.relacion = relacion;
		this.suspension = suspension;
		
	}
	
	public String tipoCarroOffRoad() {
		System.out.println("\nCarro de Gasolina");
		System.out.println("Motor tipo: " + motor.tipo());
		System.out.println("Relaciones diferenciales tipo: " + relacion.tipo());
		System.out.println("Suspension tipo: " + suspension.tipo());
		System.out.println("- - - - - - - - - - - - - - - --  - - -- -  - - -- - - - -\n");
		return "Carro de Gasolina";
	}
}
