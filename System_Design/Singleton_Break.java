package System_Design;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton_Break {
    public static void main(String[] args) throws Exception {
        Student_info s= Student_info.GetInstance();
//        Student_info s1= new Student_info();
        Constructor<Student_info>ct= Student_info.class.getDeclaredConstructor();
        ct.setAccessible(true); // true means private ko public nd vice versa
        Student_info s1= ct.newInstance();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

    }
}
