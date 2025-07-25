import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner intput1 = new Scanner(System.in);
        System.out.println("请选择舱位: ");
        System.out.println("1.头等舱");
        System.out.println("2.经济舱");
        int num1 = intput1.nextInt();
        Scanner intput = new Scanner(System.in);
        System.out.println("请输入查询月份: ");
        int num = intput.nextInt();
        int a = 60000;
        double tou;
        double jin;
        switch (num1) {
            case 1:
                if (num >= 4 && num <= 11) {
                    tou = a * 0.9;
                    System.out.println("当前季节为旺季:");
                    System.out.println("头等舱价格为：" + tou);
                }
                if ((num >= 1 && num <= 3) || num == 12) {
                    tou = a * 0.5;
                    System.out.println("当前季节为淡季:");
                    System.out.println("头等舱价格为：" + tou);
                }
                else{
                    System.out.println("输错了,月都不认识");
                }
                break;
            case 2:
                if (num >= 4 && num <= 11) {
                    jin = a*0.8;
                    System.out.println("当前季节为旺季:");
                    System.out.println("头等舱价格为：" + jin);
                }
                if ((num >= 1 && num <= 3) || num == 12) {
                    jin = a * 0.4;
                    System.out.println("当前季节为淡季:");
                    System.out.println("经济舱价格为:" + jin);
                }
                else{
                    System.out.println("输错了,月都不认识");
                }1
            default:
                System.out.println("都不对撒");
                break;

        }
    }
}
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        System.out.println("请输入查询月份: ");
        int num = intput.nextInt();
        int a = 60000;
        double tou;
        double jin;
        if (num >= 4 && num <= 11) {
            tou = a * 0.9;
            jin = a*0.8;
            System.out.println("当前季节为旺季:");
            System.out.println("头等舱价格为：" + tou);
            System.out.println("经济等舱价格为：" + jin);
        }
        else {
            tou = a * 0.5;
            jin = a*0.4;
            System.out.println("当前季节为淡季:");
            System.out.println("头等舱价格为：" + tou);
            System.out.println("经济舱价格为：" + jin);
        }
        }
    }
*/