import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int  count=0;
        for (int i=1;i<=2019;i++){
            String j=i+"";
            char[] chars=j.toCharArray();
            for (int a=0;a<chars.length;a++){
                if (chars[a]=='0'||chars[a]=='1'||chars[a]=='2'||chars[a]=='9'){
                 count++;
                 break;
                }
            }

        }
        System.out.println(count);
    }
}