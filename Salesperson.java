package ofİsDay2;

public class Salesperson extends Employee {
    private double comİssionPercentage;

    public Salesperson(String name , double salary , int age, double comİssionPercentage){
        super(name, salary, age);
        this.comİssionPercentage=comİssionPercentage;

    }

    public double getComİssionPercentage() {
        return this.comİssionPercentage;
    }

    public void raiseCommission(){
        if (this.comİssionPercentage<.30){
            this.comİssionPercentage=comİssionPercentage*1.2;

        }
    }





}
