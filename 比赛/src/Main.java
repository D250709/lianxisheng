// 主类，包含比赛的逻辑
public class Main {
    public static void main(String[] args) {
        // 创建参赛者对象
        ZhangSan zhangSan = new ZhangSan();
        LiSi liSi = new LiSi();

        // 输出参赛者信息
        System.out.println("-------比赛开始-------");
        System.out.println(zhangSan.getName() + "做的是" + zhangSan.getSpecialty());
        System.out.println("===========><===========");
        System.out.println(liSi.getName() + "做的是" + liSi.getSpecialty());
        System.out.println("===========><===========");
        // 模拟做菜过程
        zhangSan.makeDish();
        liSi.makeDish();
        System.out.println("===========><===========");
        // 模拟评委投票
        System.out.println("比赛结束，评委投票");
        System.out.println(zhangSan.getName());
        System.out.println(liSi.getName());
        System.out.println(zhangSan.getName());
        System.out.println(liSi.getName());
        System.out.println(zhangSan.getName());
        System.out.println("   >"+zhangSan.getName() + "胜");

        // 输出做菜风格
        System.out.println(zhangSan.getName() + "的做菜风格是：" + zhangSan.getCookingStyle());
        System.out.println(liSi.getName() + "的做菜风格是：" + liSi.getCookingStyle());
    }
}