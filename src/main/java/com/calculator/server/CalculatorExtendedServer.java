package com.calculator.server;

import com.calculator.model.ResponseExtended;
import org.springframework.stereotype.Repository;

@Repository
public class CalculatorExtendedServer {

    public ResponseExtended calculateSquare(int number, int pow){
        ResponseExtended obj = new ResponseExtended(number, "");
        String message;

        message = (pow == 2) ? "Square of number "+ number+ " is : "+ Math.pow(number, pow) : "Number "+ number+ " on power of "+pow+ " is : "+ Math.pow(number, pow);
        obj.setMessage(message);
        return obj;
    }

    public ResponseExtended calculateFactorial(int number){
        ResponseExtended obj = new ResponseExtended(number, "");
        long currentResult = 1;
        for (int i = 2; i <= number; i++)
            currentResult = currentResult * i;

        obj.setMessage("Factorial of number " + number + " is : "+ currentResult);
        return obj;
    }

    public ResponseExtended isPrime(int number){
        ResponseExtended obj = new ResponseExtended(number, "");
        for(int i = 2; i < number/2; i++){
            if(i % 2 == 0){
                obj.setMessage("The number " + number + " is not prime number.");
                break;
            }
        }
        if(obj.getMessage().length() == 0)
            obj.setMessage("The number " + number + " is prime number.");
        return obj;
    }
}
