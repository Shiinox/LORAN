package dz.Hanimall.Lar.tiles;
import dz.Hanimall.Lar.graphics.Assets;

public class HorizontalBoneTile extends Tile {

	public HorizontalBoneTile(int id) {
		super(Assets.horizontal_bone, id);
	}
	
	
	@Override
	public boolean isSolid(){
		return true;
	}

}