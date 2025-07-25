/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入行数：");
    int N = sc.nextInt();
    for (int i = 1; i <=N; i++) {
        for(int j =1;j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}*/
import java.util.HashMap;//将数据以键值对的形式存储，可以通过键快速访问相应的值
import java.util.Map;//当你在代码中使用与键值对相关的数据结构时，例如 HashMap，就需要引入 Map 接口。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入字符串
        System.out.print("请输入一个字符串: ");
        String input = scanner.nextLine();

        // 调用方法计算重复字符
        Map<Character, Integer> charCountMap = countCharacters(input);

        // 输出结果
        System.out.println("字符重复次数:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    // 计算每个字符的出现次数
    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}