package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double paymentYear = 45000;
        double firstTax = 9.7/100;
        double secondTax = 37.35/100;
        double threeTax = 49.5/100;
        double valorTax;
        if(paymentYear <=34712){
            paymentYear *= firstTax;
        }else if(paymentYear >=34712 && paymentYear <=68507){
            paymentYear *= secondTax;
        }else{paymentYear *= threeTax;}

        System.out.println(paymentYear);

    }
}
