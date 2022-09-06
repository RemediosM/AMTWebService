package restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restservice.entity.Museum;
import restservice.repositoty.MuseumRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/museums")
public class MuseumController {
    @Autowired
    private MuseumRepository repository;

    @GetMapping
    public Iterable<Museum> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{museumId}")
    public Optional<Museum> find(@PathVariable("museumId") Long museumId) {
        return repository.findById(museumId);
    }

    @PostMapping(consumes = "application/json")
    public Museum create(@RequestBody Museum museum) {
        return repository.save(museum);
    }

}
