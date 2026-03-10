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

    public void handleClick(int mouseX, int mouseY, int selectedCard) throws SlickException {
        for(int i = 0; i < BattleField.WIDTH; i ++) {
            for(int j = 0; j < BattleField.HEIGHT; j ++) {
                if(grid[i][j].contains(mouseX, mouseY)) {
                    grid[i][j].handleClick(mouseX, mouseY);
                    switch(selectedCard) {
                        case 0 -> placeUnit(new ShooterUnit(), i, j);
                        case 1 -> placeUnit(new NormalUnit(), i, j);
                        case 2 -> placeUnit(new PincerUnit(), i, j);
                        case 3 -> placeUnit(new ShieldUnit(), i, j);
                    }
                }
            }
        }
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

    public void placeUnit(AlienUnit unit, int i, int j) {
        this.grid[i][j].setAlienUnit(unit);
        unit.setContainer(this.grid[i][j]);
        unit.setX(i);
        unit.setY(j);
    }
}
