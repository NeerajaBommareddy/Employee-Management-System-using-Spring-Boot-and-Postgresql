package com.example.demo.locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
    @Autowired
    LocationDaoImpl locationDaoImpl;

    @GetMapping("/getLocationById/{location_id}")
    public Locations getLocationById(@PathVariable int location_id) {
        Locations location = locationDaoImpl.getLocationById(location_id);
        return location;
    }
}
