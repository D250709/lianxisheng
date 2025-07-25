// 自定义异常类，继承自 RuntimeException
public class PunchClockException extends RuntimeException {
    public PunchClockException(String message) {
        super(message); // 调用父类的构造方法，传递错误信息
    }
}
