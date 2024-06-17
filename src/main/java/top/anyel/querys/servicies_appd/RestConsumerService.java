package top.anyel.querys.servicies_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.querys.repositories_appd.RestConsumerRepository;

@Service
public class RestConsumerService {

    @Autowired
    private RestConsumerRepository restConsumerRepository;

    public String getPokemon(int id) {
        return restConsumerRepository.getPokemon(id);
    }


}
