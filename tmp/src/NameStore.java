import java.io.*;

class NameStore implements Serializable {
    private String firstName;
    private transient String middleName;
    private String lastName;
    public NameStore (String fName,
                      String mName,
                      String lName){
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
    }
    public String toString(){
        StringBuffer sb = new StringBuffer(40);
        sb.append("First Name : ");
        sb.append(this.firstName);
        sb.append("Middle Name : ");
        sb.append(this.middleName);
        sb.append("Last Name : ");
        sb.append(this.lastName);
        return sb.toString();
    }


    public static void main(String args[]) throws Exception {
        NameStore nameStore = new NameStore("Steve", "Middle","Jobs");
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("tygrys"));
        // writing to object
        o.writeObject(nameStore);
        o.close();

        // reading from object
        ObjectInputStream in =new ObjectInputStream(new FileInputStream("tygrys"));


        NameStore nameStore1 = (NameStore)in.readObject();
        System.out.println(nameStore1);
    }
}