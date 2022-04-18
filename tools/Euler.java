import hoverball.math.*;
public class Euler {
	public static void main(String[] args) {
		Matrix D1 = Matrix.rotX(Integer.parseInt(args[0]) * Math.PI/180.0);
		Matrix D2 = Matrix.rotY(Integer.parseInt(args[1]) * Math.PI/180.0);
		Matrix D3 = Matrix.rotZ(Integer.parseInt(args[2]) * Math.PI/180.0);		
		Matrix R = D1.mul(D2.mul(D3));
		
		Vector V =  Sphere.euler(R);
		
		System.out.println("{"+(int)(V.x * 180.0/Math.PI)+"}{"+(int)(V.y * 180.0/Math.PI)+"}{"+(int)(V.z * 180.0/Math.PI)+"}");		
	}
}
