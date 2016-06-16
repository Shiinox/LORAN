package dz.Hanimall.Lar.graphics;

import java.awt.image.BufferedImage;



public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage energy_ball, door_open, door_closed,
								lorann_bl, lorann_b, lorann_br, lorann_l, lorann_r, lorann_ul, lorann_u, lorann_ur,
								bone, vertical_bone, horizontal_bone, monster_1, monster_2, monster_3, monster_4, gold,
								the_void;
	
	public static BufferedImage[] lorann,spell;

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/sprite.png"));
		
		lorann = new BufferedImage[8];
		
		lorann[0]		= sheet.crop(0		  , height, width, height);
		lorann[1]		= sheet.crop(width 	  , height, width, height);
		lorann[2]		= sheet.crop(width * 2, height, width, height);
		lorann[7]		= sheet.crop(width * 3, height, width, height);
		lorann[3]		= sheet.crop(width * 4, height, width, height);
		lorann[6]		= sheet.crop(width * 5, height, width, height);
		lorann[5]		= sheet.crop(width * 6, height, width, height);
		lorann[4] 		= sheet.crop(width * 7, height, width, height);
		
		spell = new BufferedImage[5];
	
		spell[0]		= sheet.crop(0		  , 0, width, height);
		spell[1] 		= sheet.crop(width	  , 0, width, height);
		spell[2] 		= sheet.crop(width * 2, 0, width, height);
		spell[3] 		= sheet.crop(width * 3, 0, width, height);
		spell[4] 		= sheet.crop(width * 4, 0, width, height);
		
		
		energy_ball 	= sheet.crop(width * 5, 0, width, height);
		door_open 		= sheet.crop(width * 6, 0, width, height);
		door_closed 	= sheet.crop(width * 7, 0, width, height);
				
		lorann_bl		= sheet.crop(0		  , height, width, height);
		lorann_b		= sheet.crop(width 	  , height, width, height);
		lorann_br		= sheet.crop(width * 2, height, width, height);
		lorann_l		= sheet.crop(width * 3, height, width, height);
		lorann_r		= sheet.crop(width * 4, height, width, height);
		lorann_ul		= sheet.crop(width * 5, height, width, height);
		lorann_u		= sheet.crop(width * 6, height, width, height);
		lorann_ur 		= sheet.crop(width * 7, height, width, height);
		
		
		bone			= sheet.crop(0		  , height * 2, width, height);
		vertical_bone	= sheet.crop(width	  , height * 2, width, height);
		horizontal_bone	= sheet.crop(width * 2, height * 2, width, height);
		monster_1		= sheet.crop(width * 3, height * 2, width, height);
		monster_2		= sheet.crop(width * 4, height * 2, width, height);
		monster_3		= sheet.crop(width * 5, height * 2, width, height);
		monster_4		= sheet.crop(width * 6, height * 2, width, height);
		gold			= sheet.crop(width * 7, height * 2, width, height);
		
		the_void		= sheet.crop(0		  , height * 3, width, height);
	}
	
}

