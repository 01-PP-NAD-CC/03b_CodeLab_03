package com.cc.java;
public class emp_Accounting extends employee_0{
    
    public emp_Accounting(String familyName, String firstName, int birthYear, String workID, String department,
            String role, int hiredYear) {
        super(familyName, firstName, birthYear, workID, department, role, hiredYear);
     
    }

    public void doYourJob() {
        System.out.println("callsCustomer");
    }
}