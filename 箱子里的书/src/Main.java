public class Main{
public static void main(String[] args) {

    int shelfBooks = 30;
    int boxBooks = 40;
    int a = Book.Table(shelfBooks, boxBooks);
    System.out.println("箱子里书的总数是: " + a + "本");
}
}