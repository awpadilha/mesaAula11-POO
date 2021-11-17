package Aula11;

public class Preguica extends Animal{
    public Preguica(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + " abriu a boca");
    }

    public void subirArvores() {
        System.out.println(getNome() + " subiu, mas não saiu do lugar");
    }
}
