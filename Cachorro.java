package Aula11;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + " latiu a noite ");
    }

    public void correr(){
        System.out.println(getNome() + " correu atrás do gato");
    }
}
