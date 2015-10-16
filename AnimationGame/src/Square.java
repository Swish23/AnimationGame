
public class Square extends GeometricObject{
	public Square (double w, double h, Vertex pos){
		super(w, h, pos);
	}
	public Square (double w, double h, double x, double y){
		super(w,h, new Vertex(x,y));
	}
	
	@Override public double area() {return height*width;}
	
	@Override public String toString(){
		return "SimpleOval("+super.toString()+")";}
	
	public @Override boolean equals(Object that) {
		return (that instanceof SimpleOval) && super.equals(that);
	}
}

