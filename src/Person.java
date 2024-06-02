import java.time.LocalDate;
import java.time.Period;

public class Person {
    int ngaySinh;
    int thangSinh;
    int namSinh;

    public int PredictAge() {
        LocalDate currentDate = LocalDate.of(2024, 6, 2);
        LocalDate birthDate = LocalDate.of(namSinh, thangSinh, ngaySinh);
        
        if (birthDate.isAfter(currentDate)) {
            return 0; 
        }
        return Period.between(birthDate, currentDate).getYears();
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.ngaySinh = 2;
        person1.thangSinh = 6;
        person1.namSinh = 2004;
        int tuoi = person1.PredictAge();
        System.out.printf("So tuoi la %d", tuoi);
    }
}