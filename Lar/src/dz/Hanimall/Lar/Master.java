package dz.Hanimall.Lar;

import dz.Hanimall.Lar.inputs.KeyManager;
import dz.Hanimall.Lar.worlds.World;

public class Master {
	
	private Game game;
	private World world;
	
	public Master(Game game){
		this.game = game;
	}
	
	
	
	
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	

	
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
