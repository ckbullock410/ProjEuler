public class Euler10 {
    private static int primes[] = new int[2000001];
    private static long sum = 0;
     public static void main(String[] args){
        for (int i = 0; i < primes.length; i++) {
            primes[i] = i;
        }
        primes[1] = 0;
        for (int i = 2; i < primes.length; i++) {
            elimFromPrimes(i);
        }
        for (int i = 0; i < primes.length; i++) {
            sum += primes[i];
        }
        System.out.println(sum);
     }
     
     private static void elimFromPrimes(int multiplier){
        for (int i = multiplier*2; i < primes.length; i+= multiplier) {
            primes[i] = 0;
        }
        //System.out.println(multiplier + " Eliminated");
     }
}