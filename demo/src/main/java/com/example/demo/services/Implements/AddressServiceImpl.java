package com.example.demo.services.Implements;

import com.example.demo.entity.Address;
import com.example.demo.repositories.AddressRepo;
import com.example.demo.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo addressRepo;

    @Override
    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    @Override
    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    @Override
    public void update(Long id, Address a) {
        a.setId(id);
        addressRepo.save(a);
    }

    @Override
    public void delete(Long id) {
        addressRepo.deleteById(id);

    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepo.findById(id).get();
    }




}
