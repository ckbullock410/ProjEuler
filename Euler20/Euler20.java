import java.math.BigInteger;

public class Euler20 {
     public static void main(String[] args){
        BigInteger factorial = new BigInteger("1");
        BigInteger one = new BigInteger("1");

        for (BigInteger i = new BigInteger("2"); i.compareTo(new BigInteger("101")) < 0 ; i = i.add(one)) {
            factorial = factorial.multiply(i);
        }

        String product = factorial.toString();
        long sum = 0;
        String value;

        for (int i = 0; i < product.length(); i++) {
            value = "" + product.charAt(i);
            sum += Long.parseLong(value);
        }

        System.out.println(sum);
     }
}