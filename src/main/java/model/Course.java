package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Course {
    private int id;
    private String name;
    private Professor professor;
    private Map<Integer, Student> studentList;

    public Course(int id, String name, Professor professor, Map<Integer, Student> studentList) {
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.studentList = studentList;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Map<Integer, Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Map<Integer, Student> studentList) {
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course: \n[studentList=" + studentList + ", \nName=" + name + ", \nprofessor=" + professor + "]";
    }

/*    public static void main(String[] args) {
        Map<Integer, Student> a = new LinkedHashMap<Integer, Student>();
        a.put(1, new Student(1, "AA"));
        a.put(2, new Student(1, "AB"));
        a.put(3, new Student(1, "AC"));
        Course c = new Course(1, "mat", new Professor(1, "prof.AAAA"), a);
        System.out.println(c);
    }*/
}
