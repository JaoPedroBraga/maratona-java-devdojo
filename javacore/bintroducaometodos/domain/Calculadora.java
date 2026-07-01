package academy.devdojo.maratonajava.javacore.bintroducaometodos.domain;

public class Calculadora {

    public double sumTwoNumbers(double num1,double num2){
        return (num1+num2);
    }
    public double subTwoNumbers(double num1,double num2){
        return (num1-num2);
    }
    public double multiTwoNumbers(double num1, double num2){
        return (num1*num2);
    }
    public double divTwoNumbers(double num1, double num2){
        if(num2 == 0 ){
            throw new ArithmeticException("Impossível dividir por zero");
        }
        return (num1/num2);
    }
}
