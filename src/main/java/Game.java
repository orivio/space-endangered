import org.newdawn.slick.*;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import com.obedotto.spaceendangered.assets.Assets;
import com.obedotto.spaceendangered.engine.Renderer;

public class Game extends StateBasedGame {

    public static final int titlescreen = 0;
    public static final int map = 1;
    public static final int level = 2;

    public static final int width = 1920;
    public static final int height = 1080;
    public static final int fps = 60;

    private static final double version = 0.1;

    public Game(String name) {
        super(name);
        //TODO Auto-generated constructor stub


    }

    @Override
    public void initStatesList(GameContainer arg0) throws SlickException {
        this.addState(new TitleScreen());
        this.addState(new PlayScreen()); //Playing the game
        this.addState(new LevelSelectScreen()); //Selecting a level
    }

    public static void main(String[] args) throws SlickException{
        try{
            AppGameContainer game = new AppGameContainer(new Game("Space Endangered v" + version));
            game.setDisplayMode(width, height, false);
            game.setTargetFrameRate(60);
            game.setShowFPS(true); //for debug
            game.start();
        }
        catch(SlickException e) {
            e.printStackTrace();
        }
    }
}
