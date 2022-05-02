package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn3classes1.school.Course;
import org.launchcode.java.demos.lsn3classes1.school.Student;
import org.launchcode.java.demos.lsn3classes1.school.Teacher;


import java.util.HashMap;

public class SchoolPractice {

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student student1 = new Student();
        student1.setName("Chris");
        student1.setStudentId(18);
        student1.setNumberOfCredits(1);
        student1.setGpa(4.0);

        Student student2 = new Student();
        student2.setName("Rosemary");
        student2.setStudentId(23);
        student2.setNumberOfCredits(1);
        student2.setGpa(4.0);

        Course course1 = new Course();
        course1.setName("Math");
        course1.setClassTime(700);

        HashMap<String, String> student = course1.getStudent();
        //String newStudent = "Chris";
        String newStudentLast = "Ortega";
        student.put(student1.getName(), newStudentLast);
        student.put(student2.getName(), newStudentLast);

        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Donna");
        teacher1.setLastName("Kurk");
        teacher1.setSubject("Sewing");
        teacher1.setYearsTeaching(20);

        //members.put(student1.getName(),student1.getStudentId());
        //members.put(student2.getName(),student2.getStudentId());
        System.out.println("Student: "+ student.keySet().toArray()[0]+ ", " + "Class Start: " + course1.getClassTime());
        System.out.println("Student: "+ student.values().toArray()[0]+ ", " + "Class Start: " + course1.getClassTime());
        System.out.println(student.keySet().toArray()[0]);
        System.out.println("First Name: " + teacher1.getFirstName() +"\nLast Name: "+  teacher1.getLastName() + "\nSubject: " + teacher1.getSubject() + "\nYears Teaching: " +teacher1.getYearsTeaching());

    }

}
