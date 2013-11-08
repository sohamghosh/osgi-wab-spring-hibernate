package org.motechproject.spike.wab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    @ResponseBody
    @RequestMapping("/find/{name}")
    public String findStock(@PathVariable String name) {
        Stock stock = stockService.findStock(name);
        return stock != null ? stock.toString() : "No record found.";
    }

    @ResponseBody
    @RequestMapping("/create/{name}")
    public String createStock(@PathVariable String name) {
        stockService.createStock(name);
        return "Stock [" + name + "] created.";
    }
}
