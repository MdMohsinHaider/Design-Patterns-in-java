package src.SingletonDesignPattern;

public class Connection {
    // Create connection container non-primitive data type "Connection".
    private static Connection connection;

    // make constructor will be Private
    private Connection(){}

    // A public method created.
    public static Connection getConnection(){

        // check the connection Container is Impiety or not.
        if (connection == null){

            // For thread safety
            synchronized (Connection.class){

                // Create a Single object when connection container has no object or null.
                connection = new Connection();
            }
        }
        // when already container has an object, then return an object.
        return connection;
    }
}
