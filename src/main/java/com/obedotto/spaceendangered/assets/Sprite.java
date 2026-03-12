package com.obedotto.spaceendangered.assets;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class Sprite {
    private Image image;
    private float x, y, w, h;
    private Rectangle rectangle;
    private boolean xFlip, yFlip;

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
    public void setXFlip(boolean b){
        this.xFlip = b;
    }
    public void setYFlip(boolean b){
        this.yFlip = b;
    }
    public void getXFlip(){
        return this.xFlip;
    }
    public void getYFlip(){
        return this.yFlip;
    }
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
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
