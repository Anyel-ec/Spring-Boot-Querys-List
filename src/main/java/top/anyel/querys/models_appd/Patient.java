package top.anyel.querys.models_appd;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Patient {
    private Long id;
    private String name;
    private String lastName;
    private String identification;
    private String birthdate;
    private String province;
    private String city;
    private String address;
    private String phone;
    private String email;
    private List<Visit> visits;

}
