public class Main {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Mike", highScorePosition);
        int highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Hanna", highScorePosition);
        int highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Austin", highScorePosition);
        int highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Matt", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position" + highScorePosition + "on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
