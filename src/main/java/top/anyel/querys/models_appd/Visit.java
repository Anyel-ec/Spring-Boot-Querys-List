package top.anyel.querys.models_appd;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class Visit {
    private Long id_appd;
    private LocalDate date_appd;
    private String description_appd;

}
