package dz.Hanimall.Lar;



import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dz.Hanimall.Lar.entities.EntityManager;
import dz.Hanimall.Lar.entities.creatures.Player;
import dz.Hanimall.Lar.entities.creatures.Spell;
import dz.Hanimall.Lar.entities.statics.DoorOpen;
import dz.Hanimall.Lar.graphics.Assets;
import dz.Hanimall.Lar.inputs.KeyManager;
import dz.Hanimall.Lar.tiles.Tile;
import dz.Hanimall.Lar.view.View;
import dz.Hanimall.Lar.worlds.World;







public class Game implements Runnable {

	private View view;
	public int width, height;
	public String title;
	
	

	//Master
	//	private Master master;
		
	
	
	//Spell
	int xSpawnn = 0 , ySpawnn =0 ;
	public Move lastMove;
	private Spell spell;
	
	//Inputs
	private KeyManager keyManager;
	
	//Thread
	private boolean running = false;
	private Thread thread;
	
	
	//World
	private World world;
	
	//Player
	private Player player;
	
	
	
	//Graphics
	private BufferStrategy bs;
	private Graphics g;
	
	//Entities
	private EntityManager entityManager;
	
	
	
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		entityManager = new EntityManager(this , new Player (world, this, 200, 200));
		
		world = new World("res/map1.txt");
		
		entityManager.getPlayer().setX(world.getSpawnX());
		entityManager.getPlayer().setY(world.getSpawnY());
		entityManager.addEntity(new DoorOpen (this, world , 200,200));
			
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	private void init(){
		view = new View(title, width, height);
		view.getFrame().addKeyListener(keyManager);
		Assets.init();
		player = new Player(world, this, 50,50);
		
	
		

	
		
	}
	

	private void tick(){
		if(spell != null && !spell.isInLife()){
			spell = null;
			
			
		}
		
		entityManager.tick();
		keyManager.tick();
		
		world.tick();
		
		player.tick();
		
		getLastMove();
		if(this.getKeyManager().space && spell == null && !player.collisionWithTile((int) (player.getX() + xSpawnn )/Tile.TILEWIDTH, (int)( player.getY() + ySpawnn) /Tile.TILEHEIGHT) ){
		spell = new Spell( world, this, player.getX() + xSpawnn , player.getY() + ySpawnn , lastMove);
		System.out.println(lastMove);
		
		}
	
		
		if(spell !=null)
		spell.tick();
		
		
	
	}
	
	private void render(){
		bs = view.getCanvas().getBufferStrategy();
		if(bs == null){
			view.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		

		//Draw Here!
		
		world.render(g);
		entityManager.render(g);
		if(spell !=null)
			spell.render(g);
		player.render(g);
		

		
		
	
		 
		
		
		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	
	public void getLastMove(){
		
		
		if (this.getKeyManager().down ){
			xSpawnn = 0;
			ySpawnn = player.getHeight() +3 ;
			lastMove = Move.Down;
		}
		if (this.getKeyManager().up){
			xSpawnn = 0;
			ySpawnn = - player.getHeight()  ;
			lastMove = Move.Up;
		}
		if (this.getKeyManager().left){
			xSpawnn = - player.getWidth()  ;
			ySpawnn = 0;
			lastMove = Move.Left;
		}
		if (this.getKeyManager().right){
			xSpawnn = player.getWidth() +3;
			ySpawnn = 0;
			lastMove = Move.Right;
		}
		if (this.getKeyManager().down && this.getKeyManager().right){
			xSpawnn = player.getWidth() ;
			ySpawnn = player.getHeight() ;
			lastMove = Move.DownRight;
		}
		if (this.getKeyManager().down && this.getKeyManager().left){
			xSpawnn = -player.getWidth() ;
			ySpawnn = player.getHeight() ;
			lastMove = Move.DownLeft;
		}
		if (this.getKeyManager().up && this.getKeyManager().right){
			xSpawnn = player.getWidth() ;
			ySpawnn = - player.getHeight() ;
			lastMove = Move.UpRight;
		}
		if (this.getKeyManager().up && this.getKeyManager().left){
			xSpawnn = -player.getWidth() ;
			ySpawnn = - player.getHeight() ;
			lastMove = Move.UpLeft;
		}
	}

	///////////////////////////////////////////////////////////////////////
	////////////////////////////  R  U  N  ////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	
	public void run(){
		
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000){
				System.out.println("FPS : " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
		
		
	}
	
	public Player getPlayer() {
		return player;
	}

	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public KeyManager getKeyManager() {
		return keyManager;
	}

	public Spell getSpell() {
		return spell;
	}

	public int getWidth() {
		
		return width;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}
	
	
	
}

