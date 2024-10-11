package src.SingletonDesignPattern.toBreak.way2;

public class ExConnection {
    // Create connection container non-primitive data type "Connection".
    private static ExConnection connection;

    // make constructor will be Private
    private ExConnection(){}

    // A public method created.
    public static ExConnection getConnection(){

        // check the connection Container is Impiety or not.
        if (connection == null){

            // For thread safety
            synchronized (ExConnection.class){

                // Create a Single object when connection container has no object or null.
                connection = new ExConnection();
            }
        }
        // when already container has an object, then return an object.
        return connection;
    }
}
