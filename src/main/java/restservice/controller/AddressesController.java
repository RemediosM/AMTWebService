package restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restservice.entity.Address;
import restservice.repositoty.AddressesRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/addresses")
public class AddressesController {
    @Autowired
    private AddressesRepository repository;

    @GetMapping
    public Iterable<Address> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{addressId}")
    public Optional<Address> find(@PathVariable("addressId") Long addressId) {
        return repository.findById(addressId);
    }

    @PostMapping(consumes = "application/json")
    public Address create(@RequestBody Address address) {
        return repository.save(address);
    }
}
