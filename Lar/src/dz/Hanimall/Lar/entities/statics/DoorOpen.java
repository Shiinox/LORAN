package dz.Hanimall.Lar.entities.statics;

import java.awt.Graphics;

import dz.Hanimall.Lar.Game;
import dz.Hanimall.Lar.graphics.Assets;
import dz.Hanimall.Lar.tiles.Tile;
import dz.Hanimall.Lar.worlds.World;

public class DoorOpen extends StaticEntity{


	public DoorOpen(Game game, World world, float x, float y) {
		super(game, world, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);


		
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.door_open,(int) x, (int) y, width, height, null);
		
	}

}
