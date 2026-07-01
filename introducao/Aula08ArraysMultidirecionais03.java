package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidirecionais03 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];
        arrayInt[0] = new int[]{1,2};
        arrayInt[1] = new int[]{3,4,5,6};
        arrayInt[2] = new int[]{7,8,9,10,11,12};

        for (int[] arrayBase: arrayInt) {
            System.out.println("\n-------");
            for (int number : arrayBase){
                System.out.print(number+" ");
            }
        }
        System.out.println("\n-------");

    }
}

