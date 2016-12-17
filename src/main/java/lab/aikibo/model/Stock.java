package lab.aikibo.model;

import lombok.Data;

/**
 * Created by tamami on 16/12/16.
 */
@Data
public class Stock {

    private String stockId;
    private String name;
    private int quantity;

    public Stock(String stockId, String name, int quantity) {
        this.stockId = stockId;
        this.name = name;
        this.quantity = quantity;
    }

}
