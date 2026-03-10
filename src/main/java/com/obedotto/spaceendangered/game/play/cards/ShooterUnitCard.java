package com.obedotto.spaceendangered.game.play.cards;

import com.obedotto.spaceendangered.assets.Sprite;
import com.obedotto.spaceendangered.game.play.cards.AlienUnitCard;

import org.newdawn.slick.SlickException;

public class ShooterUnitCard extends AlienUnitCard {
    
    public ShooterUnitCard() throws SlickException {
        this.sprite = new Sprite("src/main/resources/sprites/alienShooter-card1.png", 150, 150);
        this.sprite.setX(15);
        this.sprite.setY(567);
    }

}
