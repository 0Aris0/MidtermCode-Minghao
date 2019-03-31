package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;

public class TestShape {
	
	// Rectangle:
	@Test
	public void Rec_Cons_Test() {
		Rectangle R = new Rectangle(1,2);
		Assert.assertEquals(true, R instanceof Rectangle);
	}
	@Test
	public void getLength_Test() {
		Rectangle R = new Rectangle(1,9);
		Assert.assertEquals(9,R.getLength());
	}
	@Test
	public void setLength_Test() {
		Rectangle R = new Rectangle(2,2);
		R.setLength(3);
		assertTrue(3 == R.getLength());
	}
	@Test
	public void getWidth_Test() {
		Rectangle R = new Rectangle(2,3);
		Assert.assertEquals(2,R.getWidth());
	}
	@Test
	public void setWidth_Test() {
		Rectangle R = new Rectangle(3,5);
		R.setWidth(1);
		Assert.assertTrue(1 == R.getWidth());
	}
	@Test
	public void Rec_Area_Test() {
		Rectangle R = new Rectangle(2,8);
		Assert.assertTrue(16 == R.area());
	}
	@Test
	public void Rec_perimeter_Test() {
		Rectangle R= new Rectangle(3,7);
		Assert.assertTrue(20 == R.perimeter());
	}
	@Test
	public void compare_Test() {
		Rectangle r1 = new Rectangle(3,3);
		Rectangle r2 = new Rectangle(4,4);
		Rectangle r3 = new Rectangle(3,3);
		Rectangle r4 = new Rectangle(1,1);
		assertEquals(-1,r1.compareTo(r2));
		assertEquals(0,r1.compareTo(r3));
		assertEquals(1,r1.compareTo(r4));
		
	}
	// Cuboid:
	@Test
	public void Cuboid_Cons_Test() {
		Cuboid c = new Cuboid(1,2,3);
		Assert.assertEquals(true, c instanceof Cuboid);
	}
	@Test
	public void volumeTest() {
		Cuboid c = new Cuboid(2,3,4);
		assertEquals(c.volume(),24);
	}

	@Test
	public void gettersTest() {
		Cuboid c = new Cuboid(1,3,5);
		Assert.assertTrue((c.getDepth()==5)&&(c.getLength()==3)&&(c.getWidth()==1));
	}
	@Test
	public void settersTest() {
		Cuboid c = new Cuboid(2,2,3);
		c.setWidth(7);
		c.setLength(8);
		c.setDepth(9);
		Assert.assertTrue((c.getDepth()==9)&&(c.getLength()==8)&&(c.getWidth()==7));
	}
	@Test
	public void areaTest() {
		Cuboid Cube = new Cuboid(1,1,1);
		assertEquals(Cube.area(), 6);
	}
	@Test
	public void ExceptionTest() {
		try{
			Cuboid c = new Cuboid(2,4,5);
			c.perimeter();
		}
		catch(IllegalArgumentException e) {		
		}
	}
	@Test 
	public void sortByAreaTest() {
		Cuboid cA = new Cuboid(1,2,3);
		Cuboid cB = new Cuboid(4,5,6);
		SortByArea Sort = cA.new SortByArea();
		
		Assert.assertTrue(Sort.compare(cA, cB) >=0);
		Assert.assertTrue(Sort.compare(cB, cA) < 0);
		
	}
	@Test
	public void sortByVolumeTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid(4,5,6);
		SortByVolume Sort = c1.new SortByVolume();
		
		Assert.assertTrue(Sort.compare(c1, c2) < 0);
		Assert.assertTrue(Sort.compare(c2, c1) >=0);
		
	}
	
	
}
	
	
	
	