package academy.devdojo.maratonajava.introducao;

public class Aula08ExerciciosAteAqui {
    public static void main(String[] args) {
        //Utilizando um for, calcule a soma de todos os elementos.
        int[] numbers = {10, 20, 30, 40, 50};
        /*
        int sum = 0;
        int cont = 1;
        int bigValor = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Número "+cont+" é: "+numbers[i]);
            cont++;
            if(bigValor<numbers[i]){bigValor = numbers[i];}
        }
        System.out.println("A soma é "+sum);
        System.out.println("O maior valor é: "+bigValor);
        */
        //utilizando foreach
        int sum = 0;
        int cont = 1;
        int bigValor = numbers[0];
        for(int number: numbers){
            System.out.println("O número "+cont+" é: "+number);
            cont++;
            sum +=number;
            if(bigValor<number){bigValor = number;}
        }
        System.out.println("A soma é "+sum);
        System.out.println("O maior valor é: "+bigValor);
    }
}
