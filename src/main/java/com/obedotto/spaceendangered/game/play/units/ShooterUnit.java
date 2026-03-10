package com.obedotto.spaceendangered.game.play.units;

import org.newdawn.slick.SlickException;
import com.obedotto.spaceendangered.game.play.BattleField;
import com.obedotto.spaceendangered.assets.Sprite;

public class ShooterUnit extends AlienUnit {

  private float advanceTimer;
  private final float advanceRate = 0.2f;

  private float shootTimer;
  private final float shootRate = 0.1f;
  
  public ShooterUnit() throws SlickException {
    this.sprite = new Sprite("src/main/resources/sprites/alienShooter-1.png", BattleField.CELL_WIDTH, BattleField.CELL_HEIGHT);
    advanceTimer = 0;
    shootTimer = 0;
  }

  public void update(float deltaTime) {
    advanceTimer += deltaTime;
    shootTimer += deltaTime;
    if(advanceTimer > 1/advanceRate) {
      goNorth();
      advanceTimer = 0;
    }
    if(shootTimer > 1/shootRate) {
      shootTimer = 0;
    }
    
  }
  
}
