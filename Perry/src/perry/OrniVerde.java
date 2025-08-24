package perry;

import java.util.Scanner;

public class OrniVerde extends PapaCastor implements mamaPata {

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
  @Override
    public String getPico() {
        return this.pico;
    }

    @Override
    public String getPatas() {
        return this.patas;
    }
    
    
    
    @Override
    public void tocarOrgano() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" toca el organo: Do-Re-Mi (Apreta Enter) ");
        leer.hasNextLine();
        System.out.println("Fa-Sol-La-Si");

    }

    public void tocarGuitorgan() {
        System.out.println("Esta tocando el Guitorgan ");
        super.tocarGuitarra();
        this.tocarOrgano();
    
}
}