import java.util.*;

public class StudentData {
    String id;
    String name;
    int age;
    String course;
    double grade;
    
    // studentData constructor
    public StudentData(String id, String name, int age, String course, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentData)) return false; 
        StudentData s = (StudentData) o;
        return this.name.equals(s.name);
    }
    
    // override hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name); 
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + course + " | " + grade;
    }

    public static void main(String[] args) {
        Set<StudentData> students = new HashSet<>(); 

        students.add(new StudentData("S101", "Piyush", 30, "CS", 7.5));
        students.add(new StudentData("S102", "Sneha", 27, "EE", 8.5));
        students.add(new StudentData("S103", "Raj", 22, "ME", 9.0));
        students.add(new StudentData("S105", "Piyush", 31, "CS", 6.0)); // same ID

        for (StudentData s : students) {
            System.out.println(s); 
        }
    }
}
