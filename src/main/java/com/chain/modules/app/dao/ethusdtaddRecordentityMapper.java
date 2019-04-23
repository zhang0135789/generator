package com.chain.modules.app.dao;

import com.chain.modules.app.entity.omni.ethusdtaddRecordentity;

public interface ethusdtaddRecordentityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ethusdtaddRecordentity record);

    int insertSelective(ethusdtaddRecordentity record);

    ethusdtaddRecordentity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ethusdtaddRecordentity record);

    int updateByPrimaryKey(ethusdtaddRecordentity record);
}