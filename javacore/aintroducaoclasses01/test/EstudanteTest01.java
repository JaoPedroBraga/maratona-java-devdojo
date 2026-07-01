package academy.devdojo.maratonajava.javacore.aintroducaoclasses01.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses01.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante student = new Estudante();
        student.name = "João Pedro";
        student.age = 21;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

    }
}
