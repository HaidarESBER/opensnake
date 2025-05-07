public class configManager {
    public String gameTitle = "snake game";
    public int score = 0;
    public int level = 1;
    public int highScore = 0;
    public boolean isRunning = false;


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

    public void startGame(){
        isRunning = true;
        score = 0;
    }

    public void stopGame(){
        isRunning = false;
        if(score > highScore){
            highScore = score;
        }
    }

    public void resetGame(){
        score = 0;
        isRunning = false;
    }

    public int addScore(int score){
        this.score += score;
        return score;
    }

    public void resetScore(){
        score = 0;
    }
}
