import java.util.ArrayList;

public class Euler1{
	public static void main(String [] args){
		Euler1 drive = new Euler1();
		ArrayList<Integer> countStore = drive.loopThrough();
		int sum = drive.countStore(countStore);
		System.out.println(sum);
	}
	ArrayList<Integer> loopThrough(){
		ArrayList<Integer> theArray = new ArrayList<Integer>();
		for	(int i=0; i < 1000; i++){
			if (((i % 3) == 0) || ((i % 5) == 0)) {
				theArray.add(i);
			}
		}
		return theArray;
	}	

	int countStore(ArrayList<Integer> theArray){
		int sum = 0;
		for (int i=0; i < theArray.size(); i++) {
			sum += theArray.get(i);
		}
		return sum;
	}
}