package top.anyel.querys.repositories_appd;

import org.springframework.stereotype.Repository;
import top.anyel.querys.models_appd.Patient;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepository {

    List<Patient> patients = new ArrayList<>();
    public List<Patient> getPatients() {
        return patients;
    }

    public List<Patient> getPatientsByIdentification(String identification) {
        List<Patient> patientsByIdentification = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getIdentification().equals(identification)) {
                patientsByIdentification.add(patient);
            }
        }
        return patientsByIdentification;
    }
    public Patient savePatient(Patient patient) {
        patients.add(patient);
        return patient;
    }

    public List<Patient> searchWithNum23() {
        List<Patient> patientsWithNum23 = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getIdentification().contains("23")) {
                patientsWithNum23.add(patient);
            }
        }
        return patientsWithNum23;
    }

    public List<Patient> getPatientsInCity(String city) {
        List<Patient> patientsInCity = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getCity().equals(city)) {
                patientsInCity.add(patient);
            }
        }
        return patientsInCity;
    }
    public int calculatePatientsInCity(String city) {
        int count = 0;
        for (Patient patient : patients) {
            if (patient.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

    public List<Patient> getPatientsInProvince(String province) {
        List<Patient> patientsInProvince = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getProvince().equals(province)) {
                patientsInProvince.add(patient);
            }
        }
        return patientsInProvince;
    }

    public Patient getPatientMoreVisit() {
        Patient patientMoreVisit = null;
        int maxVisits = 0;
        for (Patient patient : patients) {
            if (patient.getVisits().size() > maxVisits) {
                maxVisits = patient.getVisits().size();
                patientMoreVisit = patient;
            }
        }
        return patientMoreVisit;
    }

    public String deletePatientStartLetter_av(String letter) {
        patients.removeIf(patient -> patient.getName().startsWith(letter));
        return "Patients with name that start with " + letter + " were deleted";
    }


}
