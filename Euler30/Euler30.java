public class Euler30 {
     public static void main(String[] args){
          int sum = 0;
          //comput array of the quint powers
          int[] myArray = new int[10];
          for (int i = 0; i < 10; i++) {
              myArray[i] = i*i*i*i*i;
          }
          // find max we need to calculate up to
          int k = 100000; // start at 100k to eliminate pointless iterations
          while(myArray[9]*(Integer.toString(k)).length() > k){
            k += 10;
          }
          // we now have a max that is no more than 9 greater than the entries we need to test

         int hold = 0;
         String holdr;
         String temp;
         for (int i = 11; i <= k; i++) {
             hold = 0;
             holdr = Integer.toString(i);
             for (int j = 0; j < holdr.length(); j++) {
                 temp = "" + holdr.charAt(j);
                 hold += myArray[Integer.parseInt(temp)];
                 if (hold > i) break;
             }
            if (hold == i) sum += hold;
         }
         System.out.println(sum);
     }
}