import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        System.out.println("请输入被除数");
        Scanner scanner=new Scanner(System.in);
        int b=scanner.nextInt();
        System.out.println("请输入除数");
        Scanner scanner1=new Scanner(System.in);
        int c=scanner1.nextInt();
        int i=0;
        while (b>=c){
            //int i=1;

            b=b-c;
            i+=1;
            //System.out.println(i);
        }
        System.out.println("余数是"+b);
        System.out.println("商是"+i);

    }
}