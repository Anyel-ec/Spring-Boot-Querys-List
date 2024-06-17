package top.anyel.querys.servicies_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.querys.models_appd.PatientAppd;
import top.anyel.querys.repositories_appd.PatientRepositoryAppd;

import java.util.List;

@Service
public class PatientServiceAppd {

    @Autowired
    private PatientRepositoryAppd patientRepositoryAppd;

    public PatientAppd savePatientAppd(PatientAppd patient) {
        return patientRepositoryAppd.savePatientAppd(patient);
    }

    public List<PatientAppd> searchWithNum23Appd() {
        return patientRepositoryAppd.searchWithNum23Appd();
    }

    public List<PatientAppd> getPatientsAllAppd() {
        return patientRepositoryAppd.getPatientsAppd();
    }

    public List<PatientAppd> getPatientsInCityAppd(String city_appd) {
        return patientRepositoryAppd.getPatientsInCityAppd(city_appd);
    }

    public List<PatientAppd> getPatientMoreVisitAppd() {
        return patientRepositoryAppd.getPatientMoreVisitAppd();
    }

    public int countPatientsInCityAppd(String city) {
        return patientRepositoryAppd.countPatientsInCityAppd(city);
    }

    public String deleteCityAppd(String city_appd){
        return patientRepositoryAppd.deletePatientStartLetter_av(city_appd);
    }



}
