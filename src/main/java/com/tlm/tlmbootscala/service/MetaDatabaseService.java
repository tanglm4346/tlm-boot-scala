package com.tlm.tlmbootscala.service;

import com.tlm.tlmbootscala.pojo.MetaDatabase;

import java.util.List;

public interface MetaDatabaseService {

    void save(MetaDatabase metaDatabase);
    List<MetaDatabase> getMetaDatabaseList();


}
