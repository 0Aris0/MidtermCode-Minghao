package pkgShape;

public class Rectangle extends Shape {

	private int iLength;
	private int iWidth;
	
	public Rectangle(int iWidth, int iLength){
		
		this.iWidth = iWidth;
		this.iLength = iLength;
		if(iLength <= 0 || iWidth <= 0){
			throw new IllegalArgumentException();
		}
	}
	public int getWidth(){
		return iWidth;
	}
	public void setWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	public int getLength(){
		return iLength;
	}
	public void setLength(int iLength) {
		this.iLength = iLength;
	}
	@Override
	public double area() {
		return iWidth*iLength;
	}
	@Override
	public double perimeter() {
		return (iWidth*2+iLength*2);
	}
	
	public int compareTo(Object myObject) {
		Rectangle myR = (Rectangle) myObject;
		return(Double.compare(this.area(), myR.area()));
	}
	

}
