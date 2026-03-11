package com.obedotto.spaceendangered.game.play.units;

import org.newdawn.slick.SlickException;
import com.obedotto.spaceendangered.engine.Renderer;
import com.obedotto.spaceendangered.game.play.BattleCell;
import com.obedotto.spaceendangered.game.play.BattleField;
import com.obedotto.spaceendangered.assets.Sprite;

public class AlienUnit {

  private BattleCell container;
  public Sprite sprite;
  private int x, y;
  
  public AlienUnit() throws SlickException {
    this.sprite = new Sprite("src/main/resources/sprites/alienNormal-1.png", BattleField.CELL_WIDTH, BattleField.CELL_HEIGHT);
  }

  public void setContainer(BattleCell container) {
    this.container = container;
  }

  public void update(float deltaTime) {

  }

  public void render(Renderer renderer) {
    renderer.drawSprite(sprite);
    sprite.setIsUnit();
  }

  public void setX(int x) {
    this.x = x;
    this.sprite.setX(x * BattleField.CELL_WIDTH);
  }
  public void setY(int y) {
    this.y = y;
    this.sprite.setY(y * BattleField.CELL_HEIGHT);
  }
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public void changeX(int x) {
    setX(getX() + x);
  }
  public void changeY(int y) {
    setY(getY() + y);
  }

  protected void goNorth() {
    if(y <= 0) {
      container.setAlienUnit(null);
      return;
    }
    container.goNorth();
  }
  protected void goSouth() {
    if(y >= BattleField.HEIGHT) {
      container.setAlienUnit(null);
      return;
    }
    container.goSouth();
  }
  protected void goEast() {
    if(x <= 0) {
      container.setAlienUnit(null);
      return;
    }
    container.goEast();
  }
  protected void goWest() {
    if(x >= BattleField.WIDTH) {
      container.setAlienUnit(null);
      return;
    }
    container.goWest();
  }

}
