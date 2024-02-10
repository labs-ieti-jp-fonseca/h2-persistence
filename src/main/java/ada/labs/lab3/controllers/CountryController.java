package ada.labs.lab3.controllers;


import ada.labs.lab3.models.Country;
import ada.labs.lab3.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService){
        this.countryService = countryService;
    }

    @GetMapping()
    public ResponseEntity<List<Country>> getSomething(){
        return ResponseEntity.ok(countryService.obtenerTodos());
    }
}
