package iniciante;
import java.util.Scanner;
public class URI_1010 {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		int a[]=new int[2], q[]=new int[2];
		double v[]=new double[2];
		a[0]=entrada.nextInt();
		q[0]=entrada.nextInt();
		v[0]=entrada.nextDouble();
		a[1]=entrada.nextInt();
		q[1]=entrada.nextInt();
		v[1]=entrada.nextDouble();
		v[0]*=q[0];
		v[1]*=q[1];
		v[0]+=v[1];
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", v[0]));
	}
}
