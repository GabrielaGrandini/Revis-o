//5. Leia a idade de uma pessoa e informe se ela é maior ou menor de idade.
import java.util.Scanner;

public class revisao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int idade;

        System.out.println("Informe a sua idade: ");
        idade = ler.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
}
