package academy.devdojo.maratonajava.introducao;

public class Aula08ExerciciosAteAqui04 {
    /*
    Crie um metodo que receba um array e retorne quantos números pares existem nele
    */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(contPairs(numbers));
    }
    public static int contPairs(int[] numbers){
        int cont = 0;
        for(int number : numbers){
            if(number%2 ==0){cont++;}
        }
        return cont;

    }
}
