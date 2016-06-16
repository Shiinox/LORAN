package dz.Hanimall.Lar.entities;

import java.awt.Graphics;

import dz.Hanimall.Lar.tiles.Tile;
import dz.Hanimall.Lar.worlds.World;



public abstract class MovingEntity extends Entity {
	
	public static final int DEFAULT_LIVES = 11;
	public static final float DEFAULT_SPEED = 3;
	public static final int DEFAULT_HEIGHT = 32,
							DEFAULT_WIDTH = 32;

	protected int lives;
	protected float speed;
	protected float xMove, yMove;
	
	


	public MovingEntity(World world, float x, float y, int width, int height) {
		super(world, x, y, width, height);
		lives = DEFAULT_LIVES;
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
	}

	public void move(){
		moveX();
		moveY();
	
	}
	
	
	public void moveX(){
		if(xMove > 0){//Moving right
			int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;
			if(!collisionWithTile(tx, (int)(y + bounds.y)/ Tile.TILEHEIGHT ) &&
			   !collisionWithTile(tx, (int)(y + bounds.y + bounds.height)/ Tile.TILEHEIGHT ))
				x += xMove;
			//else{
			//	x= tx * Tile.TILEWIDTH - bounds.x - bounds.width;
			//}
			
			
			
		}else if(xMove < 0){//Moving left
			int tx = (int) (x + xMove + bounds.x ) / Tile.TILEWIDTH;
			if(!collisionWithTile(tx, (int)(y + bounds.y)/ Tile.TILEHEIGHT) &&
			   !collisionWithTile(tx, (int)(y + bounds.y + bounds.height)/ Tile.TILEHEIGHT )	)
			x += xMove;
		}
	}
	public void moveY(){
		if(yMove > 0){//Moving down
			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;
			if(!collisionWithTile((int)(x + bounds.x)/ Tile.TILEWIDTH,ty ) &&
			   !collisionWithTile((int)(x + bounds.x + bounds.width)/ Tile.TILEWIDTH ,ty))
				y += yMove;
			
			
			
		}else if(yMove < 0){//Moving up
			int ty = (int) (y + yMove + bounds.y ) / Tile.TILEHEIGHT;
			if(!collisionWithTile((int)(x + bounds.x)/ Tile.TILEWIDTH,ty ) &&
			   !collisionWithTile((int)(x + bounds.x + bounds.width)/ Tile.TILEWIDTH,ty ))
				y += yMove;
			}
	}
	
	public boolean collisionWithTile(int x, int y){
		return world.getTile(x, y).isSolid();
	}
	
	
	
	
	
	// Getters & Setters
	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public void tick(boolean status) {
		// TODO Auto-generated method stub
		
	}

	public void render(Graphics g, float x, float y) {
		// TODO Auto-generated method stub
		
	}
}

