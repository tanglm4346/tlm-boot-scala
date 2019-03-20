package com.tlm.tlmbootscala.pojo;

/**
 * @author tanglm
 * @date 2019-03-20 09:51
 * @Description: hive数据库的元数据
 */
public class MetaDatabase {


    private Long id;
    private String name;
    private String location;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
