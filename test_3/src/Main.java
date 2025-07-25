import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i=1;i<=num;i++)
        {
            if (i*i==num){
                System.out.println(i+"是平方根");
break;
            }
            else if (i*i>num){
                System.out.println("平方根是"+(i-1));
                break;
            }
        }
        }
    }