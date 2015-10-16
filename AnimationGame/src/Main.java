
public class Main {

	public static void main(String[] args) {
		SimpleOval s1 = new SimpleOval(45,53,0,0);
		SimpleOval s2 = new SimpleOval(45,53,0,0);
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		
		/*Vertex v1 = new Vertex(43, 53);
		Vertex v2 = new Vertex(32, 4);
		System.out.println(v1.distance(v2));
		v2.normalize();
		System.out.println(v2.toString());
		System.out.println(v1.length());
		GeometricObject o5 = new GeometricObject(5);
		System.out.println(o5);
		
		GeometricObject o1 = new GeometricObject(17,4,new Vertex(42,23));
		GeometricObject o2 = new GeometricObject(17,4);
		GeometricObject o3 = new GeometricObject(17);
		GeometricObject o4 = new GeometricObject();
		
		System.out.println(o1.equals(o2));
		o2.moveTo(42,23);
		System.out.println(o1.equals(o2));
		System.out.println(o3.contains(new Vertex(10,3)));
		System.out.println(o4);*/

	}

}
