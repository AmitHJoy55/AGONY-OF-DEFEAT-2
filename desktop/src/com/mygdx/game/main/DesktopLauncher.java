package com.mygdx.game.main;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import MainGame.MyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("NINJA RUN");
		config.setWindowedMode(1700,950);
		config.setWindowedMode(MyGame.SCREEN_WIDTH,MyGame.SCREEN_HEIGHT);
		config.setResizable(false); // screen will not be resizable.
		new Lwjgl3Application(new MyGame(), config);
	}
}
