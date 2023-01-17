package atividadeH03;

public class TestaProduto {
    public static void main(String[] args) {

        Jogos games = new Jogos(1,"Super Mario world", 1990, "Plataforma", "Nintendo");
        Jogos games2 = new Jogos(2, "God of war - Ragnarok", 2022, "Aventura", "Sony");

        Console console = new Console(3,"Play Station 5", 2021, "Sony", false);
        Console xbox = new Console(4, "Xbox serie X", 2020, "Microsoft", false);

        games.visualizar();
        games2.visualizar();
        console.visualizar();
        xbox.visualizar();

    }
}
