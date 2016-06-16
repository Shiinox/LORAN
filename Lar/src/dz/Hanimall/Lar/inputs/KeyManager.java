package dz.Hanimall.Lar.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
	
	private boolean[] keys,key2;
	public boolean up, down, left, right,space,f;
	
	public KeyManager(){
		keys = new boolean[256];
		key2 = new boolean[256];
	}
	
	public void tick(){
		up = keys[KeyEvent.VK_Z];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_Q];
		right = keys[KeyEvent.VK_D];
		f = keys[KeyEvent.VK_F];
		space = key2[KeyEvent.VK_SPACE];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		key2[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		key2[e.getKeyCode()] = false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		key2[e.getKeyCode()] = true;
	}

	public void setSpace(boolean space) {
		this.space = space;
	}

}

