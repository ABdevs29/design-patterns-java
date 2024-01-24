package singleton;

public class Main {
    public static void main (String [] args) {

        DatabaseConnection dbc = DatabaseConnection.getInstance();
        DatabaseConnection dbc1 = DatabaseConnection.getInstance();

    }
}
