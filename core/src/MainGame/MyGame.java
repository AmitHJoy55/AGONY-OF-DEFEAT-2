package MainGame;

import Screen.MainMenuScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGame  extends Game {

        public static final int SCREEN_WIDTH = 1650;
        public static final int SCREEN_HEIGHT = 930;
        public SpriteBatch batch;

        @Override
        public void create () {
            batch = new SpriteBatch();
            this.setScreen(new MainMenuScreen(this));
        }

        @Override
        public void render () {
            super.render();
        }

        @Override
        public void dispose () {
            batch.dispose();
        }
}
