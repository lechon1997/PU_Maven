package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.InvalidParameterException;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long suma(Long number1, Long number2){
        logger.info( "sumando {} + {}", number1, number2);
        return number1 + number2;
    }

    public Long resta(Long number1, Long number2){
        logger.info( "restando {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiplicacion(Long number1, Long number2){
        logger.info( "multiplicando {} * {}", number1, number2);
        return number1 * number2;
    }

    public Long division(Long number1, Long number2){
        logger.info( "dividiendo {} / {}", number1, number2);
        if(number2 == 0)
            throw new InvalidParameterException("No se puede divir entre 0");
        return number1 / number2;
    }
}
