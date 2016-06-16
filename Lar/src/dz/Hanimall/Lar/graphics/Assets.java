package dz.Hanimall.Lar.graphics;

import java.awt.image.BufferedImage;



public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage energy_ball, door_open, door_closed,
								lorann_bl, lorann_b, lorann_br, lorann_l, lorann_r, lorann_ul, lorann_u, lorann_ur,
								bone, vertical_bone, horizontal_bone, monster_1, monster_2, monster_3, monster_4, gold,
								the_void;
	
<<<<<<< HEAD
	public static BufferedImage[] lorann,spell,cave_wakeUp,cave_south;

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/sprite.png"));
		/*SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/cavemonster_wakeUp_strip.png"));
		SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/cavemonster_south_strip.png"));
		
		cave_wakeUp = new BufferedImage[18];
		
		cave_wakeUp[0]		= sheet2.crop(0, 0, 246, 255);
		cave_wakeUp[1]		= sheet2.crop(246, 0, 246, 255);
		cave_wakeUp[2]		= sheet2.crop(246 * 2 , 0, 246, 255);
		cave_wakeUp[3]		= sheet2.crop(246 * 3, 0, 246, 255);
		cave_wakeUp[4]		= sheet2.crop(246 * 4, 0, 246, 255);
		cave_wakeUp[5]		= sheet2.crop(246 * 5, 0, 246, 255);
		cave_wakeUp[6]		= sheet2.crop(246 * 6, 0, 246, 255);
		cave_wakeUp[7]		= sheet2.crop(246 * 7, 0, 246, 255);
		cave_wakeUp[8]		= sheet2.crop(246 * 8, 0, 246, 255);
		cave_wakeUp[9]		= sheet2.crop(246 * 9, 0, 246, 255);
		cave_wakeUp[10]	= sheet2.crop(246 * 10, 0, 246, 255);
		cave_wakeUp[11]	= sheet2.crop(246 * 11, 0, 246, 255);
		cave_wakeUp[12]	= sheet2.crop(246 * 12, 0, 246, 255);
		cave_wakeUp[13]	= sheet2.crop(246 * 13, 0, 246, 255);
		cave_wakeUp[14]	= sheet2.crop(246 * 14, 0, 246, 255);
		cave_wakeUp[15]	= sheet3.crop(0, 0, 170, 200);
		cave_wakeUp[16]	= sheet3.crop(170, 0, 170, 200);
		cave_wakeUp[17]	= sheet3.crop(170 * 2, 0, 170, 200);
		
		cave_south = new BufferedImage[3];
		
		
		cave_wakeUp[0]		= sheet3.crop(0, 0, 170, 200);
		cave_wakeUp[1]		= sheet3.crop(170, 0, 170, 200);
		cave_wakeUp[2]		= sheet3.crop(170 * 2, 0, 170, 200);
		
		*/
		
		
		
=======
	public static BufferedImage[] lorann,spell;

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/sprite.png"));
>>>>>>> 2e98471451f9a6e590be1405d8a5abdbaa087ad0
		
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

