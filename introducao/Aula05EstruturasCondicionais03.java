package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double payment = 6000;
        String iDonate = "Eu posso doar";
        String iDontDonate = "Eu ainda não posso doar";
        String result;
        /*if(payment>=5000) {
            System.out.println(iDonate);
        }else{System.out.println(iDontDonate);}*/

        result = (payment>=5000) ?iDonate :iDontDonate;
        System.out.println(result);

    }
}
