package Pessoa;
//11. Crie uma classe chamada Pessoa com os atributos nome e idade.
//12. Crie um objeto da classe Pessoa e mostre os valores dos atributos.
//13. Crie os métodos get e set para os atributos da classe Pessoa.
public class Pessoa {
    String nome;
    int idade;

    public String getNome(){
        return nome;
    } public void setNome (String nome){
        this.nome= nome;
    } public int getIdade () {
        return idade;
    } public void setIdade (int idade){
        this.idade = idade;
    }
}
