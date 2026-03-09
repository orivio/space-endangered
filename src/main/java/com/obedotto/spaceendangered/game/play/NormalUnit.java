package com.obedotto.spaceendangered.game.play;

public class NormalUnit {

  private float advanceTimer;
  private final float advanceRate;

  private float shootTimer;
  private final float shootRate;
  
  public NormalUnit() {
    super();
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
