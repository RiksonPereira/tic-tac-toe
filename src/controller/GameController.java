package controller;

import model.Game;
import model.GameState;
import model.Player;
import strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(
            int size,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
        return new Game(
                size,
                players,
                winningStrategies);
        //Game.getBuilder().setSize.setPlayers().setWinningStrategies().build();
        //  validation:
        //  1. No of Players = size - 1;
        //  2. all players should have distinct symbols
        //  3. We only have at max One Bot
    }

    /*
    To start a game:
    - size of the board
    - List of Players
    - List of winning strategies
     */
    public GameState getGameState(Game game){
        return GameState.IN_PROGRESS;
    }

    public void makeMove(Game game){

    }

    public void undo(Game game){

    }

    public Player getWinner(Game game){
        return null;
    }

    public void display(Game game){
        game.displayBoard();
    }
}
