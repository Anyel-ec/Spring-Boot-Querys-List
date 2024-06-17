package top.anyel.querys.repositories_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import top.anyel.querys.config_appd.AppEnvironment;

@Repository
public class RestConsumerRepository {

    private final String BASE_URL;
    private final RestTemplate restTemplate = new RestTemplate();

    @Autowired
    public RestConsumerRepository(AppEnvironment appEnvironment) {
        this.BASE_URL = appEnvironment.getBaseUrl();
    }

    public static void main(String[] args) {
        RestConsumerRepository restConsumer = new RestConsumerRepository(new AppEnvironment());
        System.out.println(restConsumer.BASE_URL);
    }
    public Integer getNumberAppd() {
        return restTemplate.getForObject(BASE_URL, Integer.class);
    }

}
