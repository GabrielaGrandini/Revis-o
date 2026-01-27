//7. Leia um número inteiro e mostre a tabuada desse número.
import java.util.Scanner;

public class revisao7 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        int num;

        System.out.println("Informe um número: ");
        num = ler.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " x " + num + " = " + i*num);
        }
    }
}
