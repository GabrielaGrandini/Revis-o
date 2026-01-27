//8. Leia 5 números inteiros e calcule a média deles.
import java.util.Scanner;

public class revisao8 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        double valor = 0, nota, media;

        for(int i = 1; i <=5; i++) {
            System.out.println("Informe a "+ i + "º nota: ");
            nota = ler.nextInt();

            valor = valor + nota;
            media = valor/5;

            System.out.println("A média das notas é: " + media);
        }

    }
}
