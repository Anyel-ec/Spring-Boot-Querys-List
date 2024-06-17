package top.anyel.querys.models_appd;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


@Data
public class PersonAppd {
    private Long id_appd ;
    private String name_appd = "";
    private LocalDate birthdate_appd;
    private String identification_appd;
    private double salary_appd;
    private String city_appd;

    public PersonAppd() {
    }

    public PersonAppd(Long id_appd, String name_appd, LocalDate birthdate_appd, String identification_appd, double salary_appd, String city_appd) {
        this.id_appd = id_appd;
        this.name_appd = name_appd;
        this.birthdate_appd = birthdate_appd;
        this.identification_appd = identification_appd;
        this.salary_appd = salary_appd;
        this.city_appd = city_appd;
    }

}
