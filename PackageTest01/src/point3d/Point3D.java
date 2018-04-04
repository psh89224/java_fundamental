package point3d;
import point.Point;

public class Point3D extends Point{
	int z;
	
	public Point3D(int x, int y, int z) {
		super(x,y);
		//this.x=x;
		//this.y=y;
		this.z=z;
	}
	
	@Override
	public String getLocation() {
		return super.getLocation() + ", z = " +z;
	}

}
