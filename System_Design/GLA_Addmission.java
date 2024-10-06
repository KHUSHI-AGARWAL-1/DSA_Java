package System_Design;

public class GLA_Addmission {
    private Student s; //student class
    private int count_subject;
    public GLA_Addmission(Student s){
        this.s=s;
    }
    public int Addmission_fee(Student s, int c){
        return c*1000+s.age*7;
    }
    public void Print_Admission_Receipt(){}
    public void Save_DataBase(){

    }

}
