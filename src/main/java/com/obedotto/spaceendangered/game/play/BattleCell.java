package com.obedotto.spaceendangered.game.play;

import org.newdawn.slick.geom.Rectangle;
import com.obedotto.spaceendangered.engine.Renderer;

public class BattleCell {
  private AlienUnit alienUnit;
  protected BattleCell north, south, east, west;
  private Rectangle bounds;
  private int x, y;

  public BattleCell(int x, int y) {
    this.x = x;
    this.y = y;
    this.bounds = new Rectangle(x * 64, y * 64, 64, 64);
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

  protected void goNorth() {
    north.setAlienUnit(this.alienUnit);
    setAlienUnit(null);
    north.getAlienUnit().setContainer(this.north);
  }
  protected void goSouth() {
    south.setAlienUnit(this.alienUnit);
    setAlienUnit(null);
    south.getAlienUnit().setContainer(this.south);
  }
  protected void goEast() {
    east.setAlienUnit(this.alienUnit);
    setAlienUnit(null);
    east.getAlienUnit().setContainer(this.east);
  }
  protected void goWest() {
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
