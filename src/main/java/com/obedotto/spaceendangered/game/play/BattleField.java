package com.obedotto.spaceendangered.game.play;

import org.newdawn.slick.SlickException;

import com.obedotto.spaceendangered.engine.Renderer;

public class BattleField {

    private BattleCell[][] grid;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 7;

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

    public void handleClick(int mouseX, int mouseY) throws SlickException {
        for(int i = 0; i < BattleField.WIDTH; i ++) {
            for(int j = 0; j < BattleField.HEIGHT; j ++) {
                if(grid[i][j].contains(mouseX, mouseY)) {
                    grid[i][j].handleClick(mouseX, mouseY);
                    placeUnit(new NormalUnit(), i, j);
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
