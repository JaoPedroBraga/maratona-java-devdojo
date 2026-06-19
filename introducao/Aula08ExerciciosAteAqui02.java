package academy.devdojo.maratonajava.introducao;

public class Aula08ExerciciosAteAqui02 {
    public static void main(String[] args) {
        /*crie a seguinte matriz:
                1 2 3
                4 5 6
                7 8 9
        Depois imprima todos os elementos usando dois for.*/
        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println();

        }

    }
}
