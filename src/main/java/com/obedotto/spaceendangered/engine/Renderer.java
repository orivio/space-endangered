package com.obedotto.spaceendangered.engine;
import com.obedotto.spaceendangered.assets.Sprite;

public class Renderer {

    public Renderer() {

    }

    public void drawSprite(Sprite sprite) {
        if (sprite.getUnitTrue()){
           sprite.getImage().draw(sprite.getX(), sprite.getY(), sprite.getW(), sprite.getH()); //make it so that it spawns upsidedown 
        }
        else{
            sprite.getImage().draw(sprite.getX(), sprite.getY(), sprite.getW(), sprite.getH());
        }
    }

}
