
import java.util.*;
public class AnalysisMain {
	public static void main(String[] args) {
		
		Introduction.introductionStatements();
		// Constants
		double resistanceByBoltBearing = 1.25;
		double resistanceByUltStress= 1.25;
		
		// Accepting values
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the diameter of the bolt");
		double boltDiameter = sc.nextDouble();
		
		System.out.println("Enter the diameter of the bolt hole");
		double boltHoleDiameter = sc.nextDouble();
		
		double pitch = PitchDistance.calculation(boltDiameter);
		System.out.println("Enter the suitable pitch distance(if calculated pitch is ): " + pitch + " => ");
		pitch =  sc.nextDouble();
		
		System.out.println("Enter the type of cut : ");
		String cutType = sc.next();
		
		double edge = EdgeDistance.calculation(boltHoleDiameter, cutType);
		System.out.println("Enter the suitable pitch distance(if calculated edge distance is ): " + edge + " => ");
		edge =  sc.nextDouble();
		
		System.out.println("Enter the number of planes : ");
		int numberOfPlanes = sc.nextInt();
		
		System.out.println("Enter the ultimate tensile stress (bolts) :");
		double ultTensileStress = sc.nextDouble();
		
		System.out.println("Enter the ultimate tensile stress (plate) :");
		double ultTensileStressOfPlate = sc.nextDouble();
		
		System.out.println("Enter the thickness of plate :");
		double thicknessOfPlate = sc.nextDouble();
		
		System.out.println("Enter the breadth of plate :");
		double breadthOfPlate = sc.nextDouble();
		
		System.out.println("Enter the number of bolts in a row :");
		double noOfBoltsInARow = sc.nextDouble();
		
		System.out.println("Enter the total number of bolts :");
		double N = sc.nextDouble();
		
		//Analysis of bolted connections
		double shearCapacityOfBolts = N * DesignShearingCapacityOfBolts.calculation(ultTensileStress,resistanceByBoltBearing,numberOfPlanes,boltDiameter);
		System.out.println("Shear Capacity Of Bolt Is : " + shearCapacityOfBolts/1000 + " kN");		
		
		double bearingCapacityOfBolts =N * DesignBearingCapacityOfBolts.calculation(boltDiameter,thicknessOfPlate,ultTensileStressOfPlate,pitch,ultTensileStress,boltHoleDiameter,resistanceByBoltBearing,edge);
		System.out.println("Bearing Capacity Of Bolt Is : " + bearingCapacityOfBolts/1000 + " kN");
		
		double StrenghtDueToRuptureOfCriticalSection = DesignStrenghtDueToRuptureOfCriticalSection.calculation(resistanceByUltStress,ultTensileStressOfPlate,boltHoleDiameter,breadthOfPlate,thicknessOfPlate,noOfBoltsInARow);
		System.out.println("Strenght Due To Rupture Is : " + StrenghtDueToRuptureOfCriticalSection/1000 + " kN");
		
		double designShearStrenght = DesignShearStrenghtOfJoint.calculation(shearCapacityOfBolts,bearingCapacityOfBolts,StrenghtDueToRuptureOfCriticalSection);
		System.out.println("The Design Shear Strenght Of The Joint Is :" + designShearStrenght/1000 + " kN");
		sc.close();
	}
}
