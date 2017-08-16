package iniciante;
import java.util.Scanner;
public class URI_1008 {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		int nf=entrada.nextInt(), hr=entrada.nextInt();
		double salario=entrada.nextDouble();
		salario*=hr;
		System.out.println("NUMBER = "+nf);
		System.out.println(String.format("SALARY = U$ %.2f",salario));
	}
}
