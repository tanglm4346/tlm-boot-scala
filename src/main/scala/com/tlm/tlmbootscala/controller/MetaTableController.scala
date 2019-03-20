package com.tlm.tlmbootscala.controller

import com.tlm.tlmbootscala.pojo.{MetaDatabase, MetaTable}
import com.tlm.tlmbootscala.service.{MetaDatabaseService, MetaTableService}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._


@RestController
@RequestMapping(Array("/metatable"))
class MetaTableController @Autowired()(metaTableService: MetaTableService,metaDatabaseService: MetaDatabaseService) {


  @GetMapping(Array(""))
  def list(): java.util.List[MetaTable] = {
    metaTableService.getAll()
  }
  @GetMapping(Array("/database"))
  def dataList(): java.util.List[MetaDatabase] = {
    metaDatabaseService.getMetaDatabaseList
  }

  @PostMapping(Array(""))
  def sava(@ModelAttribute metaTable: MetaTable): Unit = {
    metaTableService.save(metaTable)
  }


  @GetMapping(Array("/{id}"))
  def getDetailById(@PathVariable("id")id:Long): MetaTable = {
    println(s"id:$id")
      metaTableService.getDetailById(id)
  }


}
