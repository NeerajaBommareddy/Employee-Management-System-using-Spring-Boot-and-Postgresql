package com.example.demo.locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDaoImpl implements LocationDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Locations save(Locations locations) {
        int loc_id=locations.getLocation_id();
        String street_address=locations.getStreet_address();
        String postal_code=locations.getPostal_code();
        String city=locations.getCity();
        String state=locations.getState_province();
        String sql="insert into employee.locations(loc_id, street_address,postal_code,city,state) values(?,?,?,?,?);";
        Locations res=jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Locations.class));
        return res;
    }

    @Override
    public Locations getLocationById(int location_id) {
        String sql="select * from employee.locations where location_id=?;";
        Locations locations=jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Locations.class),location_id);
        return locations;
    }
}
