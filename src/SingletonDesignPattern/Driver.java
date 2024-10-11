package src.SingletonDesignPattern;

public class Driver {
    public static void main(String[] args) {
        Connection c1 = Connection.getConnection(); // object 1
        Connection c2 = Connection.getConnection(); // object 2

        System.out.println(c1.hashCode()); // same object
        System.out.println(c2.hashCode()); // same object
    }
}
