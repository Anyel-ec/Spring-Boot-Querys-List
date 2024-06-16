package top.anyel.querys.models_appd;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


@Data
@AllArgsConstructor
public class PersonAppd {
    private Long id_appd;
    private String name_appd;
    private LocalDate birthdate_appd;
    private String identification_appd;
    private int age_appd;
    private double salary_appd;
    private String city_appd;

}
