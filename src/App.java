import core.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        Connection connect1 = Database.getInstance();
        Connection connect2 = Database.getInstance();

    }
}