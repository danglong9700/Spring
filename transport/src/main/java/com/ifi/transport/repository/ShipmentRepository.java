package com.ifi.transport.repository;

import com.ifi.transport.entity.Shipment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer>{
    
    
}
