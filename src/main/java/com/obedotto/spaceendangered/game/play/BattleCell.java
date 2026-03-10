package com.obedotto.spaceendangered.game.play;

import org.newdawn.slick.geom.Rectangle;
import com.obedotto.spaceendangered.engine.Renderer;
import com.obedotto.spaceendangered.game.play.units.AlienUnit;

public class BattleCell {
  private AlienUnit alienUnit;
  protected BattleCell north, south, east, west;
  private Rectangle bounds;
  private int x, y;

  public BattleCell(int x, int y) {
    this.x = x;
    this.y = y;
    this.bounds = new Rectangle(x * BattleField.CELL_WIDTH, y * BattleField.CELL_HEIGHT, BattleField.CELL_WIDTH, BattleField.CELL_HEIGHT);
  }

  public void setAlienUnit(AlienUnit unit) {
    this.alienUnit = unit;
    if(this.alienUnit != null) {
      unit.setX(x);
      unit.setY(y);
    }
  }
  public AlienUnit getAlienUnit() {
    return this.alienUnit;
  }

  public void update(float deltaTime) {
    if(alienUnit != null) {
      alienUnit.update(deltaTime);
    }
  }

  public void goNorth() {
    if(north.getAlienUnit() != null) return;
    north.setAlienUnit(this.alienUnit);
    setAlienUnit(null);
    north.getAlienUnit().setContainer(this.north);
  }
  public void goSouth() {
    if(south.getAlienUnit() != null) return;
    south.setAlienUnit(this.alienUnit);
    setAlienUnit(null);
    south.getAlienUnit().setContainer(this.south);
  }
  public void goEast() {
    if(east.getAlienUnit() != null) return;
    east.setAlienUnit(this.alienUnit);
    setAlienUnit(null);
    east.getAlienUnit().setContainer(this.east);
  }
  public void goWest() {
    if(west.getAlienUnit() != null) return;
    west.setAlienUnit(this.alienUnit);
    setAlienUnit(null);
    west.getAlienUnit().setContainer(this.west);
  }

  public boolean contains(int mouseX, int mouseY) {
    return bounds.contains(mouseX, mouseY);
  }

  public void handleClick(int mouseX, int mouseY) {
    
  }

  public void render(Renderer renderer) {
    // Draw cell borders and whatever
    if(alienUnit != null) {
      alienUnit.render(renderer);
    }
  }
  
}
