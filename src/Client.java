import controller.GameController;
import model.*;
import strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer());
        players.add(new Bot());

        int size = 3;

        List<WinningStrategy> winningStrategies = new ArrayList<>();

        Game game = gameController.startGame(
                size,
                players,
                winningStrategies
        );
        /*
        process:
        - display
        - make move
        - check if win or draw
        - update state
        - update turn
        - continue
         */
        while (gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.display(game);
            gameController.makeMove(game);

            if(gameController.getGameState(game).equals(GameState.GAME_OVER)){
                System.out.println("Winner: "+ gameController.getWinner(game));
            }
            else if (gameController.getGameState(game).equals(GameState.DRAW)){
                System.out.println("Game has ended in a Draw");
            }
        }
    }
}
