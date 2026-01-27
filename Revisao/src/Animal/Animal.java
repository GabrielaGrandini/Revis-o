package Animal;
/***15. Crie uma classe Animal com o atributo nome e o metodo fazerSom().
16. Crie uma classe Cachorro que herde da classe Animal.
17. Sobrescreva o metodo fazerSom() na classe Cachorro para mostrar a mensagem "O cachorro late".
18. Crie uma classe Gato que herde da classe Animal.
19. Utilize polimorfismo para chamar o metodo fazerSom() de um objeto Cachorro e de um objeto Gato.**/

public class Animal {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println("som");
    }

}
