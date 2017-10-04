
public class Principal {
    /**
     * Kevin Ortiz
     */
    public static void main(String[] args) {
        //ARREGLO DE 2 DIMENSIONES DE 1O X 10
        int[][] Arre = new int[10][10];
        for (int i = 0; i < Arre.length; i++) {
            for (int j = 0; j < Arre.length; j++) {
                if (i == j) { // SI SON IGUALES EL VALOR EN ESA POSICION ES 1
                    Arre[i][j] = 1;
                } else { //SI SON DIFERENTES EL VALOR SERA DE CERO
                    Arre[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < Arre.length; i++) { //FOR PARA RECORRER FILAS
            for (int j = 0; j < Arre.length; j++) { //FOR PARA RECORRER COLUMNAS
                System.out.print("[" + Arre[i][j] + "] ");
            }
            System.out.println(""); //POR ESTETICA SE AGREGA UN SALTO DE LINEA PARA VER LA FORMA DE LA MATRIZ 

        }

    }
}
