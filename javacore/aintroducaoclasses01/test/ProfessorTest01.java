package academy.devdojo.maratonajava.javacore.aintroducaoclasses01.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses01.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor teacher = new Professor();
        teacher.name = "Mestre kame";
        teacher.age = 75;
        teacher.sex = 'M';
        System.out.println("Nome: "+teacher.name+" Idade: "+teacher.age+" Sexo: "+teacher.sex);

    }
}
