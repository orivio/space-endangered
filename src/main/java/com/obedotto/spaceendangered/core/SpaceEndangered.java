package com.obedotto.spaceendangered.core;

/**
 *
 * @author obedh
 */

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.obedotto.spaceendangered.game.*;

public class SpaceEndangered extends StateBasedGame {

	public static final int TITLESCREEN = 0;
	public static final int PLAY		= 1;
	
    public SpaceEndangered(String gamename) {
        super(gamename);
    }

	public void initStatesList(GameContainer gc) throws SlickException {
		this.addState(new TitleScreen());
		this.addState(new PlayScreen());
	}
    
    public static void main(String[] args) {
        try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new SpaceEndangered("Simple Slick Game"));
			appgc.setDisplayMode(640, 480, false);
			appgc.start();
		} catch (SlickException ex) {
			e.printStackTrace();
		}
    }
}
