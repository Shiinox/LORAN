package dz.Hanimall.Lar.entities.statics;

import java.awt.Graphics;

import dz.Hanimall.Lar.Game;
import dz.Hanimall.Lar.graphics.Assets;
import dz.Hanimall.Lar.tiles.Tile;
import dz.Hanimall.Lar.worlds.World;

public class Gold extends StaticEntity{
	
	
	
	
	
	public Gold(Game game, World world, float x, float y) {
		super(game, world, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		points = 100;
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.gold,(int) x, (int) y, width, height, null);
		
	}

	
}
