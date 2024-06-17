package top.anyel.querys.controllers_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.querys.servicies_appd.RestConsumerService;

@RestController
@RequestMapping("/pokemon")
public class RestConsumer {

    @Autowired
    private RestConsumerService restConsumerService;

    @GetMapping("/{id}")
    public String getPokemon(@PathVariable int id) {
        return restConsumerService.getPokemon(id);
    }

}
