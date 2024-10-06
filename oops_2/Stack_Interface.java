package oops_2;

public interface Stack_Interface extends DynamicStack_Interface,Data_Structure_Interface {//A
    public void push(int item);
    public int pop();
    public int peek();
    public static final int x=9;
//    default void fun(){
//
//    }
//    public static int fun1(){ //JAVA8 FEATURE
//        return 0;
//    }
//    private static int fun2(){ //JAVA9 FEATURE
//        return 0;
//    }
}
