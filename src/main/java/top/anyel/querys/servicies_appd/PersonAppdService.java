package top.anyel.querys.servicies_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.querys.models_appd.PersonAppd;
import top.anyel.querys.repositories_appd.PersonRepositoryAppd;

import java.util.List;
import java.time.LocalDate;
import java.time.Period;
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

    public int calculateAge(LocalDate birthdate) {
        if (birthdate == null) {
            return 0; // o lanzar una excepción si es necesario
        }
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    public String validationIdentificationEcuatorian(String identification) {
        return personRepositoryAppd.validationIdentificationEcuatorian(identification);
    }

    public String searchEstadoByCity(String city) {
        return personRepositoryAppd.searchEstadoByCite(city);
    }

    public int ageToRetire(LocalDate birthdate) {
        return personRepositoryAppd.ageToRetire(birthdate);
    }



}
