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

    // 辅助方法，验证电话号码格式（简单示例）
    private static boolean isValidNumber(String phoneNumber) {
        // 这里可以添加更复杂的电话号码验证逻辑
        return phoneNumber != null && phoneNumber.matches("\\d{10}");
    }

    // 主方法，用于测试
    public static void main(String[] args) {
        // 调用静态方法拨打电话
        Main.makeCall("13800138000"); // 有效号码示例
        Main.makeCall("12345");        // 无效号码示例
    }
}