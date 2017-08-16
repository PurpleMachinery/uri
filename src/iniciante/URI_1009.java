package iniciante;
import java.util.Scanner;
public class URI_1009 {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		String nome=entrada.next();
		double salario=entrada.nextDouble(), venda=entrada.nextDouble();
		venda/=100;
		venda*=15;
		venda+=salario;
		System.out.println(String.format("TOTAL = R$ %.2f",venda));
		
	}
}
