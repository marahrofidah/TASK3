public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary){
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;

    }
    public double collectPay(){
        if(isRetired){
            return annualSalary *0.3 / 12;

        }else{
            return annualSalary / 12;
        }
    }
    public void retire(){
        this.isRetired = true;
        this.terminate("20/06/2024");
    }
}
