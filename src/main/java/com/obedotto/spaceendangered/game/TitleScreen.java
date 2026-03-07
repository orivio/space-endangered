package com.obedotto.spaceendangered.game;


import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Image;

public class TitleScreen implements GameState {

	public static final int ID = 0;
	private Image titleScreenImage;
	
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
		return TitleScreen.ID;
	}

	@Override
	public void init(GameContainer g, StateBasedGame game) throws SlickException {
		titleScreenImage = new Image("src/main/resources/Title Screen.png");
	}

	@Override
	public void leave(GameContainer arg0, StateBasedGame arg1) throws SlickException {
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
		titleScreenImage.draw(0, 0);
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
	}

}
