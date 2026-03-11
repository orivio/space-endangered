package com.obedotto.spaceendangered.assets;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class Sprite {
    private Image image;
    private float x, y, w, h;
    private Rectangle rectangle;
    private boolean isUnit;

    public Sprite(String path, float w, float h) throws SlickException {
        image = new Image(path);
        image.setFilter(Image.FILTER_NEAREST);
        this.w = w;
        this.h = h;
        this.rectangle = new Rectangle(x, y, w, h);
    }

    public void setX(float x) {
        this.x = x;
        this.rectangle = new Rectangle(x, y, w, h);
    }
    public void setY(float y) {
        this.y = y;
        this.rectangle = new Rectangle(x, y, w, h);
    }
    public void setIsUnit(){
        this.isUnit = true;
    }
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }
    public boolean getUnitTrue(){
        return this.isUnit;
    }
    public void changeX(float x) {
        setX(getX() + x);
    }
    public void changeY(float y) {
        setY(getY() + y);
    }
    public float getW() {
        return this.w;
    }
    public float getH() {
        return this.h;
    }
    public boolean contains(int x, int y) {
        return getBounds().contains(x, y);
    }
    public Rectangle getBounds() {
        return this.rectangle;
    }

    public Image getImage() {
        return image;
    }
}
