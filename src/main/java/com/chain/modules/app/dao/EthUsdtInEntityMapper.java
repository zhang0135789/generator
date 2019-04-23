package com.chain.modules.app.dao;

import com.chain.modules.app.entity.omni.EthUsdtInEntity;

public interface EthUsdtInEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EthUsdtInEntity record);

    int insertSelective(EthUsdtInEntity record);

    EthUsdtInEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EthUsdtInEntity record);

    int updateByPrimaryKey(EthUsdtInEntity record);
}