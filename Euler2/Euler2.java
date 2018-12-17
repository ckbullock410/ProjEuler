public class Euler2{
	public static void main(String args[]){
		Euler2 e3= new Euler2();
		e3.fibRecurse(0, 1, 0);
	}

	private void fibRecurse(int numOne, int numTwo, int sum){
		if (numTwo > 4000000){
			System.out.println(sum);
			return;
		} if (numTwo % 2 == 0){
			sum += numTwo;
		}
		fibRecurse(numTwo, numOne+numTwo, sum); 
	}
}
