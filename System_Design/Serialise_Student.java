package System_Design;

import java.io.*;

public class Serialise_Student implements Serializable {
    String s="Khushi";
    int name=24;
    public Serialise_Student (){}
//    public Object readResolve(){
//Singleton pattern ko break hone se bchata h

//    }

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Serialise_Student s= new Serialise_Student();
        String file="\"C:\\Users\\DELL\\OneDrive\\Documents\\Output.txt\"";
        FileOutputStream fo= new FileOutputStream(file); //file open in write mode
        ObjectOutputStream os=new ObjectOutputStream(fo);
        os.writeObject(s);
        System.out.println("Hello");
        FileInputStream fi= new FileInputStream(file);
        ObjectInputStream io= new ObjectInputStream(fi);
        Serialise_Student s1= (Serialise_Student) io.readObject();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());


    }
}
