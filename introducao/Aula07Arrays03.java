package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        int[] numbers2 = {1,3,5,7};
        int[] numbers3 = new int[]{0,2,4,6};

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);

        }
        for(int i:numbers2){
            System.out.println(i);
        }
    }
}
