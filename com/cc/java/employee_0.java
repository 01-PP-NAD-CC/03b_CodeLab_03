package com.cc.java;
public class employee_0 {
    private String familyName;
    private String firstName;
    private int birthYear;
    protected String workID;
    protected String department;
    protected String role;
    protected int hiredYear;
  
    public employee_0 (String familyName, String firstName, int birthYear, String workID, 
                       String department, String role, int hiredYear){
                            this.familyName = familyName;
                            this.firstName = firstName;
                            this.birthYear = birthYear;
                            this.workID = workID;
                            this.department = department;
                            this.role = role;
                            this.hiredYear = hiredYear;
                        }

public String getFamilyName() {
    return this.familyName;
}

public String getFirstName() {
    return this.firstName;
}

public int getBirthYear() {
    return this.birthYear;
}

public void setFamilyName(String familyName) {
    this.familyName = familyName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
}


public void hasLunch() {
    System.out.println("Hi, I'm " + this.firstName + " " + this.familyName + " and I'm having lunch!");
}

public void startsWork() {
    System.out.println("Hi, I'm " + this.firstName + " " + this.familyName + " I'm starting my work at the accouting department!");
}

public void getEmployedTime() {
    System.out.println("Hi, I'm " + this.firstName + " " + this.familyName + " and I've been working here for " + this.hiredYear + ".");
    ;
}
}