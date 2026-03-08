
import org.newdawn.slick.*;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import com.obedotto.spaceendangered.assets.Assets;
import com.obedotto.spaceendangered.engine.Renderer;
import com.obedotto.spaceendangered.game.LevelSelectScreen;
import com.obedotto.spaceendangered.game.PlayScreen;
import com.obedotto.spaceendangered.game.TitleScreen;

public class Game extends StateBasedGame {

    public static final int TITLESCREEN = 0;
    public static final int LEVEL_SELECT = 1;
    public static final int PLAY = 2;

    public static final int width = 1280;
    public static final int height = 720;
    public static final int fps = 60;

    private static final double version = 0.1;

    public Game(String name) {
        super(name);
        //TODO Auto-generated constructor stub


    }

    @Override
    public void initStatesList(GameContainer arg0) throws SlickException {
        this.addState(new TitleScreen());
        this.addState(new LevelSelectScreen()); //Selecting a level
        this.addState(new PlayScreen()); //Playing the game
    }

    public static void main(String[] args) throws SlickException {
        try{
            AppGameContainer game = new AppGameContainer(new Game("Space Endangered v" + version));
            game.setDisplayMode(width, height, false);
            game.setTargetFrameRate(60);
            game.setShowFPS(false);
            game.start();
        }
        catch(SlickException e) {
            e.printStackTrace();
        }
    }
}
