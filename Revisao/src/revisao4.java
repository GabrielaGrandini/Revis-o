//4. Leia um número inteiro e informe se ele é positivo ou negativo.

import java.util.Scanner;

public class revisao4 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int num1;

        System.out.println("Informe um número: ");
        num1 = ler.nextInt ();

        if (num1 > 0) {
            System.out.println("O número " + num1 + " é positivo!");
        } else if (num1 < 0) {
                System.out.println("O número " + num1 + " é negativo!");
            } else {
                System.out.println("O número 4" + num1 + "é nulo.");
            }
        }

}
