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
    @RequestMapping("/{name}")
    public String findStock(@PathVariable String name) {
        Stock stock = stockService.findStock(name);
        return stock != null ? stock.toString() : "No record found.";
    }
}
