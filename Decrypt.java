import java.util.Scanner;

public class decrypt {
    public static void main(String a[]){
        
        Scanner sc = new Scanner(System.in);
        
        String cipher = sc.nextLine();
        String key = sc.nextLine();
        String originaltext = "";
        String newkey = "";
        
        for(int i=0, j=0; i<cipher.length(); i++){
            j = j%key.length();
            int value = (((((int)cipher.charAt(i)-(int)'A')-((int)key.charAt(j)-(int)'A'))%26));
            if(value<0)
            value+=26;
            value+=(int)'A';
            originaltext+=(char)value;
            newkey+=(char)value;
            j++;
            if((i+1)%key.length() == 0){
                key = newkey;
                newkey = "";
            }
        }
        System.out.println(originaltext);
    }
}