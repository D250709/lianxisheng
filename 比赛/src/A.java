// 抽象类 Chef，包含姓名和拿手菜属性，以及做菜的抽象方法
public abstract class A{
    protected String name;        // 姓名
    protected String specialty;  // 拿手菜

    // 构造方法
    public A(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // 获取姓名
    public String getName() {
        return name;
    }

    // 获取拿手菜
    public String getSpecialty() {
        return specialty;
    }

    // 抽象方法：做菜
    public abstract void makeDish();
}
