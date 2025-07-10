package com.example.hibernate;
import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public Student() {}

    public Student(int student_id,String name, int age) {
        this.student_id=student_id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public int getId() { return student_id;}

    public String getName() { return name;}
    public void setName(String name) { this.name = name;}

    public int getAge() { return age;}
    public void setAge(int age) { this.age = age;}
}
