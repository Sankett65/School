package com.school;
import java.util.ArrayList;

//Write a Java program to create a class called "School"
// with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes
public class School {
    private String student;
    private String teacher;
    private int classes;
    private static ArrayList<School> list=new ArrayList<School>();

    public School(String student, String teacher, int classes) {
        this.student = student;
        this.teacher = teacher;
        this.classes = classes;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "School{" +
                "student='" + student + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classes=" + classes +
                '}';
    }

    public static void addStudent(School stu){
        list.add(stu);
    }
    public static void addTeacher(School tec){
        list.add(tec);
    }
    public static void removeStudent(School stu){
        list.remove(stu);
    }
    public static void removeTeacher(School tec){
        list.remove(tec);
    }

    public static ArrayList<School> getList(){
        return list;
    }


}
class SchoolMain{
    public static void main(String[] args) {
        School s=new School("Sanket","Sachin",7);
        School s1=new School("Swapnil","Raghav",8);
        School s2=new School("Sanky","Rohit",10);
        School s3=new School("Swap","Shubham",9);

        School.addStudent(s);
        School.addStudent(s1);
        School.addStudent(s2);
        School.addStudent(s3);

        ArrayList<School> list=School.getList();
        //System.out.println(School.getList());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("\nAfter Removing Student");
        School.removeStudent(s);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("\nAfter Removing Teacher");
        School.removeTeacher(s2);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}

