package com.obedotto.spaceendangered.engine;
import com.obedotto.spaceendangered.assets.Sprite;

public class Renderer {

    public Renderer() {

    }

    public void drawSprite(Sprite sprite) {
        sprite.getImage().draw(sprite.getX(), sprite.getY(), sprite.getW(), sprite.getH());
    }

}
