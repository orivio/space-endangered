package com.obedotto.spaceendangered.game.play.cards;

import org.newdawn.slick.SlickException;
import com.obedotto.spaceendangered.assets.Sprite;
import com.obedotto.spaceendangered.game.play.cards.AlienUnitCard;

public class NormalUnitCard extends AlienUnitCard {
    public NormalUnitCard() throws SlickException {
        this.sprite = new Sprite("src/main/resources/sprites/alienNormal-card1.png", 150, 150);
        this.sprite.setX(15 + 175);
        this.sprite.setY(567);
        this.cost = 5;
        this.cardType = AlienCard.NORMAL;
    }
}
