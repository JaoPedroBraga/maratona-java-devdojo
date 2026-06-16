package academy.devdojo.maratonajava.introducao;
/*
Próximo desafio (nível entrevista de estágio)

Faça um programa que receba:

double nota1 = 8.5;
double nota2 = 6.0;
double nota3 = 7.5;

Calcule a média e exiba:

Média ≥ 7 → "Aprovado"
Média ≥ 5 e < 7 → "Recuperação"
Média < 5 → "Reprovado"

Desafio extra: mostre também a média calculada.

Exemplo:

Média: 7.33
Situação: Aprovado
*/

public class Aula05ExercicioAteAqui03 {
    public static void main(String[] args) {
        double score1 = 8.5;
        double score2 = 6.0;
        double score3 = 7.5;
        double average;
        average = (score1 + score2+ score3)/3;
        System.out.println("Sua média é: "+average);
        if(average>=7){
            System.out.println("Aprovado");
        }else if(average<5){
            System.out.println("Reprovado");
        } else{
            System.out.println("Recuperação");
        }

    }
}
