package iniciante;
import java.util.Scanner;
public class URI_1005 {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		double A=entrada.nextDouble(), B=entrada.nextDouble(), MEDIA;
		A*=3.5;
		B*=7.5;
		MEDIA=A+B;
		MEDIA/=11;
		System.out.println(String.format("MEDIA = %.5f",MEDIA));
	}
}
