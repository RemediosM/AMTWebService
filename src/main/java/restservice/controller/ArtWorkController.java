package restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restservice.entity.ArtWork;
import restservice.repositoty.ArtWorkRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/artWorks")
public class ArtWorkController {
    @Autowired
    private ArtWorkRepository repository;

    @GetMapping
    public Iterable<ArtWork> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{artWorkId}")
    public Optional<ArtWork> find(@PathVariable("artWorkId") Long countryId) {
        return repository.findById(countryId);
    }

    @PostMapping(consumes = "application/json")
    public ArtWork create(@RequestBody ArtWork artWork) {
        return repository.save(artWork);
    }

}
