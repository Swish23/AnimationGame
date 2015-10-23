import java.awt.Color;
public class Square extends GeometricObject{
	public Square (double w, Vertex pos, Color color){
		super(w, w, pos, color);
	}
	public Square (double w, double y, Color color){
		super(w,w, new Vertex(0,0), color);
	}
	
	@Override public double area() {return width*width;}
	
	@Override public String toString(){
		return "SimpleOval("+super.toString()+")";}
	
	public @Override boolean equals(Object that) {
		return (that instanceof Square) && super.equals(that);
	}
}

