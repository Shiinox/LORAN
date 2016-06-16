package dz.Hanimall.Lar.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;



public class Tile {
	
	//STATIC STUFF HERE
		
		public static Tile[] tiles = new Tile[256];
		public static Tile theVoidTile = new TheVoidTile(0);
		public static Tile boneTile = new BoneTile(1);
		public static Tile verticalBoneTile = new VerticalBoneTile(2);
		public static Tile horizontalBoneTile = new HorizontalBoneTile(3);
		
		//CLASS
		
		public static final int TILEWIDTH = 32, TILEHEIGHT = 32;
		
		protected BufferedImage texture;
		protected final int id;
		
		public Tile(BufferedImage texture, int id){
			this.texture = texture;
			this.id = id;
			
			tiles[id] = this;
		}
		
		public void tick(){
			
		}
		
		public void render(Graphics g, int x, int y){
			g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
		}
		
		public boolean isSolid(){
			return false;
		}
		
		public int getId(){
			return id;
		}
		
	}


