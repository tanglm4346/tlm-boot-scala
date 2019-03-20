package com.tlm.tlmbootscala.mapper

import com.tlm.tlmbootscala.pojo.MetaTable
import org.apache.ibatis.annotations.Mapper


@Mapper
trait MetaTableMapper {
  def getMetaTableById(id: Long): MetaTable


  def insert(metaTable:MetaTable):Unit

  def getAll():java.util.List[MetaTable]


}
