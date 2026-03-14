package com.obedotto.spaceendangered.game.play;

import org.newdawn.slick.SlickException;

import com.obedotto.spaceendangered.engine.Renderer;
import com.obedotto.spaceendangered.game.play.units.*;
import com.obedotto.spaceendangered.game.play.cards.*;

public class BattleField {

    private BattleCell[][] grid;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 7;
    public static final int CELL_WIDTH = 64;
    public static final int CELL_HEIGHT = 64;

    public BattleField() {
        this.grid = new BattleCell[WIDTH][HEIGHT];
        for(int i = 0; i < WIDTH; i ++) {
            for(int j = 0; j < HEIGHT; j ++) {
                this.grid[i][j] = new BattleCell(i, j);
                if(j > 0) {
                    this.grid[i][j].north = this.grid[i][j-1];
                }
                if(j < 5) {
                    this.grid[i][j].south = this.grid[i][j+1];
                }
                
                if(i > 0) {
                    this.grid[i][j].west = this.grid[i-1][j];
                }
                if(i < 4) {
                    this.grid[i][j].east = this.grid[i+1][j];
                }
            }
        }
    }

    public int handleClick(int mouseX, int mouseY, AlienUnitCard selectedCard) throws SlickException {
        for(int i = 0; i < BattleField.WIDTH; i ++) {
            for(int j = 0; j < BattleField.HEIGHT; j ++) {
                if(grid[i][j].contains(mouseX, mouseY)) {
                    grid[i][j].handleClick(mouseX, mouseY);
                    switch(selectedCard.cardType) {
                        case AlienCard.SHOOTER: return placeUnit(selectedCard.cost, new ShooterUnit(), i, j);
                        case AlienCard.NORMAL: return placeUnit(selectedCard.cost, new NormalUnit(), i, j);
                        case AlienCard.PINCER: return placeUnit(selectedCard.cost, new PincerUnit(), i, j);
                        case AlienCard.SHIELD: return placeUnit(selectedCard.cost, new ShieldUnit(), i, j);
                    }
                }
            }
        }
        return 0;
    }
  
    public void update(float deltaTime) {
        for(BattleCell[] row : grid) {
            for(BattleCell cell : row) {
                cell.update(deltaTime);
            }
        }
    }

    public void render(Renderer renderer) {
        for(int i = 0; i < BattleField.WIDTH; i ++) {
            for(int j = 0; j < BattleField.HEIGHT; j ++) {
                grid[i][j].render(renderer);
            }
        }
    }

    public int placeUnit(int cost, AlienUnit unit, int i, int j) {
        this.grid[i][j].setAlienUnit(unit);
        unit.setContainer(this.grid[i][j]);
        unit.setX(i);
        unit.setY(j);
        return cost;
    }
}
