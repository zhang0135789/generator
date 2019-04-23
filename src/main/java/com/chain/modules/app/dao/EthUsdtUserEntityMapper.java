package com.chain.modules.app.dao;

import com.chain.modules.app.entity.omni.EthUsdtUserEntity;

public interface EthUsdtUserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EthUsdtUserEntity record);

    int insertSelective(EthUsdtUserEntity record);

    EthUsdtUserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EthUsdtUserEntity record);

    int updateByPrimaryKey(EthUsdtUserEntity record);
}