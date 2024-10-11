package src.SingletonDesignPattern.toBreak.way1;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
*       1. By Reflation API to break a singleton pattern.
*       Solution:
*           1.if an object is there ==> throw exception from inside constructor.
*           2. Use enum
*
*
* */
public class ExDriver {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ExConnection c1 = ExConnection.getConnection();
        System.out.println(c1.hashCode());

        Constructor<ExConnection> constructor = ExConnection.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ExConnection c2 = constructor.newInstance();
        System.out.println(c2.hashCode());
    }
}
