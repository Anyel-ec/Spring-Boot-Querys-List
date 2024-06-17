package top.anyel.querys.repositories_appd;

import org.springframework.stereotype.Repository;

@Repository
public class GenerateRepositoryAppd {

    public int generateNumberRamdon() {
        return (int) (Math.random() * 200);
    }
}
