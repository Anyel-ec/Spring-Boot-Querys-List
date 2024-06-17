package top.anyel.querys.repositories_appd;

import org.springframework.stereotype.Repository;
import top.anyel.querys.models_appd.PatientAppd;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepositoryAppd {

    List<PatientAppd> patients = new ArrayList<>();

    public List<PatientAppd> getPatientsAppd() {
        return patients;
    }


    public PatientAppd savePatientAppd(PatientAppd patient) {
        patients.add(patient);
        return patient;
    }

    public List<PatientAppd> searchWithNum23Appd() {
        List<PatientAppd> patientsWithNum23 = new ArrayList<>();
        for (PatientAppd patient : patients) {
            if (patient.getIdentification_appd().contains("23")) {
                patientsWithNum23.add(patient);
            }
        }
        return patientsWithNum23;
    }

    public List<PatientAppd> getPatientsInCityAppd(String city_appd) {
        List<PatientAppd> patientsInCity = new ArrayList<>();
        for (PatientAppd patient : patients) {
            if (patient.getCity_appd().equals(city_appd)) {
                patientsInCity.add(patient);
            }
        }
        return patientsInCity;
    }
    public List<PatientAppd> getPatientMoreVisitAppd() {
        List<PatientAppd> patientsMoreVisit = new ArrayList<>();
        int max = 0;
        for (PatientAppd patient : patients) {
            if (patient.getVisits_appd().size() > max) {
                patientsMoreVisit.clear();
                patientsMoreVisit.add(patient);
                max = patient.getVisits_appd().size();
            } else if (patient.getVisits_appd().size() == max) {
                patientsMoreVisit.add(patient);
            }
        }
        return patientsMoreVisit;
    }

    public int countPatientsInCityAppd(String city_appd) {
        int count = 0;
        for (PatientAppd patient : patients) {
            if (patient.getCity_appd().equals(city_appd)) {
                count++;
            }
        }
        return count;
    }

    public String deletePatientStartLetter_av(String city_appd) {
        patients.removeIf(patient -> patient.getCity_appd().startsWith(city_appd));
        return "Patients with name that start with " + city_appd + " were deleted";
    }

}
