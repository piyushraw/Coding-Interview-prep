import java.util.*;

public class StudentManager implements Comparable<StudentManager> {
    String id;
    String name;
    int age;
    String course;
    double grade;

    public StudentManager(String id, String name, int age, String course, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }
    
    @Override
    public int compareTo(StudentManager other) {
        return this.id.compareTo(other.id);  
    }

    public void print() {
        System.out.println(id + " | " + name + " | " + age + " | " + course + " | " + grade);
    }

    public static void main(String[] args) {
        List<StudentManager> students = new ArrayList<>();

        students.add(new StudentManager("S101", "Piyush", 30, "Computer Science", 7.5));
        students.add(new StudentManager("S102", "Sneha", 27, "Electricals", 8.5));
        students.add(new StudentManager("S103", "Sathu", 23, "Electronics", 9.5));
        students.add(new StudentManager("S104", "Raj", 24, "Computer Science", 3.5));
        students.add(new StudentManager("S105", "Prerna", 34, "Chemistry", 2.5));

        System.out.println("Default Sort by ID:");
        Collections.sort(students);
        for (StudentManager s : students) s.print();

        System.out.println("\nSort by Grade (Descending):");
        Collections.sort(students, new GradeComparator());
        for (StudentManager s : students) s.print();

        System.out.println("\nSort by Name:");
        Collections.sort(students, new NameComparator());
        for (StudentManager s : students) s.print();
    }

}

class GradeComparator implements Comparator<StudentManager> {
    public int compare(StudentManager s1, StudentManager s2) {
        return Double.compare(s2.grade, s1.grade); 
    }
}

class NameComparator implements Comparator<StudentManager> {
    public int compare(StudentManager s1, StudentManager s2) {
        return s1.name.compareTo(s2.name); 
    }
}

