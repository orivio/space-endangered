package com.obedotto.spaceendangered.game.play.cards;

import com.obedotto.spaceendangered.assets.Sprite;
import com.obedotto.spaceendangered.engine.Renderer;
import com.obedotto.spaceendangered.util.Utils;

public abstract class AlienUnitCard {
    protected Sprite sprite;
    protected boolean active;
    private float animationTimer;
    private int animation = 0;
    private float initY;
    public int cost;
    public AlienCard cardType;

    public AlienUnitCard() {

    }

    public void draw(Renderer renderer) {
        renderer.drawSprite(sprite);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public boolean contains(int x, int y) {
        return sprite.contains(x, y);
    }

    public void update(float dt) {
        if(animation == 1) {
            sprite.setY(Utils.lerp(initY, 557, animationTimer / .1f));
            animationTimer += dt;
        }
        else if(animation == 2) {
            sprite.setY(Utils.lerp(initY, 567, animationTimer / .1f));
            animationTimer += dt;
        }

        if(animationTimer >= .1f) {
            animationTimer = 0;
            animation = 0;
        }
    }

    public void activate() {
        if(!active) {
            this.active = true;
            animationTimer = 0;
            animation = 1;
            initY = sprite.getY();
        }
    }
    public void deactivate() {
        if(active) {
            this.active = false;
            animationTimer = 0;
            animation = 2;
            initY = sprite.getY();
        }
    }
}
