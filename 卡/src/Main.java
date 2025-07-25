public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1234567890", "123456");
        System.out.println("卡号: " + card1.getCardNumber() + ", 密码: " + card1.getPassword());

        CreditCard card2 = new CreditCard("0987654321");
        System.out.println("卡号: " + card2.getCardNumber() + ", 密码: " + card2.getPassword());
    }
}
