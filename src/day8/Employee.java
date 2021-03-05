package day8;

// Encapsulation- provides abstraction


    public class Employee {
    private String employeeName;
    private int employeeId;

    //setter- manual
   /* public void setEmployeeName(String employeeName){
       this.employeeName=employeeName;
    }

    //getter -manual
    public String getEmployeeName(){
        return employeeName;
    }*/

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


}
