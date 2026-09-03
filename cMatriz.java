import java.util.*;

public class cMatriz {
    private int matriz [][];

    public cMatriz (int n){
        matriz = new int [n][n];
    }

    public void generaMatPocoDensa(){
        int n = matriz.length;
        matriz = new int [n][n];
        int valor,fila,columna;
        int cantValores = (n*n)/2-1;
        for (int i = 1; i <= cantValores; i++){
            valor = (int)(Math.random()*(50-1+1)+1);
            fila = (int)(Math.random()*((n - 1) +1)+0);
            columna = (int)(Math.random()*((n - 1) +1)+0);
            matriz[fila][columna] = valor;

        }
    }

    public void generarMatEscalar(){
        Random rd = new Random();
        int n = matriz.length;
        matriz = new int [n][n];
        int valor = rd.nextInt(10);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ( i == j){
                    matriz [i][j] = valor;
                }
            }
        }
    }

    public void mostrarMatriz (){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length ; j++) {

                int valor = matriz[i][j];
                System.out.print(valor + "   ");
            }
            System.out.println(" ");
        }
    }
}
