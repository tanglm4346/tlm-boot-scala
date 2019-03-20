package com.tlm.tlmbootscala.mapper;

import com.tlm.tlmbootscala.pojo.MetaDatabase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MetaDatabaseMapper {
    List<MetaDatabase>  getMetaDatabaseList();
    void insert(MetaDatabase metaDatabase);
}
