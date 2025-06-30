package com.bbexchange.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户主表(User)实体类
 *
 * @author makejava
 * @since 2025-06-30 15:05:10
 */
public class User implements Serializable {
    private static final long serialVersionUID = 558353511995491654L;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

}

