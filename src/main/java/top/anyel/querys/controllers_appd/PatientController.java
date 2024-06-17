package top.anyel.querys.controllers_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.querys.models_appd.PatientAppd;
import top.anyel.querys.servicies_appd.PatientServiceAppd;

import java.util.List;

@RestController
@RequestMapping("/appd/patient")
public class PatientController {

    @Autowired
    private PatientServiceAppd patientServiceAppd;

    @PostMapping("/save")
    private PatientAppd savePatientAppd(@RequestBody PatientAppd patient) {
        return patientServiceAppd.savePatientAppd(patient);
    }

    @GetMapping("/")
    private List<PatientAppd> getAllPatientsAppd() {
        return patientServiceAppd.getPatientsAllAppd();
    }

    @GetMapping("/searchWithNum23")
    private List<PatientAppd> searchWithNum23Appd() {
        return patientServiceAppd.searchWithNum23Appd();
    }

    @GetMapping("/city")
    private List<PatientAppd> getPatientsInCity(@RequestParam String city_appd) {
        return patientServiceAppd.getPatientsInCityAppd(city_appd);
    }

    @GetMapping("/more/patients")
    public List<PatientAppd> getPatientMoreVisitAppd() {
        return patientServiceAppd.getPatientMoreVisitAppd();
    }

    @GetMapping("/count")
    public int countCity(@RequestParam String city_appd){
        return patientServiceAppd.countPatientsInCityAppd(city_appd);
    }

    @DeleteMapping("/delete")
    public String deleteLetter(@RequestParam String city_appd){
        return patientServiceAppd.deleteCityAppd(city_appd);
    }
}