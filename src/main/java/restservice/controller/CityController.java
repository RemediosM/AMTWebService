package restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restservice.entity.City;
import restservice.repositoty.CityRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/cities")
public class CityController {
    @Autowired
    private CityRepository repository;

    @GetMapping
    public Iterable<City> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{cityId}")
    public Optional<City> find(@PathVariable("cityId") Long cityId) {
        return repository.findById(cityId);
    }

    @PostMapping(consumes = "application/json")
    public City create(@RequestBody City city) {
        return repository.save(city);
    }

}
