package perry;

import java.util.Random;


public class papaCastor {

    private Double longitudCola;
    private Double velocidadNado;

    public papaCastor(Double longitudCola, Double velocidadNado) {
        this.longitudCola = longitudCola;
        this.velocidadNado = velocidadNado;
    }



    public double getNadar() {
        return velocidadNado;
    }

    public void tocarGuitarra() {
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int cuerda = r.nextInt(6) + 1;
            System.out.println("toca cuerda " + cuerda);
    }
    }
}
