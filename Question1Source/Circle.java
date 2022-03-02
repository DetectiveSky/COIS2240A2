public class Circle extends GeometricObject{ //Add three fields
	double x;
	double y;
	double radius;
	public Circle() {
		x=0;
		y=0;
		radius=1;
	}
	public Circle(String name, String colour,boolean fill,double centrex,double centrey,double r) 
	{ super(name,colour,fill);
             x=centrex;
             y=centrey;
             radius=r;
	}
	public void printCentre() {
		System.out.print("with a ("+ x + "," + y + ") centre "); /** Return radius */
       //Complete your code here
	}
	public double getRadius()
	{//get the value of r
		return radius;
	}
	public double getArea()
	{//calculate and return the circle's area
		return Math.PI*radius*radius;
	}
	public void report() { 
		System.out.print(" circle ");
	}
      /** Return area */
      //Complete your code here
	public String toString() {
		return "I'm a circle. I was cloned from geometric parent. So I'm geo. object too. " + "\n" + super.toString()+"\nMy area is "+getArea(); }
}