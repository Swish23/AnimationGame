
public class Square extends GeometricObject{
	public Square (double w, Vertex pos){
		super(w, w, pos);
	}
	public Square (double w, double y){
		super(w,w, new Vertex(0,0));
	}
	
	@Override public double area() {return width*width;}
	
	@Override public String toString(){
		return "SimpleOval("+super.toString()+")";}
	
	public @Override boolean equals(Object that) {
		return (that instanceof Square) && super.equals(that);
	}
}

