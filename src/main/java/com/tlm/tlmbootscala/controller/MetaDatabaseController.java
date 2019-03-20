package com.tlm.tlmbootscala.controller;

import com.tlm.tlmbootscala.pojo.MetaDatabase;
import com.tlm.tlmbootscala.service.MetaDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tanglm
 * @date 2019-03-20 10:44
 * @Description:
 */
@RestController
@RequestMapping("/meta")
public class MetaDatabaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @PostMapping("/save")
    public String  save(MetaDatabase metaDatabase){
        try {
            metaDatabaseService.save(metaDatabase);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            return "FAIL";
        }
    }

    @GetMapping("/list")
    public List<MetaDatabase> list(){
       return metaDatabaseService.getMetaDatabaseList();
    }
}
