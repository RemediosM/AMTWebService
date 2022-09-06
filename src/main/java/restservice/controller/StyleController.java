package restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restservice.entity.Style;
import restservice.repositoty.StyleRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/styles")
public class StyleController {
    @Autowired
    private StyleRepository repository;

    @GetMapping
    public Iterable<Style> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{styleId}")
    public Optional<Style> find(@PathVariable("styleId") Long styleId) {
        return repository.findById(styleId);
    }

    @PostMapping(consumes = "application/json")
    public Style create(@RequestBody Style style) {
        return repository.save(style);
    }

}
