package com.calculator.controller;

import com.calculator.model.ResponseSimple;
import com.calculator.server.CalculatorSimpleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class CalculatorSimpleController {
    @Autowired
    private CalculatorSimpleServer simpleServer;

    @RequestMapping(value = "/add", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseSimple addition(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return simpleServer.add(num1, num2);
    }

    @RequestMapping(value = "/subtract", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseSimple subtraction(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return simpleServer.subtract(num1, num2);
    }

    @RequestMapping(value = "/multiply", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseSimple multiply(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return simpleServer.multiply(num1, num2);
    }

    @RequestMapping(value = "/divide", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Object division(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        if (num2 == 0) return "<message>Division by 0 is not possible insert another number.</message>";

        return simpleServer.divide(num1, num2);
    }

    @RequestMapping(value = "/calc", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseSimple division(@RequestParam("exp") String exp) {
        exp = exp.replace('p','+');
        return simpleServer.evaluate(exp);
    }


}
