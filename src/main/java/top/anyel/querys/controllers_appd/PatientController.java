package top.anyel.querys.controllers_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.querys.models_appd.Patient;
import top.anyel.querys.servicies_appd.PatientService;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/save")
    private Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @GetMapping("/")
    private List<Patient> getAllPatients() {
        return patientService.getPatientsAll();
    }

    @GetMapping("/searchWithNum23")
    private List<Patient> searchWithNum23() {
        return patientService.searchWithNum23();
    }

    @GetMapping("/city/{city}")
    private List<Patient> getPatientsInCity(@PathVariable String city) {
        return patientService.getPatientsInCity(city);
    }
}
