package mysql_test;

public class MySQL_Test {

    public static void main(String[] args) {
        MySQL db = new MySQL();
        db.MySQLConnection("root", "", "");
        db.createDB("Test_MySQL");
        db.createTable("Registros");
        db.insertData("Registros", "7-708-846", "Antony", "Garcia", "22", "M");
        
    }

}
