import java.sql.SQLOutput;

public class Homework {

    public static void main (String[] args) {

     Author levTolstoy = new Author("Лев", "Толстой");
     Book warAndPeace = new Book("Война и мир", 1945, levTolstoy);
     warAndPeace.setPublishDate(1967);
     Author michailBulgakov = new Author("Михаил", "Булгаков");
     Book masterAndMargarita = new Book("Мастер и Маргарита", 2001, michailBulgakov);
     System.out.println(levTolstoy);
     System.out.println(warAndPeace);
     System.out.println(michailBulgakov);
     System.out.println(masterAndMargarita);
    }
}
