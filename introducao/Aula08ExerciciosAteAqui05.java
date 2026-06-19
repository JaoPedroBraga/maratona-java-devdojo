package academy.devdojo.maratonajava.introducao;

public class Aula08ExerciciosAteAqui05 {
        /*
Crie um sistema de alunos.

String[] alunos = {"João", "Maria", "Pedro"};
double[] notas = {7.5, 8.0, 5.5};

Exiba:

Aluno: João - Nota: 7.5 - Aprovado
Aluno: Maria - Nota: 8.0 - Aprovado
Aluno: Pedro - Nota: 5.5 - Recuperação

Utilize:

Arrays
For
If/Else
Pelo menos um metodo
*/
        public static void main(String[] args) {

            String[] students = {"João", "Maria", "Pedro"};
            double[] notes = {7.5, 8.0, 5.5};

        for (int i = 0; i < students.length; i++) {
            System.out.println("Aluno: "+students[i]+" - Nota: "+notes[i]+" - "+status(notes[i]));

        }
    }
    public static String status(double note){
        if(note>=6){
            return "Aprovado";
        }else{return "Recuperação";}
    }
}
