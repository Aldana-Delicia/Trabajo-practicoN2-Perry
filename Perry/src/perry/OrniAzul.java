package perry;

import java.util.Scanner;

public class OrniAzul extends papaCastor {

    private double propulsion;

    // Constructor
    public OrniAzul(Double longitudCola, Double velocidadNado) {
        super(longitudCola, velocidadNado);

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nivel de propulsión (5 a 10 km/s): ");
        this.propulsion = sc.nextDouble();
    }

    
    public void nadar() {
        double total = getNadar() + propulsion;
        System.out.println("Nada con propulsión a " + total + " km/h.");
    }

    
    public double getPropulsion() {
        return propulsion;
    }

    @Override
    public String toString() {
        return "OrniAzul{propulsion=" + propulsion + ", velocidadBase=" + getNadar() + "}";
    }
}
