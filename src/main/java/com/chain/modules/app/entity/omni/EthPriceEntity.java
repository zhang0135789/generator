package com.chain.modules.app.entity.omni;

import java.math.BigDecimal;

public class EthPriceEntity {
    private Integer id;

    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}