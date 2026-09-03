import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int valor = rd.nextInt(7)+1;
        cMatriz m1 = new cMatriz(valor );

        m1.generaMatPocoDensa();
        m1.generarMatEscalar();
        m1.mostrarMatriz();

    }
}