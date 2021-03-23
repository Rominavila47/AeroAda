package com.ada.aerolinea.aerolineaAdaV1.controller;

import com.ada.aerolinea.aerolineaAdaV1.model.*;
import com.ada.aerolinea.aerolineaAdaV1.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/aerolinea/ada/v1")
public class MainController {
    @Autowired
    private BaseRepository baseRepository;

    @Autowired
    private PilotRepository pilotRepository;

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Autowired
    private CrewRepository crewRepository;

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping (path = "base/all")
    public @ResponseBody
    Iterable <Base> getallbases(){
        return baseRepository.findAll();
    }
    @GetMapping (path = "pilot/all")
    public @ResponseBody
    Iterable<Pilot> getallpilots(){
        return pilotRepository.findAll();
    }
    @GetMapping(path = "airplane/all")
    public @ResponseBody
    Iterable<Airplane> getallairplanes(){
        return airplaneRepository.findAll();
    }
    @GetMapping(path = "crew/all")
    public @ResponseBody
    Iterable<Crew> getallcrews(){ return crewRepository.findAll(); }
    @GetMapping (path = "flight/all")
    public @ResponseBody
    Iterable<Flight> getallflights(){
        return flightRepository.findAll();
    }
}