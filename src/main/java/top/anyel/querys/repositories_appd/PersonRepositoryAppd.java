package top.anyel.querys.repositories_appd;

import org.springframework.stereotype.Repository;
import top.anyel.querys.models_appd.PersonAppd;

import java.util.ArrayList;
import java.util.List;


@Repository
public class PersonRepositoryAppd {
    List<PersonAppd> persons_appd = new ArrayList<>();

    public PersonAppd savePersonAppd(PersonAppd person_appd) {
        persons_appd.add(person_appd);
        return person_appd;
    }

    public List<PersonAppd> getPersonsAppd() {
        return persons_appd;
    }

    public PersonAppd getPersonAppdById(Long id_appd) {
        for (PersonAppd person_appd : persons_appd) {
            if (person_appd.getId_appd().equals(id_appd)) {
                return person_appd;
            }
        }
        return null;
    }

    public PersonAppd updatePersonAppd(Long id_appd, PersonAppd person_appd) {
        return persons_appd.stream()
                .filter(person_appd1 -> person_appd1.getId_appd().equals(id_appd))
                .map(person_appd1 -> {
                    person_appd1.setName_appd(person_appd.getName_appd());
                    person_appd1.setBirthdate_appd(person_appd.getBirthdate_appd());
                    person_appd1.setIdentification_appd(person_appd.getIdentification_appd());
                    person_appd1.setAge_appd(person_appd.getAge_appd());
                    person_appd1.setSalary_appd(person_appd.getSalary_appd());
                    person_appd1.setCity_appd(person_appd.getCity_appd());
                    return person_appd1;
                })
                .findFirst()
                .orElse(null);
    }

    public void deletePersonAppd(Long id_appd) {
         persons_appd.removeIf(person_appd -> person_appd.getId_appd().equals(id_appd));
    }

}
