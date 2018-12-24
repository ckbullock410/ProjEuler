public class Euler4{
   private static int maxPalin = 0;
   
   public static void main(String[] args){
        Euler4 e4 = new Euler4();
        e4.findLargePalindrome();
        System.out.println(maxPalin);
   }

   private void findLargePalindrome(){
        for(int i = 100; i < 1000; i++){
            for (int j = 100; j < 1000; j++){
                maxPalin = ((i*j) > maxPalin && checkPalin(i*j)) ? i*j : maxPalin;
            }
        }
   }

   private boolean checkPalin(int num){
        String check = Integer.toString(num);
        for (int i = 0, j = (check.length()-1); i < j; i++, j--) {
            if (check.charAt(j) != check.charAt(i)) return false;
        }
        return true;        
   }

}