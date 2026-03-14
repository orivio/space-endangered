package com.obedotto.spaceendangered.game;
import java.util.List;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Color;

import java.util.ArrayList;

import com.obedotto.spaceendangered.assets.Sprite;
import com.obedotto.spaceendangered.engine.Renderer;
import com.obedotto.spaceendangered.game.play.*;
import com.obedotto.spaceendangered.game.play.cards.AlienUnitCard;
import com.obedotto.spaceendangered.game.play.cards.NormalUnitCard;
import com.obedotto.spaceendangered.game.play.cards.PincerUnitCard;
import com.obedotto.spaceendangered.game.play.cards.ShieldUnitCard;
import com.obedotto.spaceendangered.game.play.cards.ShooterUnitCard;

import org.newdawn.slick.TrueTypeFont;
import java.awt.Font;


public class PlayScreen extends BasicGameState {

    public static final int ID = 2;

    private BattleStage battleStage;

    private List<AlienUnitCard> cards;
    private AlienUnitCard currentSelectedCard;
    private Image background;
    private Renderer renderer;
    private BattleField battleField;
    private float setupTimer;
    private float costTimer;
    private int moneyLeft;

    @Override
    public void enter(GameContainer arg0, StateBasedGame arg1) throws SlickException {
    }

    @Override
    public int getID() {
        return PlayScreen.ID;
    }

    @Override
    public void mousePressed(int button, int x, int y) {
        if(battleStage == BattleStage.BATTLE_SETUP) {
            try {
                if(currentSelectedCard != null && moneyLeft - currentSelectedCard.cost >= 0) {
                    moneyLeft -= battleField.handleClick(x, y, currentSelectedCard);
                    // Bug: If you place a unit on a cell twice, it subtracts the cost twice
                }
            } catch (SlickException e) {
                e.printStackTrace();
            }

            for(int i = 0; i < cards.size(); i ++) {
                AlienUnitCard card = cards.get(i);

                if(card.contains(x, y)) {
                    currentSelectedCard = card;
                }
            }
        }
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

        battleField = new BattleField();
        battleStage = BattleStage.BATTLE_SETUP;
        setupTimer = 60;
        costTimer = 0;
        moneyLeft = 67;
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
        ttf.drawString(1105, 595, String.format("$%d", moneyLeft), Color.black);
        if(battleStage == BattleStage.BATTLE_SETUP) {
            ttf.drawString(0, 0, String.format("Time Left: %f", setupTimer), Color.black);
            if(currentSelectedCard != null) {
                float brightness = (float)Math.sin(costTimer) / 2 + 0.5f;
                if(moneyLeft - currentSelectedCard.cost < 0) {
                    ttf.drawString(1105, 620, String.format("$%d", moneyLeft - currentSelectedCard.cost), new Color(1.0f, brightness, brightness));
                }
                else {
                    ttf.drawString(1105, 620, String.format("$%d", moneyLeft - currentSelectedCard.cost), new Color(brightness, brightness, brightness));
                }
            }
        }

        battleField.render(renderer);
    }

    @Override
    public void update(GameContainer container, StateBasedGame arg1, int arg2) throws SlickException {
        Input input = container.getInput();
        int mouseX = input.getMouseX();
        int mouseY = input.getMouseY();

        if(battleStage == BattleStage.BATTLE_SETUP) {
            for(AlienUnitCard card : cards) {
                if(card.getSprite().getBounds().contains(mouseX, mouseY)) {
                    card.activate();

                }
                else {
                    card.deactivate();
                }

                card.update(arg2 / 1000.0f);
            }

            if(currentSelectedCard != null) {
                costTimer += 10 * arg2 / 1000.0f;
            }

            setupTimer -= arg2 / 1000.0f;
            if(setupTimer < 0) {
                battleStage = BattleStage.BATTLE_RUN;
                for(AlienUnitCard card : cards) {
                    card.deactivate();
                }
            }
        }
        else if(battleStage == BattleStage.BATTLE_RUN) {
            battleField.update(arg2 / 1000.0f);
        }
    }
    
}
