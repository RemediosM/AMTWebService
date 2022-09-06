package restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restservice.entity.Meme;
import restservice.repositoty.MemeRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/memes")
public class MemeController {
    @Autowired
    private MemeRepository repository;

    @GetMapping
    public Iterable<Meme> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{memeId}")
    public Optional<Meme> find(@PathVariable("memeId") Long memeId) {
        return repository.findById(memeId);
    }

    @PostMapping(consumes = "application/json")
    public Meme create(@RequestBody Meme meme) {
        return repository.save(meme);
    }

}
