package dz.Hanimall.Lar.entities;

import java.awt.Graphics;
import java.awt.Rectangle;

<<<<<<< HEAD
import dz.Hanimall.Lar.Game;

=======
import dz.Hanimall.Lar.def.Master;
>>>>>>> 2e98471451f9a6e590be1405d8a5abdbaa087ad0
import dz.Hanimall.Lar.worlds.World;



public abstract class Entity {

	
	protected World world;
<<<<<<< HEAD
	protected Game game;
=======
>>>>>>> 2e98471451f9a6e590be1405d8a5abdbaa087ad0
	protected float x, y;
	protected int width, height;
	public Rectangle bounds;
	
<<<<<<< HEAD
	public Entity (Game game, World world, float x, float y, int width, int height){
=======
	public Entity (World world, float x, float y, int width, int height){
>>>>>>> 2e98471451f9a6e590be1405d8a5abdbaa087ad0
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.world = world;
<<<<<<< HEAD
		this.game = game;
=======
		
>>>>>>> 2e98471451f9a6e590be1405d8a5abdbaa087ad0
		bounds = new Rectangle(0,0,width,height);
		}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	
<<<<<<< HEAD
	public boolean entityCollision(float xX, float yY){
		for (Entity e : game.getEntityManager().getEntities()){
			if(e.equals(this))
				continue;
			if(e.collisionBounds(0f, 0f).intersects(collisionBounds(xX, yY)))
				return true;
		}
		return false;
	}
	
	
=======
>>>>>>> 2e98471451f9a6e590be1405d8a5abdbaa087ad0
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
