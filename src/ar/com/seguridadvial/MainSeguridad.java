package ar.com.seguridadvial;
import java.util.Scanner;
public class MainSeguridad {

	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese los datos del conductor:");
	        System.out.print("¿Tiene registro de conducir? (true/false): ");
	        boolean tieneRegistro = scanner.nextBoolean();

	        System.out.println("Ingrese los datos del vehículo:");
	        System.out.print("¿Es un auto? (true/false): ");
	        boolean esAuto = scanner.nextBoolean();

	        if (esAuto) {
	            System.out.print("Velocidad del auto (Km/hr): ");
	            double velocidadAuto = scanner.nextDouble();
	            System.out.print("¿Tiene rueda de auxilio? (true/false): ");
	            boolean tieneRuedaAuxilio = scanner.nextBoolean();

	            Vehiculo vehiculo = new Auto(velocidadAuto, tieneRuedaAuxilio);
	            Conductor conductor = new Conductor(tieneRegistro, vehiculo);

	            if (conductor.esSeguroConductor()) {
	                System.out.println("El conductor es seguro.");
	            } else {
	                System.out.println("El conductor no es seguro.");
	            }
	        } else {
	            System.out.print("Velocidad de la moto (Km/hr): ");
	            double velocidadMoto = scanner.nextDouble();
	            System.out.print("Cantidad de espejos retrovisores de la moto: ");
	            int cantidadEspejosRetrovisores = scanner.nextInt();

	            Vehiculo vehiculo = new Moto(velocidadMoto, cantidadEspejosRetrovisores);
	            Conductor conductor = new Conductor(tieneRegistro, vehiculo);

	            if (conductor.esSeguroConductor()) {
	                System.out.println("El conductor es seguro.");
	            } else {
	                System.out.println("El conductor no es seguro.");
	            }
	        }

	        scanner.close();
	    }
	}

