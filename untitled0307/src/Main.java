import java.util.HashSet;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int i=0;
        while (true){
            HashSet<Object>set=new HashSet<>();
            int ping=i*i;
            int li=i*i*i;
            String string=""+ping+li;
            if (string.length()==10){
                char[]cs=string.toCharArray();
                for (int j=0;j<10;j++){
                    set.add(cs[j]);
                }
                if (set.size()==10){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}