import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        if (sc%2==0||sc%3==0||sc%5==0||sc%7==0){
            System.out.println(sc+"是合数");
        }else {
            System.out.println("是质数");
        }
    }
}