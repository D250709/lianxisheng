//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.printf("Hello and welcome!");
        System.out.println(" ");

for (int i=1;i<=10000;i++){
    String str = Integer.toString(i);
    // 计算 i 的立方并将其转换为字符串
    long cube = (long) i * i * i;
    String str2 = Long.toString(cube);
    // 检查 str2 是否以 str 结尾
    boolean endsWith = str2.endsWith(str);
    // 打印结果
    System.out.println("i: " + i + ", i^3: " + str2 + ", endsWith: " + endsWith);
    }
    }
}