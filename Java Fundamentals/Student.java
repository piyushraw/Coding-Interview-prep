import java.util.*;

public class Student implements Comparable<Student> {
    String id;
    String name;
    int age;
    String course;
    double grade;

    public Student(String id, String name, int age, String course, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }
    
    @Override
    public int compareTo(Student other) {
        return this.id.compareTo(other.id);  
    }

    public void print() {
        System.out.println(id + " | " + name + " | " + age + " | " + course + " | " + grade);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("S101", "Piyush", 30, "Computer Science", 7.5));
        students.add(new Student("S102", "Sneha", 27, "Electricals", 8.5));
        students.add(new Student("S103", "Sathu", 23, "Electronics", 9.5));
        students.add(new Student("S104", "Raj", 24, "Computer Science", 3.5));
        students.add(new Student("S105", "Prerna", 34, "Chemistry", 2.5));

        System.out.println("Default Sort by ID:");
        Collections.sort(students);
        for (Student s : students) s.print();

        System.out.println("\nSort by Grade (Descending):");
        Collections.sort(students, new GradeComparator());
        for (Student s : students) s.print();

        System.out.println("\nSort by Name:");
        Collections.sort(students, new NameComparator());
        for (Student s : students) s.print();
    }

}

class GradeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.grade, s1.grade); 
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); 
    }
}

