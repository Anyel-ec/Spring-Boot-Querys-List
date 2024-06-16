package top.anyel.querys.controllers_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.anyel.querys.models_appd.PersonAppd;
import top.anyel.querys.servicies_appd.PersonAppdService;

import java.net.URI;

@Controller
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
    public ResponseEntity<?> getPersonById(Long id) {
        return ResponseEntity.ok(personAppdService.getPersonAppdById(id));
    }

    @PostMapping("/person")
    public ResponseEntity<?> savePerson(PersonAppd personAppd) {
        return ResponseEntity.ok(personAppdService.save(personAppd));
    }

    @PutMapping("/person/{id}")
    public ResponseEntity<?> updatePerson(Long id, PersonAppd personAppd) {
        return ResponseEntity.ok(personAppdService.updatePersonAppd(id, personAppd));
    }

    @DeleteMapping("/person/{id}")
    public ResponseEntity<?> deletePerson(Long id) {
        personAppdService.deletePersonAppd(id);
        return ResponseEntity.ok().build();
    }


}
