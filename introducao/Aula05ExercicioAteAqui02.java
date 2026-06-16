package academy.devdojo.maratonajava.introducao;

/*

Crie um programa para aprovar um empréstimo:

Regras:

Idade mínima: 18 anos.
Salário mínimo: R$ 2500.
Não possuir restrição no nome.
Se aprovado:
salário ≥ 5000 → "Empréstimo Premium"
salário entre 2500 e 4999 → "Empréstimo Padrão"
Se reprovado:
"Empréstimo negado"

Tente resolver usando if/else if/else (sem operador ternário desta vez).

 */
public class Aula05ExercicioAteAqui02 {
    public static void main(String[] args) {
        int age = 20;
        double payment = 3000.00;
        boolean restrition = false;
        if(age>=18 && payment >=2500 && restrition ==false){

            if(payment>=5000){
                System.out.println("Empréstimo Premium");
            }else{System.out.println("Empréstimo Padrão");}

        }else{System.out.println("Empréstimo negado");}

    }
}

