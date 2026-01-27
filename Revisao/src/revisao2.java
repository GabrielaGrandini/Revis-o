//2. Leia um número inteiro e mostre o dobro desse número.

import java.util.Scanner;

public class revisao2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num, dobro;

        System.out.println("Digite um número:");
        num =  ler.nextInt();

        dobro = num * 2;

        System.out.println("O dobro de " + num + " é: " +dobro);
    }
}
