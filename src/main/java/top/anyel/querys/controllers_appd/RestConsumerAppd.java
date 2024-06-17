package top.anyel.querys.controllers_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.querys.servicies_appd.RestConsumerServiceAppd;

@RestController
@RequestMapping("/appd/random")
public class RestConsumerAppd {

    @Autowired
    private RestConsumerServiceAppd restConsumerServiceAppd;

    @GetMapping("/number")
    public Integer getNumberAppd() {
        return restConsumerServiceAppd.getNumberAppd();
    }

}
