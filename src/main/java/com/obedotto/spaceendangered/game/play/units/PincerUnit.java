package com.obedotto.spaceendangered.game.play.units;

import org.newdawn.slick.SlickException;
import com.obedotto.spaceendangered.assets.Sprite;
import com.obedotto.spaceendangered.game.play.BattleField;

public class PincerUnit extends AlienUnit {

  private float advanceTimer;
  private final float advanceRate = 0.2f;
  
  public PincerUnit() throws SlickException {
    this.sprite = new Sprite("src/main/resources/sprites/alienPincer-1.png", BattleField.CELL_WIDTH, BattleField.CELL_HEIGHT);
    advanceTimer = 0;
  }

  public void update(float deltaTime) {
    advanceTimer += deltaTime;
    if(advanceTimer > 1/advanceRate) {
      goNorth();
      advanceTimer = 0;
    }
  }
  
}
