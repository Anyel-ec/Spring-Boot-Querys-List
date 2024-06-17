package top.anyel.querys.controllers_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.anyel.querys.models_appd.PersonAppd;
import top.anyel.querys.servicies_appd.PersonAppdService;

import java.net.URI;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    @Autowired
    private PersonAppdService personAppdService;
    @GetMapping("/")
    public ResponseEntity<Void> index() {
        try {
            return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("/swagger-ui.html")).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/persons")
    public ResponseEntity<?> getPersons() {
        return ResponseEntity.ok(personAppdService.getPersonsAppd());
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<?> getPersonById(@PathVariable Long id) {
        return ResponseEntity.ok(personAppdService.getPersonAppdById(id));
    }

    @PostMapping("/person")
    public ResponseEntity<?> savePerson(@RequestBody PersonAppd personAppd) {
        return ResponseEntity.ok(personAppdService.save(personAppd));
    }

    @PutMapping("/person/{id}")
    public ResponseEntity<?> updatePerson(@RequestParam Long id, @RequestBody PersonAppd personAppd) {
        return ResponseEntity.ok(personAppdService.updatePersonAppd(id, personAppd));
    }

    @DeleteMapping("/person/{id}")
    public ResponseEntity<?> deletePerson(@RequestParam Long id) {
        personAppdService.deletePersonAppd(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/person/age")
    public ResponseEntity<?> calculateAge(@RequestParam Long id) {
        return ResponseEntity.ok("la edad es "+ personAppdService.calculateAge(personAppdService.getPersonAppdById(id).getBirthdate_appd()));
    }

    @GetMapping("/person/validar/{identification}")
    public ResponseEntity<?> validationIdentificationEcuatorian(@PathVariable String identification) {
        return ResponseEntity.ok(personAppdService.validationIdentificationEcuatorian(identification));
    }

    @GetMapping("/person/estado/{city}")
    public ResponseEntity<?> searchEstadoByCity(@PathVariable String city) {
        return ResponseEntity.ok(personAppdService.searchEstadoByCity(city));
    }

    @GetMapping("/person/retire/{id}")
    public ResponseEntity<?> ageToRetire(@PathVariable Long id) {
        LocalDate birthdate = personAppdService.getPersonAppdById(id).getBirthdate_appd();
        return ResponseEntity.ok(personAppdService.ageToRetire(birthdate));

    }



}
