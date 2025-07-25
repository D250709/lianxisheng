//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        int day=0;
        while (true){
            sum+=i;
            day++;
            if (sum>=108){
                break;
            }
            i+=2;
        }
System.out.println(day);
        }
    }
