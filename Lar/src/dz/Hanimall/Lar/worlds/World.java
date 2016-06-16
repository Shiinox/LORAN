package dz.Hanimall.Lar.worlds;

import java.awt.Graphics;

<<<<<<< HEAD

=======
import dz.Hanimall.Lar.entities.EntityManager;
>>>>>>> 2e98471451f9a6e590be1405d8a5abdbaa087ad0
import dz.Hanimall.Lar.tiles.Tile;
import dz.Hanimall.Lar.utils.Utils;



public class World {

	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	
	
	
	public World(String path){
		
		loadWorld(path);
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				getTile(x, y).render(g, x * Tile.TILEWIDTH, y * Tile.TILEHEIGHT);
			}
		}
	}
	
	public Tile getTile(int x, int y){
		if(x < 0 || y < 0 || x >= width || y >= height)
			return Tile.theVoidTile;
		
		
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.theVoidTile;
		return t;
	}
	
	private void loadWorld(String path){
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		setSpawnX(Utils.parseInt(tokens[2]));
		setSpawnY(Utils.parseInt(tokens[3]));
		
		tiles = new int[width][height];
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}

	public int getSpawnX() {
		return spawnX;
	}

	public void setSpawnX(int spawnX) {
		this.spawnX = spawnX;
	}

	public int getSpawnY() {
		return spawnY;
	}

	public void setSpawnY(int spawnY) {
		this.spawnY = spawnY;
	}
	
}

