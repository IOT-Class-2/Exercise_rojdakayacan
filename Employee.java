package ofİsDay2;

public class Employee {  // 'public' bu sınıfın her yerden erişebilir olduğunu belirtir.

    private String name ; // 'private' bu değişkenin sadece bu sınıfn içinden erişilebilir olduğunu belirtir

    protected double salary; // bu değişkene aybı paklet içerisinden veya alt sınıflardan erişilebilir

    private int age ; // 'private' bu değişkenin sadece bu sınıfın içinden  erişilebilir olduğunu belirtir

    public Employee(String name , double salary , int age) { // Bu sınıfın bir örneği oluşturulurken çağrılan metotttur .
        this.name = name; // "name" parametresini sınıfın 'name' değişkenine atar
        this.salary = salary; // "salary" parametresini sınıfın 'salary' değişkenine atar
        this.age = age; // "age" parametresini sınıfın 'age' değişkenine atar

    }


    // getter and setter metotları
    // Bu metodlar , özel değişkenlerin değerlerini dış dünyaya (başka sınıflara yani ) vermek için kullanılır .

    public String getName(){
        return this.name;

    }
    protected double getSalary(){
        return this.salary;
    }

    private int getAge(){
        return this.age;
    }

    public void raiseSalary(){ // çalışanın maaşını artıran metot
        this.salary=this.salary*1.2; // yüzde 20 oranında maaşı artırır
    }


}
