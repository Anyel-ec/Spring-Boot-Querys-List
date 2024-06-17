package top.anyel.querys.servicies_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.querys.repositories_appd.GenerateRepositoryAppd;

@Service
public class GenerateServiceAppd {

    @Autowired
    private GenerateRepositoryAppd generateRepositoryAppd;

    public int generateNumberRamdon() {
        return generateRepositoryAppd.generateNumberRamdon();
    }
}
