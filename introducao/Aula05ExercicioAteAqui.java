package academy.devdojo.maratonajava.introducao;

public class Aula05ExercicioAteAqui { /*

Exercício

Crie um programa que avalie se uma pessoa pode receber um benefício.

Regras:

A pessoa deve ter idade maior ou igual a 18 anos.
A renda deve ser menor que R$ 2.000.
A pessoa não pode estar com o nome negativado.

Dados para testar:

int idade = 22;
double renda = 1800;
boolean nomeNegativado = false;

O programa deve exibir:

"Benefício aprovado"
ou "Benefício negado"

Desafio extra:
Utilize:

Pelo menos um operador lógico (&& ou ||)
Um if/else
Um operador ternário para imprimir "Maior de idade" ou "Menor de idade"
    */
    public static void main(String[] args) {
        int age = 22;
        double payment = 1800;
        boolean nameNefatived = false;
        String answer;
        String collect = "Pode receber o beneficio";
        String dontCollect = "Não pode receber beneficio";
        answer = (age>=18 && payment<2000 && nameNefatived !=true) ?collect :dontCollect;
        System.out.println(answer);
    }
}
