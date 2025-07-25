import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //System.out.println(a);
        int num=0;
        int temp=a;
        while(a!=0){
            int i=a%10;
            a=a/10;
            num=num*10+i;
        }
        //System.out.println("");
        System.out.println("改变后的数字"+num);
    System.out.println(temp==num);
    }

    }