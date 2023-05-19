package com.example.demo.services;

import com.example.demo.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAddress();

    void addAddress(Address address);

    void update(Long id, Address a);

    void delete(Long id);

    Address getUserById(Long id);
}
