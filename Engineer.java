package ofİsDay2;

public class Engineer extends Employee { // 'extends' Employee , Engineer classını(sınıfının) Employee sınıfından miras aldığını gösterir
    //Employee sınıfından miras aldığını belirtir .Yani 'Engineer' sınıfının tüm özelliklerine ve metotlarına sahip oluır




    public Engineer (String name ,double salary,int age){  //Bu sınıfın örneğini oluşturulurken çağırılan metodudur
        super(name, salary, age);// 'Employee! sınıfının yapıcı metotunu çağırır. 'name' , 'salary' , 'age' parametrelerini 'Employee' sınıfına iletir

    }
    // Constructor =>Yapıcı metot
    public double getAnnualBonus(){ // Engineer'in yıllık bonusunu hesaplayan metottur . Ve bu metotu döndürür
        return super.salary*.05;// Bu metot Employee sınıfından alınan maaş/salary değişkenine erişir
        //Ne ile erişir ? => super anahtar kelimesi ile eişir
        // Metotun genel işlevi ise maaşın %5'ini hesaplar ve döndürür . Bu Engineer'in yıllık bonusunu belirler .
    }

}
