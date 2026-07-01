package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculate = new Calculadora();
        double number1 = 10;
        double number2 = 10;

        double sum = calculate.sumTwoNumbers(number1,number2);
        System.out.println("Soma: "+sum);

        double sub = calculate.subTwoNumbers(number1,number2);
        System.out.println("Subtração: "+sub);

        double multi = calculate.multiTwoNumbers(number1,number2);
        System.out.println("Multiplicação: "+multi);

        double div = calculate.divTwoNumbers(number1,number2);
        System.out.println("Divisão: "+div);
    }
}
