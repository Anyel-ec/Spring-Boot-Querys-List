package top.anyel.querys.servicies_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.querys.models_appd.Patient;
import top.anyel.querys.repositories_appd.PatientRepository;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient) {
        return patientRepository.savePatient(patient);
    }

    public List<Patient> searchWithNum23() {
        return patientRepository.searchWithNum23();
    }

    public List<Patient> getPatientsAll() {
        return patientRepository.getPatients();
    }

    public List<Patient> getPatientsInCity(String city) {
        return patientRepository.getPatientsInCity(city);
    }



}
