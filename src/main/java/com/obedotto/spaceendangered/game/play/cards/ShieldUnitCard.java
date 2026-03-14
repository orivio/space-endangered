package com.obedotto.spaceendangered.game.play.cards;

import org.newdawn.slick.SlickException;
import com.obedotto.spaceendangered.assets.Sprite;
import com.obedotto.spaceendangered.game.play.cards.AlienUnitCard;

public class ShieldUnitCard extends AlienUnitCard {
    public ShieldUnitCard() throws SlickException {
        this.sprite = new Sprite("src/main/resources/sprites/alienShield-card1.png", 150, 150);
        this.sprite.setX(15 + 175 + 175 + 175);
        this.sprite.setY(567);
        this.cost = 5;
        this.cardType = AlienCard.SHIELD;
    }
}
