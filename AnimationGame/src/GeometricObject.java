
public class GeometricObject {

	public Vertex pos;
	public double height;
	public double width;
	
	
	public GeometricObject(double width, double height, Vertex pos){
		this.pos=pos;
		this.width=width;
		this.height=height;
		
		if(this.width<0){
			this.width = -this.width;
			pos.x = pos.x -this.width;
		}
		if(this.height<0){
			this.width = -this.height;
			pos.y = pos.y -this.height;
		}
	}
	
	public GeometricObject(double width, double height){
		this(width, height, new Vertex(0,0));
	}
	public GeometricObject(double width){
		this(width, width);
	}
	public GeometricObject(Vertex pos){
		this(0,0,pos);
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public Vertex getPos(){
		return pos;
	}
	public String toString(){
		return "width="+width+" , height="+height+", pos="+pos;
	}
	
	
}
