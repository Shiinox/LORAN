package dz.Hanimall.Lar.entities.creatures;

import java.awt.Graphics;

import java.awt.image.BufferedImage;
import dz.Hanimall.Lar.Game;
import dz.Hanimall.Lar.Move;





import dz.Hanimall.Lar.graphics.Animation;
import dz.Hanimall.Lar.graphics.Assets;
import dz.Hanimall.Lar.tiles.Tile;
import dz.Hanimall.Lar.worlds.World;

public class Spell extends MovingEntity{

	
	
	private Animation animSpell;

	private Game game;

	private Move direction;
	private boolean inLife = true;
	
	
	
	
	
	
	public Spell( World world, Game game, float x, float y,Move direction) {
		super(game, world, x, y, MovingEntity.DEFAULT_WIDTH, MovingEntity.DEFAULT_HEIGHT);
		

		
		this.game = game;

		this.direction = direction;
		
		
		animSpell = new Animation(100,Assets.spell);
	}

	
	private void getDirection(){
		
		xMove = 0;
		yMove = 0;
		
		if(direction == Move.Up)
			yMove = -speed;
		if(direction == Move.Down)
			yMove =  speed;
		if(direction == Move.Left)
			xMove = -speed;
		if(direction == Move.Right)
			xMove =  speed;
		
		if(direction == Move.UpLeft){
			yMove = -speed;
			xMove = -speed;}
		if(direction == Move.UpRight){
			yMove = -speed;
			xMove =  speed;}
		if(direction == Move.DownLeft){
			yMove =  speed;
			xMove = -speed;}
		if(direction == Move.DownRight){
			yMove =  speed;
			xMove =  speed;}
		
		
	}
		/////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////
	
	
	

		@Override
	public void move(){
			if(!entityCollision(xMove, 0f) && !playerCollision(xMove, 0f))
				moveX();
			else if (direction == Move.Left)
				direction = Move.Right;
			else if (direction == Move.Right)
				direction = Move.Left;
			if(playerCollision(xMove, 0f))
				inLife = false ;
				
			if(!entityCollision(0f, yMove)&& !playerCollision(0f, yMove))
				moveY();
			else if (direction == Move.Up)
				direction = Move.Down;
			else if (direction == Move.Down)
				direction = Move.Up;
			if(playerCollision(0f, yMove))
				inLife = false ;
			
	}
	
	

	
		@Override
	public void moveX(){
			
		
			
			
			
			
			 if(xMove > 0){//Moving right
				int tx = (int) (x + xMove + 32) / Tile.TILEWIDTH;
		
				if(!collisionWithTile(tx, (int)(y + bounds.y)/ Tile.TILEHEIGHT ) &&
				   !collisionWithTile(tx, (int)(y + bounds.y + bounds.height)/ Tile.TILEHEIGHT )){
				if(playerCollision(xMove, 0f)){
					inLife = false ;
				}
					x += xMove;
					
						
				}
				
					
				else
					direction = Move.Left;
			
			
			
			
		}else if(xMove < 0){//Moving left
			int tx = (int) (x + xMove + bounds.x ) / Tile.TILEWIDTH;
			if(!collisionWithTile(tx, (int)(y + bounds.y)/ Tile.TILEHEIGHT) &&
			   !collisionWithTile(tx, (int)(y + bounds.y + bounds.height)/ Tile.TILEHEIGHT )	){
				if(playerCollision(xMove, 0f)){
					inLife = false ;
				}
				x += xMove;}
			else
				direction = Move.Right;
		}
	}
		
		


		@Override
	public void moveY(){
		if(yMove > 0){//Moving down
			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;
			if(!collisionWithTile((int)(x + bounds.x)/ Tile.TILEWIDTH,ty ) &&
			   !collisionWithTile((int)(x + bounds.x + bounds.width)/ Tile.TILEWIDTH ,ty)){
				if(playerCollision(0f, yMove)){
					inLife = false ;
				}
				
				y += yMove;}
			else
				direction = Move.Up;
			
			
		}else if(yMove < 0){//Moving up
			int ty = (int) (y + yMove + bounds.y ) / Tile.TILEHEIGHT;
			if(!collisionWithTile((int)(x + bounds.x)/ Tile.TILEWIDTH,ty ) &&
			   !collisionWithTile((int)(x + bounds.x + bounds.width)/ Tile.TILEWIDTH,ty )){
				if(playerCollision(0f, yMove)){
					inLife = false ;
				}
			
				y += yMove;}
			else
				direction = Move.Down;
			}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void tick(){
		animSpell.tick();
		getDirection();
		move();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(),(int) x,(int) y, width, height, null);
		
	}
	
	private BufferedImage getCurrentAnimationFrame (){
			return animSpell.getCurrentFrame();
	}
	public boolean playerCollision(float xX, float yY){
		if(game.getPlayer().collisionBounds(0f, 0f).intersects(collisionBounds(xX,yY)))
		
		return true;
		return false;
	}
	
	public boolean isInLife() {
		return inLife;
	}
	
}
