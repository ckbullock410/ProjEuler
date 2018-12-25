public class Euler40 {
     public static void main(String[] args){
          int runningTotal = 0;
          int num = 1;
          int product = 1;
          int multiplier = 1;
          while (runningTotal <= 1000000){
            if (runningTotal < multiplier && (runningTotal + (Integer.toString(num).length())) >= multiplier){
                // the digit is in this iteration
                int temp = runningTotal;
                for (int i = 0; i < (Integer.toString(num)).length(); i++) {
                    if (temp + 1 == multiplier){
                        int hold = Integer.parseInt("" + (Integer.toString(num).charAt(i)));
                        System.out.println(hold);
                        product *= hold;
                        multiplier *= 10;
                        break;
                    }
                    temp++;
                }
            }
            runningTotal += (Integer.toString(num)).length();
            num++;
          }
          System.out.println(product);
     }
}