package com.tlm.tlmbootscala.controller

import com.tlm.tlmbootscala.pojo.MetaTable
import com.tlm.tlmbootscala.service.MetaTableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._


@RestController
@RequestMapping(Array("/metatable"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {


  @GetMapping(Array(""))
  def list(): java.util.List[MetaTable] = {
    metaTableService.getAll()
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
