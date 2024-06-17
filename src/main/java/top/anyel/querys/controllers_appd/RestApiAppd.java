package top.anyel.querys.controllers_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.anyel.querys.servicies_appd.GenerateServiceAppd;

@RestController
@RequestMapping("/appd/number")
public class RestApiAppd {
    @Autowired
    private GenerateServiceAppd generateServiceAppd;
    @GetMapping("/generateNumberRamdon")
    public int generateNumberRamdonAppd() {
        return generateServiceAppd.generateNumberRamdon();
    }

}
