package com.calculator.controller;

import com.calculator.model.ResponseExtended;
import com.calculator.server.CalculatorExtendedServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorExtendedController {
    @Autowired
    private CalculatorExtendedServer responseServer;

    @RequestMapping(value = "/square/{number}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseExtended square(@PathVariable("number") int number) {
        return responseServer.calculateSquare(number, 2);
    }

    @RequestMapping(value = "/square/{number}/{power}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseExtended square(@PathVariable("number") int number, @PathVariable("power") int power) {
        return responseServer.calculateSquare(number, power);
    }

    @RequestMapping(value = "/factorial/{number}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseExtended factorial(@PathVariable("number") int number) {
        return responseServer.calculateFactorial(number);
    }

    @RequestMapping(value = "/prime/{number}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseExtended prime(@PathVariable("number") int number) {
        return responseServer.isPrime(number);
    }
}
