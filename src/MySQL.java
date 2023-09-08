import java.util.Scanner;
public class MySQL {
    Scanner scanner = new Scanner(System.in);
    public Group[] date = new Group[5];
    public void insert(int id, String name, String lastname, int age) {
        Group g1 = new Group();
        g1.id = id;
        g1.name = name;
        g1.lastname = lastname;
        g1.age = age;
        date[id-1] = g1;
    }
    public void pTable(){
        String Table = "id\t Name\t Lastname\t Age \n";
        for (int i = 0; i<date.length;i++){
            Table += date[i].id + "\t" +date[i].name + "\t" + date[i].lastname + "\t" + date[i].age + "\n";

        }
        System.out.printf(Table);
    }

    public void select(int idOfTable){
        idOfTable--;
        System.out.println(date[idOfTable].id + "\t" + date[idOfTable].name + "\t" + date[idOfTable].lastname + "\t" + date[idOfTable].age);
    }
    public void update(){
        int test = scanner.nextInt();
        select(test);
        String loh = scanner.next();
        String loh2 = scanner.next();
        int test2 = scanner.nextInt();
        insert(test, loh, loh2, test2);
        pTable();
    }
    public void findCommand(){
        while (true){
            System.out.println("");
            String scan = scanner.next();
            if (scan.equals("UPDATE")){
                update();
            } else if (scan.equals("INSERT")) {
                insert(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
                pTable();
            } else if (scan.equals("DELETE")) {
                break;
            } else if (scan.equals("SELECT")) {
                select(scanner.nextInt());
            }
        }
    }
}