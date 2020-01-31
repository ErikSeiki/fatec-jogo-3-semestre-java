package com.the_darkside_of_asylum_jogo.game.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.the_darkside_of_asylum_jogo.game.The_DarkSide_of_Asylum_Jogo;
import com.the_darkside_of_asylum_jogo.game.tela.Som;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 60;
		config.width = The_DarkSide_of_Asylum_Jogo.LARGURA_TELA;
		config.height = The_DarkSide_of_Asylum_Jogo.ALTURA_TELA;
		config.title = "The Dark Side of Asylum";
		new LwjglApplication(new The_DarkSide_of_Asylum_Jogo(), config);
				
	}
}
