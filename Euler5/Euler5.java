public class Euler5 {
    public static void main(String[] args){
     System.out.println(findDividen());  
    }
    private static int findDividen(){
        int i = 20;
        while(true){
           if (i % 19 == 0 && i % 18 == 0 && i % 17 == 0 && i % 16 == 0 && i % 14 == 0 && i % 13 == 0 && i % 11 == 0) return i;
           i += 20;
        }
    }
}
