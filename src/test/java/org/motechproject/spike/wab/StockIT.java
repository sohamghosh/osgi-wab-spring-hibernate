package org.motechproject.spike.wab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app-context.xml")
public class StockIT {

    @Autowired
    private StockService stockService;

    @Test
    public void shouldFindStock() {
        Stock stock = stockService.findStock("google");
        assertNotNull(stock);
        assertEquals("GOOGLE", stock.getStockCode());
    }
}

