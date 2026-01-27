//Leia dois números inteiros e mostre a soma entre eles.

import java.util.Scanner;
public class revisao3 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int num1, num2, soma;

        System.out.println("Informe um número: ");
        num1 = ler.nextInt();

        System.out.println("Informe um segundo número: ");
        num2 = ler.nextInt();

        soma = num1 + num2;

        System.out.println("A soma dos números é: " +soma);
    }
}
