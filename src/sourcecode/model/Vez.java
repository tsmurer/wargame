package sourcecode.model;

import java.io.IOException;

public class Vez {

    public Vez(){
    }

    public void novaVez(Jogador jogador) throws IOException {
        System.out.println("Vez do jogador " + jogador.getCor());
        jogador.receber();
        jogador.alocar();
        jogador.atacar();
        jogador.deslocar();

    }
}
