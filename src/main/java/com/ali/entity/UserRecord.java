package com.ali.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * (UserRecord)表实体类
 *
 * @author mozartc。
 * @date 2020-07-18 10:15:34
 */
@Data
@ApiModel("(UserRecord)表实体类")
public class UserRecord extends Model<UserRecord> {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("邮箱")
    private String email;
}