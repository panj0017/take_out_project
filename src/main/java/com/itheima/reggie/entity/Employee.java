package com.itheima.reggie.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String name;

    private String password;

    private String phone;

    private String sex;

    private String idNumber;//身份证号码

    private Integer status;

    @TableField(fill = FieldFill.INSERT) //插入时填充字段
    private LocalDateTime createTime;//创建此次记录的时间

    @TableField(fill = FieldFill.INSERT_UPDATE) //插入和更新时填充字段
    private LocalDateTime updateTime;//更新时间

    @TableField(fill = FieldFill.INSERT)//插入时填充字段
    private Long createUser;//创建这条记录的人

    @TableField(fill = FieldFill.INSERT_UPDATE)//插入和更新时填充字段
    private Long updateUser;//更新这条记录的人

}
