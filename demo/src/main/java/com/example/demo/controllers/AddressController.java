package com.example.demo.controllers;

import com.example.demo.entity.Address;
import com.example.demo.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAllAddress()
    {
       return addressService.getAddress();
    }

    @PostMapping
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Address A)
    {
        addressService.update(id, A);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id)
    {
        addressService.delete(id);
    }

    @GetMapping
    public Address getAddressById(@PathVariable Long id)
    {
        return addressService.getUserById(id);
    }





}
