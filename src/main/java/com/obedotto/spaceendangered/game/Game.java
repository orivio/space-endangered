//SEE OLD VERS BELOW - Russ
package com.obedotto.spaceendangered.game; //should be "src.main.java.com.obedotto.spaceendangered.game"

import com.obedotto.spaceendangered.assets.Assets;
import com.obedotto.spaceendangered.engine.Renderer;

public class Game {
    private Renderer renderer;
    private Assets assets;

    private TitleScreen titleScreen;

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