package pl.vlad.fbird;

import java.awt.Graphics;


public interface Column {
	
	public int getX();
	public int getH();
	public void randHeight();
	public abstract void paint(Graphics g);
	public void decrementX();
	public void replayX();
	
}
