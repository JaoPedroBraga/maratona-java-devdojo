package academy.devdojo.maratonajava.introducao;

public class Aula08ExerciciosAteAqui03 {
    /*
    Crie um metodo

    public static int somaArray(int[] numeros)

    Ele deve retornar a soma de todos os elementos do array.
    */
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(sumArray(numbers));

    }
    public static int sumArray(int[] numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;

    }
}
