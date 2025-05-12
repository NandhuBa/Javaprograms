package java_Task3_Programs;

public class Circle {

	 double rad;
     final double PI = Math.PI;
     double C;

     public double Circle()
     {
    	 rad = 1.0;
    	 return rad;
     }
	
     public double Circle(int rad, double PI)
     {
    	 this.rad = rad;
    	 return rad;
     }

     public double Circumference_Of_Circle()
     {
        C = 2*PI*rad;
        return C;
     }
	public static void main(String[] args) 
	
	{	
		Circle obj = new Circle();
		System.out.println("Constructor with no arguements - Radius is "+ obj.Circle());
		System.out.println("Constructor with two arguements - Another Radius is "+ obj.Circle(9,0));
		System.out.println("Circumference of the circle is : "+ obj.Circumference_Of_Circle());
		
	}

}
