package com.sakthi.nasa.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for Position.
 *  
 * @author Sakthi
 */
public class PositionTest {

	/**
	 * +VE: Test constructor
	 */
	@Test
	public void testPositionConstructor() {
		int x = 5;
		int y = 6;
		int orientation = 1;
		Position pos = new Position(x, y, orientation);
		assertEquals(x, pos.getX());
		assertEquals(y, pos.getY());
		assertEquals(orientation, pos.getOrientation());
	}
	
}
