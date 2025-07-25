import   java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            // 获取当前时间
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String currentTimeStr = sdf.format(now);
            System.out.println("当前时间：" + currentTimeStr);

            // 定义截止打卡时间（早上9点）
            String deadlineStr = "09:00:00";
            Date deadline = sdf.parse(deadlineStr);

            // 比较当前时间与截止时间
            if (now.after(deadline)) {
                // 如果当前时间晚于截止时间，抛出自定义异常
                throw new PunchClockException("超过早9点不允许打卡");
            } else {
                System.out.println("打卡成功！");
            }
        } catch (PunchClockException e) {
            // 捕获自定义异常并输出错误信息
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // 捕获其他可能的异常
            e.printStackTrace();
        }
    }
}