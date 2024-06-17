package top.anyel.querys.utils;
import java.time.LocalDate;
import java.time.Period;
public class AgeCalculator {
    public static int calculateAge(LocalDate birthdate) {
        if (birthdate == null) {
            return 0; // o lanzar una excepción si es necesario
        }
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

}
