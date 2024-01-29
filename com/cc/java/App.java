package com.cc.java;

public class App {
  
    public static void main(String[] args) {   

    emp_Accounting emp_Accounting1 = new emp_Accounting("Müller", "Max", 1980, "ID123", "Buchhaltung", "Manager", 2005);
    
    System.out.println(emp_Accounting1.getFamilyName());
    System.out.println(emp_Accounting1.getFirstName());
    System.out.println(emp_Accounting1.getBirthYear());

  
    }

    
    
        private static void output(String outStr) {
        System.out.println(outStr);
    }


}
