package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	private int iDepth;
	public Cuboid(int iWidth, int iLength, int iDepth){
		super(iWidth, iLength);
		this.iDepth = iDepth;
		if(iDepth <= 0)
			throw new IllegalArgumentException();
	}
	public int getDepth(){
		return iDepth;
	}
	public void setDepth(int newDepth){
		iDepth = newDepth;
	}
	public double volume(){
		return  (iDepth * super.getWidth()*super.getLength());
	}
	@Override
	public double area(){
		return ((super.getLength() * super.getWidth() + iDepth * super.getLength() + iDepth * super.getWidth())*2);
	}
	@Override
	public double perimeter(){
		throw new IllegalArgumentException();
	}
	@Override
	public int compareTo(Object myObj){
		Cuboid myCuboid = (Cuboid) myObj;
		return Double.compare(myCuboid.area(),this.area());
	}
	class SortByArea implements Comparator<Cuboid>{
		SortByArea(){
		}
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return c1.compareTo(c2);
		}
	}
	class SortByVolume implements Comparator<Cuboid>{

		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.volume() - c2.volume());
		}
	}
}
	