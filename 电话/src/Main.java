import java.util.Scanner;

public class Main {
    // 静态方法，用于拨打电话，与品牌和型号无关
    public static void makeCall(String phoneNumber) {
        if (isValidNumber(phoneNumber)) {
            System.out.println("正在拨打电话: " + phoneNumber);
            // 这里可以添加实际的拨号逻辑，例如调用系统API进行拨号
        } else {
            System.out.println("无效的电话号码: " + phoneNumber);
        }
    }

    // 新增：回应用户的"可以给我打电话吗"请求
    public static void callMe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("当然可以给您打电话！");
        System.out.print("请输入您的电话号码: ");
        String phoneNumber = scanner.nextLine().trim();
        
        if (isValidNumber(phoneNumber)) {
            System.out.println("好的，我现在就给您打电话！");
            System.out.println("正在拨打您的电话: " + phoneNumber);
            System.out.println("电话接通中... 📞");
            System.out.println("您好！感谢您使用我们的电话服务！");
        } else {
            System.out.println("抱歉，您输入的电话号码格式不正确。");
            System.out.println("请输入11位中国手机号码（如：13800138000）");
        }
    }

    // 辅助方法，验证电话号码格式（支持11位中国手机号码）
    private static boolean isValidNumber(String phoneNumber) {
        // 验证中国手机号码：11位数字，通常以1开头
        return phoneNumber != null && phoneNumber.matches("1\\d{10}");
    }

    // 主方法，用于测试
    public static void main(String[] args) {
        System.out.println("=== 电话服务系统 ===");
        System.out.println("可以给我打电话吗？");
        System.out.println();
        
        // 调用新的"给我打电话"功能
        callMe();
        
        System.out.println();
        System.out.println("=== 其他测试 ===");
        // 调用静态方法拨打电话
        Main.makeCall("13800138000"); // 有效号码示例
        Main.makeCall("12345");        // 无效号码示例
    }
}