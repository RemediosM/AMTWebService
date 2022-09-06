package restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restservice.entity.Country;
import restservice.repositoty.CountryRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/countries")
public class CountryController {
    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Iterable<Country> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{countryId}")
    public Optional<Country> find(@PathVariable("countryId") Long countryId) {
        return repository.findById(countryId);
    }

    @PostMapping(consumes = "application/json")
    public Country create(@RequestBody Country country) {
        return repository.save(country);
    }

}
