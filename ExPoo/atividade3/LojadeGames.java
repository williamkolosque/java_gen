package atividade3;

public class LojadeGames {
    public static void main(String[] args) {

        Produto produto = new Produto(1,"Super mario world","Aventura","Nintendo", 1990);
        Produto produto2 = new Produto(2,"Street Fighter","Luta","Nintendo", 1987);

        produto.visualizar();
        produto2.visualizar();
    }
}
