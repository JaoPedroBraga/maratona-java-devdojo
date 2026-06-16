package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valTotal = 30000;
        for (int i = 1; i <= valTotal; i++) {
            double valorParts = valTotal / i;
            if(valorParts >= 1000){
                System.out.println(i+" parcelas de R$: "+valorParts);
            }else{break;}
        }
    }
}
