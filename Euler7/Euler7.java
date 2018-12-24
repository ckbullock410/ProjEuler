public class Euler7 {
     public static void main(String[] args){
          int primeCount = 1;
          long currentNum = 3L;
          while(primeCount < 10001){
            primeCount = (isPrime(currentNum)) ? primeCount + 1 : primeCount;
            currentNum += 2;
          }
          currentNum -= 2;
          System.out.println(currentNum);
     }

     private static boolean isPrime(long num){
          for (int i = 2; i*i <= num; i ++) {
              if (num % i == 0) return false;
          }
          return true;
     }
}