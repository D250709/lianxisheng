public class CreditCard {
    private String cardNumber;
    private String password;

    public CreditCard(String cardNumber, String password) {
        this.cardNumber = cardNumber;
        this.password = password;
    }

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
        this.password = "123321"; // 默认密码
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

}
