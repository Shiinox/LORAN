package dz.Hanimall.Lar.entities;

import java.awt.Graphics;
import java.util.ArrayList;


import dz.Hanimall.Lar.Game;


import dz.Hanimall.Lar.entities.creatures.Player;

public class EntityManager {
	
	
	
	private Player player; 
	private Game game;
	private ArrayList<Entity> entities;
	
	public EntityManager(Game game, Player player){
		this.game = game;
		this.player = player;
		entities = new ArrayList<Entity>();

		//addEntity(player);

	}
	
	public void tick(){
		for(int i = 0; i < entities.size(); i++){
			Entity e = entities.get(i);
			e.tick();
		}

			//player.tick();

			

		
	}
	
	public void render(Graphics g){
		for(Entity e : entities){
			e.render(g);
		}

			//player.render(g);

			

		
	}
	
	public void addEntity(Entity e){
		entities.add(e);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

}
