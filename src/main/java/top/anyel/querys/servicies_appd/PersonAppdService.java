package top.anyel.querys.servicies_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.querys.models_appd.PersonAppd;
import top.anyel.querys.repositories_appd.PersonRepositoryAppd;

import java.util.List;

@Service
public class PersonAppdService {
    @Autowired
    private PersonRepositoryAppd personRepositoryAppd;

    public PersonAppd save (PersonAppd personAppd) {
        return personRepositoryAppd.savePersonAppd(personAppd);
    }


    public List<PersonAppd> getPersonsAppd() {
        return personRepositoryAppd.getPersonsAppd();
    }

    public PersonAppd getPersonAppdById(Long id) {
        return personRepositoryAppd.getPersonAppdById(id);
    }

    public PersonAppd updatePersonAppd(Long id, PersonAppd personAppd) {
        return personRepositoryAppd.updatePersonAppd(id, personAppd);
    }

    public void deletePersonAppd(Long id) {
        personRepositoryAppd.deletePersonAppd(id);
    }



}
