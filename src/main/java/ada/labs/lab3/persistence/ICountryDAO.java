package ada.labs.lab3.persistence;

import ada.labs.lab3.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICountryDAO extends JpaRepository<Country, Long> {

}