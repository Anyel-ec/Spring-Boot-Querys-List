package top.anyel.querys.servicies_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.querys.repositories_appd.RestConsumerRepository;

@Service
public class RestConsumerServiceAppd {
    @Autowired
    private RestConsumerRepository restConsumerRepository;

    public Integer getNumberAppd() {
        return restConsumerRepository.getNumberAppd();
    }



}
