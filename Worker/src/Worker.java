import java.time.Year;

public class Worker {
    String name;
    String birthDate;
    String endDate;
    
    public Worker(){

    }
    public Worker(String name,String birthDate){
        this.name = name;
        this.birthDate = birthDate;

    }

   
    public int getAge(){
        int currentYear = Year.now().getValue();
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear-birthYear;


    }
    public double collectPay(){
        return 0.0;

    }
    public void terminate (String endDate){
        this.endDate = endDate;
    }
    public String toString(){
        int age= getAge();
        return " Name : "+ name +" Birth Date : "+ birthDate +" Age : "+ age +" End Date : "+endDate;

    }
    public static void main(String[] args) {
        Worker worker = new Worker("fidaa","07-06-2006");
        worker.terminate("20-06-2024");
        System.out.println(worker.toString());
    }
    
}