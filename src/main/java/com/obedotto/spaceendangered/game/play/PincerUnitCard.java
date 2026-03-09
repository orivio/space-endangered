package com.obedotto.spaceendangered.game.play;

import org.newdawn.slick.SlickException;
import com.obedotto.spaceendangered.assets.Sprite;

public class PincerUnitCard extends AlienUnitCard {
    public PincerUnitCard() throws SlickException {
        this.sprite = new Sprite("src/main/resources/sprites/alienPincer-card1.png", 150, 150);
        this.sprite.setX(15 + 175 + 175);
        this.sprite.setY(567);
    }
}
