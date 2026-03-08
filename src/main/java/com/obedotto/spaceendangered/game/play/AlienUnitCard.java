package com.obedotto.spaceendangered.game.play;

import com.obedotto.spaceendangered.engine.Renderer;
import com.obedotto.spaceendangered.assets.Sprite;

public abstract class AlienUnitCard {
    protected Sprite sprite;
    protected boolean active;
    private float animationTimer;

    public AlienUnitCard() {

    }

    public void draw(Renderer renderer) {
        renderer.drawSprite(sprite);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void update(float dt) {
        if(Math.abs(animationTimer) > 0.1f) {
            this.sprite.changeY(animationTimer * dt);
            animationTimer *= (0.9f);
        }
        else {
            animationTimer = 0;
        }
    }

    public void activate() {
        if(!active) {
            this.active = true;
            animationTimer = -200;
        }
    }
    public void deactivate() {
        if(active) {
            this.active = false;
            animationTimer = 200;
        }
    }
}
