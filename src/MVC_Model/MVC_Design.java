package MVC_Model;
public class MVC_Design {
   private String Employee_Name;
    private int Employee_Id;
    private String Employee_Department;
    public String getEmployee_Name(){
        return Employee_Name;
    }
    public int getEmployee_Id(){
        return Employee_Id;
    }
    public String getEmployee_Department(){
        return Employee_Department;
    }
    public void setEmployee_Name(String name){
        Employee_Name = name;
    }
    public void setEmployee_Id(int Id){
        Employee_Id = Id;
    }
    public void setEmployee_Department(String Department){
        Employee_Department = Department;
    }
    
}




