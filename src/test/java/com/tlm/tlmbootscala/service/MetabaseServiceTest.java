package com.tlm.tlmbootscala.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tlm.tlmbootscala.pojo.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tanglm
 * @date 2019-03-20 10:16
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MetabaseServiceTest {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSave(){
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setName("spark");
        metaDatabase.setLocation("hdfs://hadoop000:9200/");
        metaDatabaseService.save(metaDatabase);
    }


    @Test
    public void testList() throws  Exception{
        System.out.println(objectMapper.writeValueAsString(metaDatabaseService.getMetaDatabaseList()));
    }
}
