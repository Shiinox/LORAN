package dz.Hanimall.Lar.tiles;

import dz.Hanimall.Lar.graphics.Assets;

public class VerticalBoneTile extends Tile {

	public VerticalBoneTile(int id) {
		super(Assets.vertical_bone, id);

	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}