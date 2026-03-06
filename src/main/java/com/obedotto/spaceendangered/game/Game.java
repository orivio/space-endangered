//SEE OLD VERS BELOW - Russ
package src.main.java.com.obedotto.spaceendangered.game; //should be "src.main.java.com.obedotto.spaceendangered.game"

import src.main.java.com.obedotto.spaceendangered.assets.Assets;
import src.main.java.com.obedotto.spaceendangered.engine.Renderer;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application {
    private Renderer renderer;
    private Assets assets;

    private TitleScreen titleScreen;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hey bro");
    }

    public Game() {
        this.assets = new Assets();

    }
}

/*
package com.obedotto.spaceendangered.game; //should be "src.main.java.com.obedotto.spaceendangered.game"

import com.obedotto.spaceendangered.assets.Assets;
import com.obedotto.spaceendangered.engine.Renderer;

import javafx.application.Application;
import javafx.stage.Stage;
*/