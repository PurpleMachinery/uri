package iniciante;
import java.util.Scanner;
public class URI_1002 {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		double x=entrada.nextDouble();
		x=x*x;
		x*=3.14159;
		System.out.println(String.format("A=%.4f",x));
	}
}
