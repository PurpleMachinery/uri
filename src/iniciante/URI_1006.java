package iniciante;
import java.util.Scanner;
public class URI_1006 {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		double A=entrada.nextDouble(), B=entrada.nextDouble(), C=entrada.nextDouble();
		A*=2;
		B*=3;
		C*=5;
		double MEDIA=A+B+C;
		MEDIA/=10;
		System.out.println(String.format("MEDIA = %.1f",MEDIA));
	}
}
