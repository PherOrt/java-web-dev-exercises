package org.launchcode.java.demos.lsn3classes1.school;

import java.util.HashMap;

public class Course {

    private String name;
    private int classTime;
    private HashMap<String, String> student = new HashMap<String, String>();

    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }
    //------------------------------------------------------------
    public int getClassTime(){
        return classTime;
    }
    public void setClassTime(int aClassTime){
        classTime = aClassTime;
    }
    //-------------------------------------------------------------

    public HashMap<String, String> getStudent() {
        return student;
    }


    public void setStudent(HashMap<String, String> aStudent) {
        student = aStudent;
    }

    //--------------------------------------------------------------
    public void Course(String name, int classTime, HashMap student){
        this.name = name;
        this.classTime = classTime;
        this.student = student;
    }
}
