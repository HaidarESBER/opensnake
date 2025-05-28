import java.util.ArrayList;

public class Player{

    public int score ;
    public int level ;
    public int highScore ;
    public int timestamp;

    public Player(int score, int level, int highScore, int timestamp){
        this.score = score ;
        this.level = level ;
        this.highScore = highScore ;
        this.timestamp = timestamp ;

    }

    //getters et setters

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getHighScore() { return highScore; }
    public void setHighScore(int highScore) { this.highScore = highScore; }

    public int getTimestamp() { return timestamp; }
    public void setTimestamp(int timestamp) { this.timestamp = timestamp; }
}


public class configManager {

    public String gameTitle = "snake game";
    public int score = 0;
    public int level = 1;
    public int highScore = 0;
    public boolean isRunning = false;
    public ArrayList<Player> players = new ArrayList<>();
    private int currentPlayerIndex = 0;

    public void getGameTitle(String gameTitle) {
        this. gameTitle= gameTitle;
    }



//static
    public static configManager instance;

    public static configManager singleton(){

        if(instance == null){
            instance = new configManager();
        }
        return instance;
    }

    // Accès et gestion des joueurs
    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    public void setCurrentPlayerIndex(int index) {
        if (index >= 0 && index < players.size()) {
            currentPlayerIndex = index;
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    // Contrôle du jeu
    public void startGame() {
        isRunning = true;
        getCurrentPlayer().setScore(0);
    }

    public void stopGame() {
        isRunning = false;
        Player p = getCurrentPlayer();
        if (p.getScore() > p.getHighScore()) {
            p.setHighScore(p.getScore());
        }
    }

    public void resetGame() {
        getCurrentPlayer().setScore(0);
        isRunning = false;
    }

    public int addScore(int score) {
        Player p = getCurrentPlayer();
        int newScore = p.getScore() + score;
        p.setScore(newScore);
        return newScore;
    }

    public void resetScore() {
        getCurrentPlayer().setScore(0);
    }

    // Getters / Setters
    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getScore() {
        return getCurrentPlayer().getScore();
    }

    public int getHighScore() {
        return getCurrentPlayer().getHighScore();
    }

    public int getLevel() {
        return getCurrentPlayer().getLevel();
    }

    public void setLevel(int level) {
        getCurrentPlayer().setLevel(level);
    }



}
