import java.util.ArrayList;
import java.util.Arrays;

public class Euler50 {
    private static int[] primes = new int[1000000];
    private static int[] condensedPrimes;
    private static int maxRun;
    private static int maxPrime;


     public static void main(String[] args){
          getPrimes();
          findSol();
          System.out.println(maxPrime);
          System.out.println(maxRun);
     }

     //produces a sieve of primes under 1,000,000
     private static void getPrimes(){
          ArrayList<Integer> myAL = new ArrayList<Integer>();
          for (int i = 0; i < primes.length; i++) {
              primes[i] = i;
          }
           for (int i = 2; i < primes.length; i++) {
              if (primes[i] != -1){
                myAL.add(primes[i]);
                for (int j = i+i; j < primes.length ; j += i) {
                    primes[j] = -1;
                }
              }
          }
          condensedPrimes = new int[myAL.size()];
          int j = 0;
          for (int i: myAL) {
              condensedPrimes[j] = i;
              j++;
          }
     }


     private static void findSol(){
         long sum = getSum(0);
         int consecutive = condensedPrimes.length;
         for (int startIndex = 0; startIndex < condensedPrimes.length; startIndex++){
             //progressively cut one off the start
            long copySum = sum;
            int copyCons = consecutive;
            for(int last = condensedPrimes.length-1; last > startIndex; last--){
                //progressively cut one of the end for each one cut off the start
                if(copyCons < maxRun) {
                    break;
                }
                else if(copySum < primes.length-1 && primes[(int) copySum] != -1){
                    //valid consecutive run found
                    //new best answer found
                        maxRun = copyCons;
                        maxPrime = (int) copySum;
                    
                } else{
                    //solution not found keep iterating down;
                    copySum -= condensedPrimes[last];
                    copyCons--;
                }
            }
            sum -= condensedPrimes[startIndex];
            consecutive--;
        }
     }

     private static long getSum(int start){
        long sum = 0L;
        for (int i = start; i < condensedPrimes.length; i++) {
            sum += condensedPrimes[i];
        }
        return sum;
     }
}


/* 

*/