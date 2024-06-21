public class HourlyEmployee extends Employee {
private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate){
         super(name, birthDate, hireDate);
         this.hourlyPayRate = hourlyPayRate;
    }
    public double collectPay(){
        return 8*5*52/12*hourlyPayRate;

    }
    public double getDoublePay(){
        return 2* collectPay();
    }

}
