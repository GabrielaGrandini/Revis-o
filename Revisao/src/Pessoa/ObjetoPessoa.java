package Pessoa;
/******************************************************************************
11. Crie uma classe chamada Pessoa com os atributos nome e idade.
12. Crie um objeto da classe Pessoa e mostre os valores dos atributos.
13. Crie os métodos get e set para os atributos da classe Pessoa.
14. Crie um metodo que mostre uma mensagem de apresentaçao da pessoa.
 *******************************************************************************/
import java.util.Scanner;
public class ObjetoPessoa {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        Pessoa pessoa = new Pessoa ();

        for (int i = 1; i <= 1; i++){
            System.out.println("Informe os seus dados:");
            System.out.print("Nome:");
            pessoa.setNome(ler.nextLine());
            System.out.print("Idade: ");
            pessoa.setIdade(ler.nextInt());

            ler.nextLine();

            System.out.println("Olá! Esta pessoa é: ");
            System.out.print(pessoa.getNome());
            System.out.print(" e possui " +pessoa.getIdade() + " anos!");
        }
    }
}
