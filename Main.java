package ofİsDay2;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("Rojda Kayacan",13000,25);

        Salesperson employeeTwo = new Salesperson("irem",30000,23,.25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getComİssionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getComİssionPercentage());
        System.out.println();




    }
}
