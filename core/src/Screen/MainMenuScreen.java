package Screen;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import Assets.*;
import MainGame.MyGame;

public class MainMenuScreen implements Screen  {
    MyGame game;
    Texture actPlayBtn = new Texture("Buttons/Play.png");
    Texture actInsBtn = new Texture("Buttons/Instruction.png");
    Texture actAboutBtn = new Texture("Buttons/AboutUs.png");
    Texture actExitBtn = new Texture("Buttons/Exit.png");

    public MainMenuScreen(MyGame game) {
        this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1, 0, 0, 1);

        game.batch.begin();

        game.batch.draw(BGAssets.HomeMenu,0,0);

        //play
        if( Gdx.input.getX() >= 135 && Gdx.input.getX() <= 660 && (MyGame.SCREEN_HEIGHT - Gdx.input.getY()) >=535 && (MyGame.SCREEN_HEIGHT - Gdx.input.getY()) <=620  ){
            game.batch.draw(actPlayBtn,100,460);
            if (Gdx.input.isTouched()){
                this.dispose();
//                game.setScreen(new LoadingScreen(game));
            }
        }

        //instruction
        if( Gdx.input.getX() >= 135 && Gdx.input.getX() <= 660 && (MyGame.SCREEN_HEIGHT - Gdx.input.getY()) >=430 && (MyGame.SCREEN_HEIGHT - Gdx.input.getY()) <=510  ){
            game.batch.draw(actInsBtn,100,360);
            if (Gdx.input.isTouched()){
                this.dispose();
                game.setScreen(new Instruction(game));
            }
        }



        if( Gdx.input.getX() >= 135 && Gdx.input.getX() <= 660 && (MyGame.SCREEN_HEIGHT - Gdx.input.getY()) >=300 && (MyGame.SCREEN_HEIGHT - Gdx.input.getY()) <=380  ){
            game.batch.draw(actAboutBtn,100,230);
            if (Gdx.input.isTouched()){
                this.dispose();
                game.setScreen(new About(game));
            }
        }

        if( Gdx.input.getX() >= 135 && Gdx.input.getX() <= 660 && (MyGame.SCREEN_HEIGHT - Gdx.input.getY()) >=180 && (MyGame.SCREEN_HEIGHT - Gdx.input.getY()) <=260  ){
            game.batch.draw(actExitBtn,100,110);
            if (Gdx.input.isTouched()){
                Gdx.app.exit();
            }
        }



        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
