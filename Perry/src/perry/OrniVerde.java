package perry;

import java.util.Scanner;

public class OrniVerde extends papaCastor implements mamaPata {

    private final String pico;

    @Override
    public String toString() {
        return "OrniVerde{" + "pico=" + pico + ", patas=" + patas + '}';
    }

    private final String patas;

    public OrniVerde(String pico, String patas, Double longitudCola, Double velocidadNado) {
        super(longitudCola, velocidadNado);
        this.pico = pico;
        this.patas = patas;
    }

}
