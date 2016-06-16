package dz.Hanimall.Lar.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;


import dz.Hanimall.Lar.Game;
import dz.Hanimall.Lar.entities.Entity;
import dz.Hanimall.Lar.graphics.Animation;
import dz.Hanimall.Lar.graphics.Assets;
import dz.Hanimall.Lar.worlds.World;




public class Player extends MovingEntity {

	//Animation
	private Animation animLorann;
	
	private int score;
	private Game game;


	
	
	public Player(World world, Game game, float x, float y) {

		super(game, world, x, y, MovingEntity.DEFAULT_WIDTH, MovingEntity.DEFAULT_HEIGHT);
		

		
		this.game = game;
		score = 0;
		
		//Animation
		animLorann = new Animation(100,Assets.lorann);
	}

	@Override
	public void tick() {
		//Animation
		animLorann.tick();
		
		//Move
		getInput();
		move();
	}

	private void getInput(){
		
		xMove = 0;
		yMove = 0;
		
		if(game.getKeyManager().up)
			yMove = -speed;
		if(game.getKeyManager().down)
			yMove =  speed;
		if(game.getKeyManager().right)
			xMove =  speed;
		if(game.getKeyManager().left)
			xMove = -speed;
		
		
	}


	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(),(int) x,(int) y, width, height, null);
	
		
		
		//g.setColor(Color.red);
		//g.fillRect((int)x, (int)y, bounds.width, bounds.height);
	}
	
		@Override
	public boolean entityCollision(float xX, float yY){
		for (Entity e : game.getEntityManager().getEntities()){
			if(e.equals(this))
				continue;
			
			if(e.collisionBounds(0f, 0f).intersects(collisionBounds(xX, yY))){
				if(e.getPoints() > 0 ){
					score += e.getPoints();
					game.getEntityManager().getEntities().remove(e);
				}
				return true;
				
			}
		}
		return false;
	
	}
	
	private BufferedImage getCurrentAnimationFrame (){
		
		
		if(yMove < 0 && xMove < 0)// up left
			return Assets.lorann_ul;
		else if(yMove > 0 && xMove < 0)// down left
			return Assets.lorann_bl;
		else if(yMove < 0 && xMove > 0)// up right
			return Assets.lorann_ur;
		else if(yMove > 0 && xMove > 0)// down right
			return Assets.lorann_br;
		else if (xMove < 0 )//left
			return Assets.lorann_l;
		else if(xMove > 0)//right
			return Assets.lorann_r;
		else if(yMove < 0)//up
			return Assets.lorann_u;
		else if(yMove > 0)//down
			return Assets.lorann_b;
		else
			return animLorann.getCurrentFrame();
		
		
		
	}

	public int getScore() {
		return score;
	}

}
