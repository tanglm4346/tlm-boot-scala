package com.tlm.tlmbootscala.service

import com.tlm.tlmbootscala.pojo.MetaTable

trait MetaTableService {
  def getDetailById(id: Long): MetaTable

  def  save(metaTable:MetaTable):Unit

  def getAll():java.util.List[MetaTable]
}
