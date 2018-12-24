public class Euler6 {
    public static void main(String[] args){
        long sumOne = 0L;
        long sumTwo = 0L;
         for (int i = 1; i < 101; i++) {
             sumOne += i*i;
         }
         for (int j = 0; j < 101; j++) {
             sumTwo += j;
         }
         sumTwo *= sumTwo;
         long holder = (sumOne - sumTwo) > 0 ? sumOne-sumTwo : sumTwo-sumOne;
         
         System.out.println(holder);
    }
}