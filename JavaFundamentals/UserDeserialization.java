public class UserDeserialization {

    private String name;
    private int age;

    public UserDeserialization() {}

    public UserDeserialization(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public String getName() {
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

    public class Deserialization {

        UserDeserialization user=new UserDeserialization("Piyush",25);
        ObjectMapper mapper=new ObjectMapper();

        User user=mapper.readValue(str,UserSerialization.class) {
            System.out.println(user.getName()+","+user.getAge());
        }
    }
}
