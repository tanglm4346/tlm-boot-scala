package com.tlm.tlmbootscala.service.impl

import com.tlm.tlmbootscala.mapper.MetaTableMapper
import com.tlm.tlmbootscala.pojo.MetaTable
import com.tlm.tlmbootscala.service.MetaTableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MetaTableServiceImpl @Autowired()(metaTableMapper:MetaTableMapper) extends MetaTableService{
  override def save(metaTable: MetaTable): Unit = {
    metaTableMapper.insert(metaTable)
  }

  override def getAll(): java.util.List[MetaTable] = {
    metaTableMapper.getAll()
  }

  override def getDetailById(id: Long): MetaTable = {
    metaTableMapper.getMetaTableById(id)
  }
}
