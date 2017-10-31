package com.example.henry.scheduleiit;

/**
 * Created by Henry on 10/30/2017.
 */

public class CRNDatabase extends AddCRNActivity {
    /*
    in this class, the mongoDB database will be created and populated each row has the
    CRN (65820),
    ClassName (Internet Application Development),
    Department (ITM/CS/CE/BIOL),
    ClassNumber (101),
    Section (1),
    TimeOfClass (in 24h time, i.e. 1350 - 1505), and
    DaysOfWeek (the abbreviations are Su,Mo,Tu,We,Th,Fr,Sa -- Multiple days would be MoWeFr)
    */

    public int crn, classNumber, section, timeOfClass;
    public String className, department, daysOfClass;

    //getters
    public int getCRN(){
        return crn;
    }

    public int getClassNumber(){
        return classNumber;
    }

    public int getSection(){
        return section;
    }

    public int getTimeOfClass(){
        return timeOfClass;
    }

    public String getClassName(){
        return className;
    }

    public String getDepartment(){
        return department;
    }

    public String getDaysOfClass(){
        return daysOfClass;
    }

    //setters
    public void setCrn(int crn) {
        this.crn = crn;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setTimeOfClass(int timeOfClass) {
        this.timeOfClass = timeOfClass;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDaysOfClass(String daysOfClass) {
        this.daysOfClass = daysOfClass;
    }
}
