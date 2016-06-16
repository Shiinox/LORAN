package dz.Hanimall.Lar.entities.statics;

import java.awt.Graphics;

<<<<<<< HEAD
import dz.Hanimall.Lar.Game;
=======
>>>>>>> 2e98471451f9a6e590be1405d8a5abdbaa087ad0
import dz.Hanimall.Lar.graphics.Assets;
import dz.Hanimall.Lar.tiles.Tile;
import dz.Hanimall.Lar.worlds.World;

public class DoorOpen extends StaticEntity{

<<<<<<< HEAD
	public DoorOpen(Game game, World world, float x, float y) {
		super(game, world, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
=======
	public DoorOpen(World world, float x, float y) {
		super(world, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
>>>>>>> 2e98471451f9a6e590be1405d8a5abdbaa087ad0
		
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.door_open,(int) x, (int) y, width, height, null);
		
	}

}
