package com.obedotto.spaceendangered.game;
import java.util.List;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Color;

import java.util.ArrayList;

import com.obedotto.spaceendangered.assets.Sprite;
import com.obedotto.spaceendangered.engine.Renderer;
import com.obedotto.spaceendangered.game.play.*;

import org.newdawn.slick.TrueTypeFont;
import java.awt.Font;


public class PlayScreen implements GameState {

    public static final int ID = 2;

    private List<AlienUnitCard> cards;
    private Image background;
    private Renderer renderer;

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
        cards = new ArrayList<>();

        cards.add(new ShooterUnitCard());
        cards.add(new NormalUnitCard());
        cards.add(new PincerUnitCard());
        cards.add(new ShieldUnitCard());

        background = new Image("src/main/resources/Play Screen.png");
        renderer = new Renderer();


    }

    @Override
    public void leave(GameContainer arg0, StateBasedGame arg1) throws SlickException {
    }

    @Override
    public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
        background.draw();
        
        for(int i = 0; i < cards.size(); i ++) {
            cards.get(i).draw(renderer);
        }

        Font font = new Font("Verdana", Font.BOLD, 35);
        TrueTypeFont ttf = new TrueTypeFont(font, true);
        ttf.drawString(1105, 595, "$67", Color.black);
    }

    @Override
    public void update(GameContainer container, StateBasedGame arg1, int arg2) throws SlickException {
        Input input = container.getInput();
        int mouseX = input.getMouseX();
        int mouseY = input.getMouseY();

        for(AlienUnitCard card : cards) {
            if(card.getSprite().getBounds().contains(mouseX, mouseY)) {
                card.activate();
            }
            else {
                card.deactivate();
            }

            card.update(arg2 / 1000.0f);
        }
    }
    
}
