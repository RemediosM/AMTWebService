package restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restservice.entity.Author;
import restservice.repositoty.AuthorRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/authors")
public class AuthorController {
    @Autowired
    private AuthorRepository repository;

    @GetMapping
    public Iterable<Author> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{authorId}")
    public Optional<Author> find(@PathVariable("authorId") Long authorId) {
        return repository.findById(authorId);
    }

    @PostMapping(consumes = "application/json")
    public Author create(@RequestBody Author author) {
        return repository.save(author);
    }

}
