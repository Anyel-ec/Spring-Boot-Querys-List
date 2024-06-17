package top.anyel.querys.repositories_appd;

import org.springframework.stereotype.Repository;
import top.anyel.querys.models_appd.PersonAppd;

import java.time.LocalDate;
import java.time.Period;
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

    public int calculateAge(LocalDate birthdate) {
        if (birthdate == null) {
            return 0; // o lanzar una excepción si es necesario
        }
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    public String validationIdentificationEcuatorian(String identification) {
        // algoritmo de validación de cédula ecuatoriana
        if (identification == null || identification.length() != 10) {
            return "La cédula debe tener 10 dígitos";
        }
        try {
            int provinceCode = Integer.parseInt(identification.substring(0, 2));
            if (provinceCode < 1 || provinceCode > 24) {
                return "El código de provincia no es válido";
            }

            int thirdDigit = Character.getNumericValue(identification.charAt(2));
            if (thirdDigit >= 6) {
                return "El tercer dígito no puede ser mayor o igual a 6";
            }

            int[] coefficients = {2, 1, 2, 1, 2, 1, 2, 1, 2};
            int total = 0;

            for (int i = 0; i < coefficients.length; i++) {
                int digit = Character.getNumericValue(identification.charAt(i));
                int product = digit * coefficients[i];
                total += product > 9 ? product - 9 : product;
            }

            int lastDigit = Character.getNumericValue(identification.charAt(9));
            int validatorDigit = (10 - (total % 10)) % 10;
            if (lastDigit != validatorDigit) {
                return "El último dígito no es válido";
            }
            if (lastDigit == validatorDigit) {
                return "La cédula es válida";
            }
        } catch (NumberFormatException e) {
            return "Error!!!";
        }
        return "Error!!!";
    }

    public String searchEstadoByCite (String city_appd) {
        if (city_appd.equals("Quito")) {
            return "Pichincha";
        } else if (city_appd.equals("Guayaquil")) {
            return "Guayas";
        } else if (city_appd.equals("Cuenca")) {
            return "Azuay";
        } else if (city_appd.equals("Santo Domingo")) {
            return "Santo Domingo de los Tsáchilas";
        }

        else {
            return "No se encuentra la provincia";
        }
    }

    public int ageToRetire (LocalDate birthdate) {
        int age = calculateAge(birthdate);
        if (age < 65) {
            return 65 - age;
        } else {
            return 0;
        }
    }
}
