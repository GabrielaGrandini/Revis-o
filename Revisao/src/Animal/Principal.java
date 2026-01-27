package Animal;

public class Principal {
    public static void main(String[] args){
        System.out.println("Cachorro");
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Max";
        System.out.println(cachorro.nome + " é um cachorro. Logo, ");
        cachorro.fazerSom();



        System.out.println("\nGato");
        Gato gato = new Gato();
        gato.nome = "Bellatrix";
        System.out.println(gato.nome + " é uma gata. Logo, ");
        gato.fazerSom();
    }
}
