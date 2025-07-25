// 李四类，继承 Chef 并实现 CookingStyle 接口
public class LiSi extends A implements CookingStyle {
    // 构造方法
    public LiSi() {
        super("李四", "猪肉");
    }

    // 实现抽象方法 makeDish()
    public void makeDish() {
        System.out.println(name + "正在用炒的方式做他的拿手菜：" + specialty);
    }

    // 实现接口方法 getCookingStyle()
    public String getCookingStyle() {
        return "炒";
    }
}