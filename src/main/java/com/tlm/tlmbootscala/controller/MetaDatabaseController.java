package com.tlm.tlmbootscala.controller;

import com.tlm.tlmbootscala.pojo.MetaDatabase;
import com.tlm.tlmbootscala.service.MetaDatabaseService;
import com.tlm.tlmbootscala.support.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
    public Result  save(MetaDatabase metaDatabase){
        try {
            metaDatabaseService.save(metaDatabase);
            return Result.success(null);
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(e.getMessage());
        }
    }

    @GetMapping("/list")
    public Result list(){
       return Result.success(metaDatabaseService.getMetaDatabaseList());
    }
}
