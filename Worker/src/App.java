public class App {
    public static void main (String[] args) throws Exception {
        Employee agus = new Employee("Agus", "11/11/1995", "01/01/2021");
        System.out.println(agus);
        System.out.println((agus.getAge()==29?"Correct Agus's getAge()":"Wrong Agus's getAge()"));
        System.out.println((agus.collectPay()==0.0?"Correct Agus's collectPay()":"Wrong Agus's collectPay()"));

        SalariedEmployee adi = new SalariedEmployee("Adi", "11/11/1993", "03/03/2021", 60000000);
        System.out.println(adi);
        System.out.println((adi.collectPay()==5000000.0?"Correct Adi's collectPay()":"Wrong Adi's collectPay()")); adi.retire();
        System.out.println(adi);
        System.out.println((adi.collectPay()==1500000.0?"Correct Adi's collectPay() after retire":"Wrong Adi's collectPay() after retire"));
        HourlyEmployee asep = new HourlyEmployee("Asep", "05/05/1997", "03/03/2021",50000);
        System.out.println(asep);
        System.out.println((asep.collectPay()== 8650000.0?"Correct Asep's collectPay()":"Wrong Asep's collectPay() after retire"));
        System.out.println((asep.getDoublePay()==17300000.0?"Correct Asep's getDoublePay() ":"Wrong Asep's getDoublePay()"));
    }
}
    