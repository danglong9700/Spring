package com.ifi.transport.controller;

import java.util.List;

import com.ifi.transport.entity.Shipment;
import com.ifi.transport.service.ShipmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShipmentController {
    @Autowired
    ShipmentService shipmentService;

    //Display mainpage
    @GetMapping(value = "/home")
    public String index(Model model){
        List<Shipment> listShipment = shipmentService.getAllShipment();
        model.addAttribute("shipment", listShipment);
        return "index";
    }

    //Display addpage
    @GetMapping(value ="/add")
    public String addPage(){
        return "add";
    }

    @PostMapping(value ="/add")
    public String add(@ModelAttribute Shipment shipment){
        shipmentService.saveShipment(shipment);
        return "redirect:/home";
    }
}
