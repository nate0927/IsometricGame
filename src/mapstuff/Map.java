package mapstuff;

import java.util.ArrayList;

import org.newdawn.slick.Graphics;

import entitystuff.Entity;
import entitystuff.EntityList;

public class Map {
	public static enum Direction {NORTH,SOUTH,EAST,WEST};
	public final EntityList entities;
	private int[][] tiles;
	private final Boundaries bounds;

	public Map(int[][] data, Boundaries bounds) {
		this.tiles = data;
		entities = new EntityList();
		this.bounds = bounds;
	}
	public Map(int[][] data, Boundaries bounds, ArrayList<Entity> entities) {
		this.tiles = data;
		this.entities = new EntityList();
		this.bounds = bounds;
	}
	
	public Map(int[][] data){
		this.tiles=data;
		entities=new EntityList();
		bounds = new Boundaries(0,0,tiles.length,tiles[0].length);
	}
	
	public void render(int xLoc, int yLoc, Graphics g){
		
	}
	public int getTile(int x, int y) {
		return tiles[x][y];
	}

	/**
	 * 
	 * @param x
	 *            the x index of the tile
	 * @param y
	 *            the y index of the tile
	 * @return whether or not the tile is walkable
	 */

	public int getWidth() {
		return tiles.length;
	}

	public int getHeight() {
		return tiles[0].length;
	}

	/**
	 * The class used in Map to determine the x and y boundaries that the player
	 * and other entities can walk within.
	 * 
	 * @author RevNate
	 * 
	 */
	public static class Boundaries {
		/**
		 * Give th
		 * 
		 * @param xLow
		 *            The west most (upper-left) tile that can be walked in.
		 * @param xHigh
		 *            The east most (lower-right) tile that can be walked in.
		 * @param yLow
		 *            The north most (upper-right) tile that can be walked in.
		 * @param yHigh
		 *            The South most (lower-left) tile that can be walked in.
		 */
		public Boundaries(int xLow, int xHigh, int yLow, int yHigh) {

		}
	}
}