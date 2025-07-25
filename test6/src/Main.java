import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int i=0;
        int j=0;
        for (i=1;i<=a;i++){
            for(j=1;j<=i ;j++){
                System.out.print("*");
            }
System.out.println();

        }
    }
    }