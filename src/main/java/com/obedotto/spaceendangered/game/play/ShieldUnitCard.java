package com.obedotto.spaceendangered.game.play;

import org.newdawn.slick.SlickException;
import com.obedotto.spaceendangered.assets.Sprite;

public class ShieldUnitCard extends AlienUnitCard {
    public ShieldUnitCard() throws SlickException {
        this.sprite = new Sprite("src/main/resources/sprites/alienShield-card.png", 150, 150);
        this.sprite.setX(15 + 175 + 175 + 175);
        this.sprite.setY(567);
    }
}
