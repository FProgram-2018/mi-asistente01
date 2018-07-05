import java.util.Scanner;
import java.util.Scanner;
public class Ara03{
	
		static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
		 
		int mat [][] = {{5,6,7},{ 5,6,7},{5,6,7}};
		
		
		
		
	System.out.println(lasuma(mat));

		}
		public static int lasuma(int mat [][]) {
		int sumadiagonal=0;
		for (int x=0;x<3;x++){
			sumadiagonal = sumadiagonal + mat [x] [2 - x];
		
		}
		return sumadiagonal;
		
	}


	}
		
	

	

	
	
