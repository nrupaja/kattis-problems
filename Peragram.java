import java.util.Scanner;

public class Peragram{
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String a = var.next().toLowerCase();

        int arr[] = new int[26];

        for(int m = 0; m<a.length(); m++){
            int index = getChar(a.charAt(m));
            arr[index]++;
        }

        if(a.length()%2 == 1){
            int count = 0;
            for(int m = 0; m<arr.length; m++){
                if(arr[m]%2 == 1 && arr[m] != 0){
                    count++;
                }
            }
            if(count>1){
                System.out.println(count-1);
            }
            else {
                System.out.println("0");
            }
        }
        else{
            int number = 0;
            for(int m = 0; m<arr.length; m++){
                if(arr[m]%2 == 1 && arr[m] != 0){
                    number++;
                }
            }
            if(number>0)
                System.out.println(number - 1);
            else System.out.println(number);
        }
    }
    public static int getChar(char newChar){
        return (newChar - 'a');
    }
}

