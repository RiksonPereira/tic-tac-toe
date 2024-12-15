package strategies;

import model.Board;
import model.Cell;
import model.CellState;
import model.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row : board.getGrid()){
            for (Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    //fill cell with symbol of the Bot
                    return new Move(new Cell(cell.getRow(), cell.getCol()), null);
                }
            }
        }
        return null;
    }
}

//fill the first empty cell