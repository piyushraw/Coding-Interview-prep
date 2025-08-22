
import com.fasterxml.jackson.databind.ObjectMapper;
public class UserSerialization {

    private String name;  // Instance variables
    private int age;

    public UserSerialization() {}   // default constructor

    public UserSerialization(String name, int age) { // parametrized constructor
             this.name=name;
             this.age=age;
    } 

    public String getName() {       // Getter and Setter methods
        return name;
    }
    public void setName(String name) {
            this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public class Serialization {

        UserSerialization user =new UserSerialization("Piyush",29);  
        ObjectMapper mapper=new ObjectMapper();

        String str=mapper.writeValueAsString(user);
        System.out.println(str);
    }
}
