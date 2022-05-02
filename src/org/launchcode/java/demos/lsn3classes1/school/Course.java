package org.launchcode.java.demos.lsn3classes1.school;

import java.util.HashMap;

public class Course {

    private String name;
    private int classTime;
    private HashMap<String, String> student = new HashMap<String, String>();

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //------------------------------------------------------------
    public int getClassTime(){
        return this.classTime;
    }
    public void setClassTime(int classTime){
        this.classTime = classTime;
    }
    //-------------------------------------------------------------

    public HashMap<String, String> getStudent() {
        return student;
    }

    public void setStudent(HashMap<String, String> student) {
        this.student = student;
    }

    //--------------------------------------------------------------
    public void Course(String name, int classTime, HashMap student){
        this.name = name;
        this.classTime = classTime;
        this.student = student;
    }
}
