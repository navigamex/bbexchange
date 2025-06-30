package com.bbexchange.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户主表(User)实体类
 *
 * @author makejava
 * @since 2025-06-30 15:06:00
 */


@Data
@Builder@NoArgsConstructor@AllArgsConstructor
@TableName("user")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -67669894015671730L;

    @TableId(type = IdType.AUTO)
    private Long id;
/**
     * 用户名
     */
    private String username;
/**
     * 密码（存储哈希值，例如SHA256或bcrypt）
     */
    private String password;
/**
     * 盐值，建议使用更长的字符串或二进制
     */
    private String salt;

    private Date createAt;

    private Date updateAt;

}

