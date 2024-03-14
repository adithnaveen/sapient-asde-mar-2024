package com.naveen;

public class BusinessLogic {

    public String sayHi(String name) {
        return "hi " + name;
    }

    public String returnSlowHi(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return "hi " +name;
    }

    /**
     *
     * @param empId
     * @param empName
     * @return boolean
     * @author Naveen
     * @see will insert the record to mysql db
     */
    public boolean insertRecord(int empId, String empName) {
        if(empName.length()< 6) {
            // TODO replace with your exception
            throw  new RuntimeException("Sorry Name Too small");
        }
        return true;
    }

}
