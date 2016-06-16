package dz.Hanimall.Lar.tiles;

import dz.Hanimall.Lar.graphics.Assets;

public class BoneTile extends Tile {

	public BoneTile(int id) {
		super(Assets.bone, id);

	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}