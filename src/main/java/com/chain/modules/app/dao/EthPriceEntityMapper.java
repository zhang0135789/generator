package com.chain.modules.app.dao;

import com.chain.modules.app.entity.omni.EthPriceEntity;

public interface EthPriceEntityMapper {
    int insert(EthPriceEntity record);

    int insertSelective(EthPriceEntity record);
}