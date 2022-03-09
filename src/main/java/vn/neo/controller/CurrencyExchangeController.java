package vn.neo.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.neo.dto.CurrencyExchangeDto;

/**
 * @author thanglv on 3/9/2022
 * @project currency-exchange-service
 */
@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {
    private final Environment environment;

    public CurrencyExchangeController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/from/{from}/to/{to}")
    public CurrencyExchangeDto exchange(@PathVariable String from, @PathVariable String to) {
        CurrencyExchangeDto curr = new CurrencyExchangeDto();
        curr.setEnvironment("FROM exchange:" + environment.getProperty("local.server.port", "UNKNOW"));
        curr.setConversionMultiple(8000);
        curr.setFrom(from);
        curr.setTo(to);
        return curr;
    }
}
