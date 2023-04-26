package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture pollastreImg;
	Texture imgBackround;
	Sprite backgroundSprite;
	Sprite pollastre;
	Texture badlogicImg;
	Sprite badlogic;

	@Override
	public void create () {
		batch = new SpriteBatch();

		imgBackround = new Texture("background_img.jpg");
		backgroundSprite = new Sprite(imgBackround, ScreenUtils.getFrameBufferTexture().getRegionWidth(), ScreenUtils.getFrameBufferTexture().getRegionHeight());

		pollastreImg = new Texture("pollastre.jpg");
		pollastre = new Sprite(pollastreImg, 0, 0, 100,100);
		pollastre.setPosition(200, 200);
		pollastre.rotate(45);

		badlogicImg = new Texture("badlogic.jpg");
		badlogic = new Sprite(badlogicImg, 0, 0, 100,100);
	}

	public void renderBackground() {
		backgroundSprite.draw(batch);
	}

	@Override
	public void render () {
		ScreenUtils.clear(71, 150, 212, 0);
		batch.begin();
		renderBackground();
		pollastre.draw(batch);
		badlogic.draw(batch);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		pollastreImg.dispose();
	}
}
