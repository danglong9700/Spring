package com.ifi.transport.service;

import java.util.List;

import com.ifi.transport.entity.Shipment;
import com.ifi.transport.repository.ShipmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShipmentService {
    @Autowired
    ShipmentRepository shipmentRepository;

    public List<Shipment> getAllShipment(){
        return shipmentRepository.findAll();
    }

    public void saveShipment(Shipment shipment){
        shipmentRepository.save(shipment);
    }

    public void deleteShipment(Shipment shipment){
        shipmentRepository.delete(shipment);
    }
}
