
public class fibonacci {

	public static void main(String[] args) {

		System.out.println(printFibo(8));

		factorial f = new factorial();
		System.out.println(f.fact(7));
	}

	static int printFibo(int n) {

		if (n <= 2) 
			return 1;

		
		return printFibo(n - 1) + printFibo(n - 2);
	}

}
