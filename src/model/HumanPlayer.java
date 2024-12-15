package model;

public class HumanPlayer extends Player{
    private Integer level;

    public HumanPlayer(Integer id, String name, PlayerType playerType, Symbol symbol) {
        super(id, name, playerType, symbol);
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
