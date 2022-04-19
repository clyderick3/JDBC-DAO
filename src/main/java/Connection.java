public class Connection {

    public static final String URL = "jdbc:mysql://localhost:3306/DataModel";
    public static final String USER = "testuser";
    public static final String PASS = "testpass";

    //Get connection to database. Return Connection object.

    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (SQLException ex){
                throw new RuntimeException("Error connecting to the database", ex);
            }
        }
    }
