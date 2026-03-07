import org.newdawn.slick.*;
import com.obedotto.spaceendangered.assets.Assets;
import com.obedotto.spaceendangered.engine.Renderer;

public class Game extends BasicGame{

    public Game(String title) {
        super(title);
        //TODO Auto-generated constructor stub
    }
    public static void main(String[] args) throws SlickException {
        AppGameContainer game = new AppGameContainer(new Game("title"));
        game.setDisplayMode(1920, 1080, false);
        game.setTargetFrameRate(144);
        game.start();
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException { //renders graphic elements
        // TODO Auto-generated method stub
        g.drawString("If an orange are called orange, why is an apple not called red?.", 50f, 50f);
    }

    @Override
    public void init(GameContainer container) throws SlickException { //runs on game opening
        // TODO Auto-generated method stub
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException { //code that runs every step, where delta = time(ms) since last frame
        // TODO Auto-generated method stub
    }
}

/*
private Renderer renderer;
    private Assets assets;

    private TitleScreen titleScreen;

    public Game() {
        this.assets = new Assets();
    }
 */
