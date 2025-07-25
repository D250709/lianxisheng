// 张三类，继承 Chef 并实现 CookingStyle 接口
public class ZhangSan extends A implements CookingStyle {
    // 构造方法
    public ZhangSan() {
        super("张三", "鱼肉");
    }

    // 实现抽象方法 makeDish()
    public void makeDish() {
        System.out.println(name + "正在用蒸的方式做他的拿手菜：" + specialty);
    }

    // 实现接口方法 getCookingStyle()
    public String getCookingStyle() {
        return "蒸";
    }
}