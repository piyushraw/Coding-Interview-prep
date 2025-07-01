public class Student {

   // 5 attributes
       String id;
       String name;
       int age;
       String course;
       double grade;

       Student(String id, String name, int age, String course, double grade) {
              this.id=id;
              this.name=name;
              this.age=age;
              this.course=course;
              this.grade=grade;     
       }
        void printStudentDetails() {

                System.out.println("Id:"+ id);
                System.out.println("Name:"+ name);
                System.out.println("Age:"+  age);
                System.out.println("Course:"+ course);
                System.out.println("Grade:"+ grade);

                System.out.println();
        }

        public static void main(String[] args) {

            Student s1=new Student("S101","Piyush",30,"Computer Science",7.5);
            Student s2=new Student("S102","Sneha",27,"Electricals",8.5);
            Student s3=new Student("S103","Sathu",23,"Electronics",9.5);
            Student s4=new Student("S104","Raj",24,"Computer Science",3.5);
            Student s5=new Student("S105","Prerna",34,"Chemistry",2.5);

            s1.printStudentDetails();
            s2.printStudentDetails();
            s3.printStudentDetails();
            s4.printStudentDetails();
            s5.printStudentDetails();
        }
}

       
