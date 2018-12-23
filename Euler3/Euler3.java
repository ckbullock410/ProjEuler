public class Euler3 {
    private long maxPrimeFactor = 0;
    public static void main(String[] args){
        long num = 600851475143L;
        Euler3 e3 = new Euler3();
        e3.Factor(num);
        System.out.println(e3.maxPrimeFactor);
    }

    private void Factor(long num){
       for (int i = 2; i*i < num; i++){
            if (num % i == 0){
                System.out.println("factor:" + i);
                if(num/i > maxPrimeFactor)
                    Factor((long)(num/i));
                if(i > maxPrimeFactor)
                    Factor((long) i);
                return;
            }
       }
       //this means the Factor is prime, check if it's max
       maxPrimeFactor = num;
    }
    
}