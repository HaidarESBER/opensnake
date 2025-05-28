
public class Main {
    public static void main(String[] args) {

        ConfigManager config = ConfigManager.getInstance();


        Player p1 = new Player(0, 1, 50, 1716900000);
        Player p2 = new Player(0, 1, 80, 1716900050);


        config.addPlayer(p1);
        config.addPlayer(p2);


        config.setCurrentPlayerIndex(0);
        config.startGame();
        config.addScore(30);
        config.addScore(25); // total = 55
        config.stopGame();


        System.out.println("Player 1 stats:");
        System.out.println("Score: " + config.getScore());
        System.out.println("High Score: " + config.getHighScore());
        System.out.println("Level: " + config.getLevel());

        config.setCurrentPlayerIndex(1);
        config.startGame();
        config.addScore(90);
        config.stopGame();


        System.out.println("\nPlayer 2 stats:");
        System.out.println("Score: " + config.getScore());
        System.out.println("High Score: " + config.getHighScore());
        System.out.println("Level: " + config.getLevel());


        System.out.println("\nHistorique des joueurs :");
        for (int i = 0; i < config.getPlayers().size(); i++) {
            Player p = config.getPlayers().get(i);
            System.out.println("Player " + (i + 1) + " -> Score: " + p.getScore() +
                    ", HighScore: " + p.getHighScore() +
                    ", Level: " + p.getLevel());
        }
    }
}
