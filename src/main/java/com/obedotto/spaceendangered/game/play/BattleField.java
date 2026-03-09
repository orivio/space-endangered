package com.obedotto.spaceendangered.game.play;

public class BattleField {

  private BattleCell[][] grid;

  public BattleField() {
    this.grid = new BattleCell[5][6];
    for(int i = 0; i < 5; i ++) {
      for(int j = 0; j < 6; j ++) {
        if(j > 0) {
          this.grid[i][j].north = this.grid[i][j-1];
        }
        if(j < 5) {
          this.grid[i][j].south = this.grid[i][j+1];
        }
        
        if(i > 0) {
          this.grid[i][j].north = this.grid[i-1][j];
        }
        if(i < 4) {
          this.grid[i][j].south = this.grid[i+1][j];
        }
      }
    }
  }
  
  public void update(float deltaTime) {
    for(BattleCell cell : grid) {
      cell.update(deltaTime);
    }
  }

  public void placeUnit(AlienUnit unit, int i, int j) {
    this.grid[i][j] = unit;
    unit.setContainer(this.grid[i][j]);
  }
}
