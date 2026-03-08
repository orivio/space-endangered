package com.obedotto.spaceendangered.game;


import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Image;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class TitleScreen extends BasicGameState {

	public static final int ID = 0;
	private Image titleScreenImage;
	
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

	// ----- ChatGPT generated placeholder -----
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
    Input input = gc.getInput();
    
    // Check if the left mouse button was pressed this frame
    if (input.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
        // Optional: Check if click is within a certain area (e.g., a button)
        int x = input.getMouseX();
        int y = input.getMouseY();
        
        if (x > 392 && x < 932 && y > 467 && y < 618) {
            sbg.enterState(2, new FadeOutTransition(), new FadeInTransition());

        }
    }
	// -----                               -----
}

}
