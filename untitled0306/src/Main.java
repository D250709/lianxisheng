import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String string = "0100110001010001";
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                String s = string.substring(i, j + 1);
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
}



