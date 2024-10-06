package System_Design;

public class Student_info {
//    String name="kaju";
//    int age=28;
//public Student_info(String name,int age){
//        this.name=name;
//        this.age=age;
//    }

    //Eager.... prblm-> no matter method called or not it will create instance
//    static Student_info s= new Student_info();
//    private Student_info(){}
//    public static Student_info GetInstance(){
//        return s;
//    }
    //solution to eager->bill pugh
//    public static class Student_Inner{
//      public final   static Student_info s= new Student_info();
//    }
//    private Student_info(){}
//    public static Student_info GetInstance(){
//        return Student_Inner.s;
//    }

//   Lazzzyyy ---> bekar in case of thread becoz ek sath many can create
//    static Student_info s;
//    private Student_info(){}
//    public static Student_info GetInstance(){
//        if(s==null){
//            s=new Student_info();
//        }
//        return s;
//    }


    //synchronised -> jb tk ek thread critical sec m other will wait but ek block ko
    // na krke entire method ko sync krta h jo ki nhi chahiye
//    static Student_info s;
//    private Student_info(){}
//    synchronized public static Student_info GetInstance(){
//        if(s==null){
//            s=new Student_info();
//        }
//        return s;
//    }

    //double locking-> memory loss hoga kyuki database m inconsistency aa jaegi 4
    // kyuki main mem m imeediate chnges ni reflect honge
    // iska solution h shared resource ko volatile bna do isse dusra instance bnte
    // tym main memory m check krega phle

//    static Student_info s;
//    private Student_info(){}
//     public static Student_info GetInstance(){
//        synchronized (Student_info.class) {
//            if (s == null) {
//                s = new Student_info();
//            }
//        }
//        return s;
//    }

    //solution to memory loss in double locking
    static volatile Student_info s;
    private Student_info()throws Exception{
        if(s!=null){
            throw new Exception("object is already created");
        }
    }
    public static Student_info GetInstance() throws Exception {
        synchronized (Student_info.class) {
            if (s == null) {
                s = new Student_info();
            }
        }
        return s;
    }
}
