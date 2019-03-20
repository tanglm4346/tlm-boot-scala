package com.tlm.tlmbootscala.service.impl;

import com.tlm.tlmbootscala.mapper.MetaDatabaseMapper;
import com.tlm.tlmbootscala.pojo.MetaDatabase;
import com.tlm.tlmbootscala.service.MetaDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanglm
 * @date 2019-03-20 10:10
 * @Description:
 */
@Service
public class MetaDatabaseServiceImpl implements MetaDatabaseService {
    @Autowired
    private MetaDatabaseMapper metaDatabaseMapper;



    @Override
    public void save(MetaDatabase metaDatabase) {
        metaDatabaseMapper.insert(metaDatabase);
    }

    @Override
    public List<MetaDatabase> getMetaDatabaseList() {
        return metaDatabaseMapper.getMetaDatabaseList();
    }
}
