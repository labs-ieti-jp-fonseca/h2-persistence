package ada.labs.lab3.services;
import ada.labs.lab3.models.Country;
import ada.labs.lab3.persistence.ICountryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final ICountryDAO countryDAO;

    @Autowired
    public CountryService(ICountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }

    public List<Country> obtenerTodos() {
        return countryDAO.findAll();
    }
}