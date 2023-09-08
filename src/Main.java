import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySQL mySQL = new MySQL();
        mySQL.insert(1,"Манго","Маргинал",36);
        mySQL.insert(2,"Фома", "Фоманов",42);
        mySQL.insert(3,"Арс",  "Ай",20);
        mySQL.insert(4,"Давид","Романов",69);
        mySQL.insert(5,"Макс", "Терешенко",12);
        mySQL.pTable();
        mySQL.findCommand();
    }
}