import java.lang.Math;
import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int den = 1;
        int num = 1;

        while((num!=0) && (den!=0)) {

            num = sc.nextInt();
            den = sc.nextInt();

            if((num==0) && (den==0)){
                break;
            }

            int a = (int) Math.floor(num / den);
            int b = num % den;

            System.out.println(+a + " " + b + " / " + den + " ");
        }
    }
}