package com.kuang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)  //开启链式写法
//所有实体类都要实现序列化，不然数据传输会有问题，中文乱码
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;//区分数据库

    public Dept(String dname){
        this.dname = dname;
    }
}
