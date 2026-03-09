package com.obedotto.spaceendangered.game.play;

import org.newdawn.slick.SlickException;
import com.obedotto.spaceendangered.assets.Sprite;

public class NormalUnit extends AlienUnit {

  private float advanceTimer;
  private final float advanceRate = 0.2f;

  private float shootTimer;
  private final float shootRate = 0.1f;
  
  public NormalUnit() throws SlickException {
    this.sprite = new Sprite("src/main/resources/sprites/alienNormal-1.png", 64, 64);
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
