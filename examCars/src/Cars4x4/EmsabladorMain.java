package Cars4x4;

import Relaciones.Relacion;
import Relaciones.relaciones47;
import Relaciones.relaciones49;
import Suspension.Suspension;
import Suspension.suspensionARB;
import Suspension.suspensionTJM;
import motor.Motor;
import motor.motor5000cc;
import motor.motor6000cc;

public class EmsabladorMain {

	public static void main(String[] args) {
		new CarroDiesel(createMotorFactory(MotorType.CINCOMILcc), createRelacionFactory(RelacionType.CUARENTAYSIETE), createSuspensionFactory(SuspensionType.ARB)).tipoCarroOffRoad(); 
		new CarroDiesel(createMotorFactory(MotorType.SEISMILcc), createRelacionFactory(RelacionType.CUARENTAYNUEVE), createSuspensionFactory(SuspensionType.TJM)).tipoCarroOffRoad(); 
		
		
		new CarroGasolina(createMotorFactory(MotorType.CINCOMILcc), createRelacionFactory(RelacionType.CUARENTAYSIETE), createSuspensionFactory(SuspensionType.ARB)).tipoCarroOffRoad(); 
		new CarroGasolina(createMotorFactory(MotorType.SEISMILcc), createRelacionFactory(RelacionType.CUARENTAYNUEVE), createSuspensionFactory(SuspensionType.TJM)).tipoCarroOffRoad(); 
		
	}
	
	private enum MotorType {
		CINCOMILcc,
		SEISMILcc
	}
	
	private static Motor createMotorFactory(MotorType type) {
		  if (type.equals(MotorType.CINCOMILcc)) {
			  return new motor5000cc();
		  }
		  return new motor6000cc(); 
		}
	
	private enum RelacionType {
		CUARENTAYSIETE,
		CUARENTAYNUEVE
	}
	
	private static Relacion createRelacionFactory(RelacionType type) {
		  if (type.equals(RelacionType.CUARENTAYSIETE)) {
			  return new relaciones47();
		  }
		  return new relaciones49(); 
		}
	
	private enum SuspensionType {
		ARB,
		TJM
	}
	
	private static Suspension createSuspensionFactory(SuspensionType type) {
		  if (type.equals(SuspensionType.ARB)) {
			  return new suspensionARB();
		  }
		  return new suspensionTJM(); 
		}
	
}
