package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){

        double number1 = 10;
        double number2 = 20;
        double number3 = 15;

        double sum = number1+number2;
        double subtraction = number1-number2;
        double division = number1/number2;
        double multiplication = number1*number2;
        System.out.println("Soma: "+sum);
        System.out.println("Subtração: "+subtraction);
        System.out.println("Divisão: "+division);
        System.out.println("Multiplicação: "+multiplication);

        //Resto

        double rest1 = number1 % 2;
        double rest2 = number2 % 2;
        double rest3 = number3 % 2;

        System.out.println("Resto 1:"+rest1);
        System.out.println("Resto 2:"+rest2);
        System.out.println("Resto 3:"+rest3);

        // < =< ou > =>

        boolean number1IsBiggerNumber2 = number1 > number2;
        System.out.println(number1+" é maior que "+number2+"?:"+number1IsBiggerNumber2);

        boolean number1IsSmallerNumber3 = number1 < number3;
        System.out.println(number1+" é menor que "+number3+"?:"+number1IsSmallerNumber3);

        // == ou !=

        boolean number1IsEqualNumber2 = number1 == number2;
        System.out.println(number1+" é igual a "+number2+"?:"+number1IsEqualNumber2);

        boolean number1IsDifferentNumber3 = number1 != number3;
        System.out.println(number1+" é diferente de "+number3+"?:"+number1IsDifferentNumber3);


        // AND = && , OR = || (shift+\), NOT = !

        int age = 21;
        double payment = 2400.5;
        boolean card = false;
        boolean legality = (age>=18 && payment>=1600) || (card == true);
        System.out.println("Legalidade: "+legality);

        float pc = 5000.00F;
        double accountBank1 = 2010.6;
        double accountBank2 = 7005.9;
        boolean buy = (accountBank1>pc) || (accountBank2>pc);
        System.out.println("Irei comprar?: "+buy);

        // += -= *= /=
        payment = payment+2000.0;
        payment -=2000.0;
        System.out.println(payment);



    }
}
