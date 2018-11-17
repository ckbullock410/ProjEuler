public class Euler3{
	public static void main(String args[]){
		Euler3 e3 = new Euler3();
		e3.fib(4000000);	
	}
	private void fib(int cap){
		int sum = 0;
		int j = 0;
		int i = 1;
		int temp = 0;
		while (temp < cap){
			temp = i+j;
			if (temp % 2 == 0){
				sum += temp;
			}
			j = i;
			i = temp;
		}
		System.out.println(sum);
	}
}	
