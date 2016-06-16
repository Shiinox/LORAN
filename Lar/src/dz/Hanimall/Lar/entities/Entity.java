package dz.Hanimall.Lar.entities;

import java.awt.Graphics;
import java.awt.Rectangle;


import dz.Hanimall.Lar.Game;




import dz.Hanimall.Lar.worlds.World;



public abstract class Entity {

	
	protected World world;

	protected Game game;

	protected float x, y;
	protected int width, height;
	public Rectangle bounds;
	

	public Entity (Game game, World world, float x, float y, int width, int height){



		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.world = world;

		this.game = game;

		bounds = new Rectangle(0,0,width,height);
		}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	

	public boolean entityCollision(float xX, float yY){
		for (Entity e : game.getEntityManager().getEntities()){
			if(e.equals(this))
				continue;
			if(e.collisionBounds(0f, 0f).intersects(collisionBounds(xX, yY)))
				return true;
		}
		return false;
	}

	public Rectangle collisionBounds(float xX, float yY){	
		
		return new Rectangle ((int) (x + xX), (int) (y + yY), width, height);
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
}
