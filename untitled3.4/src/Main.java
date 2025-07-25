//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int n=1;
        while (true){
            if (n%5==1){
                int a=(n-1)/5*4;
                if (a%5==2){
                    int b=(a-2)/5*4;
                    if (b%5==3){
                        int c=(b-3)/5*4;
                        if (c%5==4){
                            int d=(c-4)/5*4;
                            if (d%5==0&&d>0){
                                break;
                            } } } } }
            n++;
        }
        System.out.println(n);
    }
}