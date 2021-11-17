package Aula11;

public class Principal {
    public static void main(String[] args) {
        Cachorro tarzan = new Cachorro("Tarzan", 5);
        tarzan.emitirSom();
        tarzan.correr();

        Cavalo gaucho = new Cavalo("Gaucho", 10);
        gaucho.correr();
        gaucho.emitirSom();

        Preguica soneca = new Preguica("Soneca", 30);
        soneca.subirArvores();
        soneca. emitirSom();
    }
}
