package com.ada.aerolinea.aerolineaAdaV1.controller;

import com.ada.aerolinea.aerolineaAdaV1.model.*;
import com.ada.aerolinea.aerolineaAdaV1.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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


    @GetMapping(path = "base/{id_base}")
    public @ResponseBody
    Optional<Base> getBaseById (@PathVariable ("id_base") int id_base){ return baseRepository.findById(id_base); }
    @GetMapping(path = "pilot/{id_pilot}")
    public @ResponseBody
    Optional<Pilot> getPilotById (@PathVariable ("id_pilot")int id_pilot) { return pilotRepository.findById(id_pilot);}
    @GetMapping(path = "airplane/{id_airplane}")
    public @ResponseBody
    Optional<Airplane> getAirplaneById (@PathVariable ("id_airplane") int id_airplane) { return airplaneRepository.findById(id_airplane);}
    @GetMapping(path = "crew/{id_crew}")
    public @ResponseBody
    Optional<Crew> getCrewById (@PathVariable ("id_crew") int id_crew) { return crewRepository.findById(id_crew);}
    @GetMapping(path = "flight/{id_flight}")
    public @ResponseBody
    Optional<Flight> getFlightById (@PathVariable ("id_flight") int id_flight) { return flightRepository.findById(id_flight);}

    
}