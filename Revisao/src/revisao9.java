//9. Leia um número inteiro e informe se ele é par ou ímpar.
import java.util.Scanner;

public class revisao9 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        int num;

        System.out.println("Informe um número: ");
        num = ler.nextInt();

        if (num%2 == 0){
            System.out.println("Seu número é par!");
        } else {
            System.out.println("Seu número é ímpar!");
        }
    }
}
