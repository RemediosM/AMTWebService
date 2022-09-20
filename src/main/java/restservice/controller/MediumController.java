package restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restservice.entity.Medium;
import restservice.repositoty.MediumRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/mediums")
public class MediumController {
    @Autowired
    private MediumRepository repository;

    @GetMapping
    public Iterable<Medium> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{mediumId}")
    public Optional<Medium> find(@PathVariable("mediumId") Long mediumId) {
        return repository.findById(mediumId);
    }

    @PostMapping(consumes = "application/json")
    public Medium create(@RequestBody Medium medium) {
        return repository.save(medium);
    }

}
