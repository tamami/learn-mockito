package lab.aikibo.model;

import lab.aikibo.services.StockService;
import lombok.Data;

import java.util.List;

/**
 * Created by tamami on 16/12/16.
 */
@Data
public class Portfolio {

    private StockService stockService;
    private List<Stock> stocks;

    public double getMaretValue() {
        double marketValue = 0.0;

        for(Stock stock:stocks) {
            marketValue += stockService.getPrice(stock) * stock.getQuantity();
        }
        return marketValue;
    }

}
