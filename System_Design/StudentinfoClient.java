package System_Design;

public class StudentinfoClient {
    public static void main(String[] args) throws Exception{
        Student_info s= Student_info.GetInstance();
        Student_info s1= Student_info.GetInstance();
        System.out.println(s1.hashCode());
        System.out.println(s.hashCode());
    }
}
