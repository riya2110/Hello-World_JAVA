import java.util.Scanner;

class volume
	{
		double radius,volume;
		
		double sphereVolume(double radius)
		{
			volume=(4.0/3.0)* Math.PI * Math.pow (radius,3);
			return 0;
		}

		public static void main(String[] args)
		{
			volume v = new volume();	
			Scanner sc = new Scanner(System.in);

			double radius,vol;
			radius=sc.nextDouble();
			
			vol=v.sphereVolume(radius);

			System.out.printf("Volume of Sphere is %f",vol);
		}
	};
	
	