package iniciante;
import java.util.Scanner;
public class URI_1007 {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		double a[]=new double[4];
		for(int i=0;i<4;i++) {
			a[i]=entrada.nextDouble();
		}
		a[0]=a[0]*a[1]-a[2]*a[3];
		System.out.println(String.format("DIFERENCA = %.0f",a[0]));
		
	}
}