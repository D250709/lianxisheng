import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 2; // 质数从2开始

        while (list.size() <= 2022) {
            boolean isPrime = true;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(num);
            }
            num++;
        }

        System.out.println(list.get(2022));
    }
}

