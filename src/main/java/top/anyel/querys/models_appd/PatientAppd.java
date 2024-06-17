package top.anyel.querys.models_appd;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PatientAppd {
    private String name_appd;
    private String lastName_appd;
    private String identification_appd;
    private String birthdate_appd;
    private String province_appd;
    private String city_appd;
    private String address_appd;
    private List<VisitAppd> visits_appd;

}
