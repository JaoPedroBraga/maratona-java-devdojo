package academy.devdojo.maratonajava.javacore.aintroducaoclasses01.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses01.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        car1.name = "Fusca";
        car1.year = 1969;
        car1.model = "Sport";
        Carro car2 = new Carro();
        car2.name = "Mustang";
        car2.year = 1968;
        car2.model = "GT500";
        System.out.println("Carro 1 "+car1.name+" "+car1.model+" "+car1.year);
        System.out.println("Carro 2 "+car2.name+" "+car2.model+" "+car2.year);

    }
}
