public class Employee{
   
   //Constructor
   private String name;
   private double salary;
   
   public Employee(String employeeName, double currentSalary){
       name = employeeName;
       salary = currentSalary;
    }
  
    //method
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double byPercent){
        salary = salary + salary * byPercent;
    }

}
