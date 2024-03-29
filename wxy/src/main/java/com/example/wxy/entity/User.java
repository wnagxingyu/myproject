package com.example.wxy.entity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.ToString;
import java.util.Date;


@Data
public class User {

    private int id;
    private String username;
    private String password;
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private int Deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date updatetime;

}




