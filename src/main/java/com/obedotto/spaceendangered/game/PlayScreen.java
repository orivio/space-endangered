package com.obedotto.spaceendangered.game;
import java.util.List;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

import java.util.List;
import java.util.ArrayList;



public class PlayScreen implements GameState {

    public static final int ID = 2;

    private List<Image> sprites;

    @Override
    public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
        
    }

    @Override
    public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
    }

    @Override
    public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
    }

    @Override
    public void mousePressed(int arg0, int arg1, int arg2) {
    }

    @Override
    public void mouseReleased(int arg0, int arg1, int arg2) {
    }

    @Override
    public void mouseWheelMoved(int arg0) {
    }

    @Override
    public void inputEnded() {
    }

    @Override
    public void inputStarted() {
    }

    @Override
    public boolean isAcceptingInput() {
        return true;
    }

    @Override
    public void setInput(Input arg0) {
    }

    @Override
    public void keyPressed(int arg0, char arg1) {
    }

    @Override
    public void keyReleased(int arg0, char arg1) {
    }

    @Override
    public void controllerButtonPressed(int arg0, int arg1) {
    }

    @Override
    public void controllerButtonReleased(int arg0, int arg1) {
    }

    @Override
    public void controllerDownPressed(int arg0) {
    }

    @Override
    public void controllerDownReleased(int arg0) {
    }

    @Override
    public void controllerLeftPressed(int arg0) {
    }

    @Override
    public void controllerLeftReleased(int arg0) {
    }

    @Override
    public void controllerRightPressed(int arg0) {
    }

    @Override
    public void controllerRightReleased(int arg0) {
    }

    @Override
    public void controllerUpPressed(int arg0) {
    }

    @Override
    public void controllerUpReleased(int arg0) {
    }

    @Override
    public void enter(GameContainer arg0, StateBasedGame arg1) throws SlickException {
    }

    @Override
    public int getID() {
        return PlayScreen.ID;
    }

    @Override
    public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
        sprites = new ArrayList<>();

        sprites.add(new Image("src/main/resources/sprites/alienNormal-1.png"));
        sprites.add(new Image("src/main/resources/sprites/alienPincer-1.png"));
        sprites.add(new Image("src/main/resources/sprites/alienShield-1.png"));
        sprites.add(new Image("src/main/resources/sprites/alienShooter-1.png"));
    }

    @Override
    public void leave(GameContainer arg0, StateBasedGame arg1) throws SlickException {
    }

    @Override
    public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
        for(int i = 0; i < sprites.size(); i ++) {
            sprites.get(i).draw(i * 10, 0);
        }
    }

    @Override
    public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
    }
    
}
