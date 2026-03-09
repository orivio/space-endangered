package com.obedotto.spaceendangered.game.play;

import com.obedotto.spaceendangered.assets.Sprite;
import org.newdawn.slick.SlickException;

public class ShooterUnitCard extends AlienUnitCard {
    
    public ShooterUnitCard() throws SlickException {
        this.sprite = new Sprite("src/main/resources/sprites/alienShooter-card1.png", 150, 150);
        this.sprite.setX(15);
        this.sprite.setY(567);
    }

}
