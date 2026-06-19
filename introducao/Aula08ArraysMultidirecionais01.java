package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidirecionais01 {
    public static void main(String[] args) {
        //meses
        //numeros de dias
        int[][] month = new int[12][1];
        month[0][0] = 31;
        month[1][0] = 28;
        month[2][0] = 31;
        month[3][0] = 30;
        month[4][0] = 31;
        month[5][0] = 30;
        month[6][0] = 31;
        month[7][0] = 31;
        month[8][0] = 30;
        month[9][0] = 31;
        month[10][0] = 30;
        month[11][0] = 31;
        for (int i = 0; i < month.length; i++) {
            int monthN = i + 1;
            System.out.println("Mês "+monthN+" tem "+month[i][0]+" dias.");

        }


    }
}
