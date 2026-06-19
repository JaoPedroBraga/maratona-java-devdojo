package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidirecionais02 {
    public static void main(String[] args) {
        int[][] month = new int[3][3];
        month[0][0] = 31;
        month[0][1] = 28;
        month[0][2] = 31;

        month[1][0] = 30;
        month[1][1] = 31;
        month[1][2] = 30;

        month[2][0] = 31;
        month[2][1] = 31;
        month[2][2] = 30;

        for (int i = 0; i < month.length; i++) {
            for (int j = 0; j < month[i].length; j++) {
                System.out.println(month[i][j]);

            }
        }

        for(int[] arrBase:month){
            for(int i: arrBase){
                System.out.println(i);
            }
        }

    }
}
